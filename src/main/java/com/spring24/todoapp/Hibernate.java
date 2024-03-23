package com.spring24.todoapp;

import java.util.List;

import jakarta.persistence.*;

/**
 * com.spring24.todoapp.Hibernate Class.
 * Initializes the connection with the database.
 *
 * Course: Software Development II
 * Professor: Professor Walauskis
 *
 * @author Kiara
 * @version 2.0
 */
public class Hibernate {
    private EntityManagerFactory entityManagerFactory;
    private int taskNumber;

    public void hibernateInit() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("default");
    }

    public void addTaskHib(Task task) {

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        // starts a transaction
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();
            entityManager.persist(task);
            transaction.commit();
            //cleans up resources
        }finally {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            entityManager.close();
        }

    }

    public void deleteTaskHib(int taskNumber) {
        this.taskNumber = taskNumber;

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        // starts a transaction
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();
            String sql = "DELETE FROM Tasks WHERE taskNumber = :taskNumber";
            Query query = entityManager.createNativeQuery(sql);
            query.setParameter("taskNumber", taskNumber);

            int results = query.executeUpdate();
            System.out.println(results + " row(s) deleted.");

            transaction.commit();
            //cleans up resources
        }catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            entityManager.close();
        }

    }

    public void viewTaskHib() {

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try {

            //counts the total amount of tasks on a list.
            Query totalTaskQuery = entityManager.createNativeQuery("SELECT COUNT(*) FROM Tasks");
            Number totalTasks = (Number) totalTaskQuery.getSingleResult();
            System.out.println("There are currently a total of " + totalTasks + " tasks on the To-Do com.spring24.todoapp.List.");

            //Selecting all task and output results
            TypedQuery<Task> query = entityManager.createQuery("SELECT t FROM Task t", Task.class);
            List<Task> tasks = query.getResultList();

            //Checking if the list is empty
            if(tasks.isEmpty()) {
                System.out.println("No task on this To-Do com.spring24.todoapp.List.");
            } else {
                System.out.println("Listing all the tasks: ");
                for(Task task : tasks) {
                    System.out.println(task.getTaskNumber() + ":" + " " + task.getTask());
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            entityManager.close();
        }

    }

    public void close() {
        if(entityManagerFactory.isOpen()) {
            entityManagerFactory.close();
        }
    }
}


