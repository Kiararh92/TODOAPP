package com.spring24.todoapp;

import java.util.Scanner;
/**
 * This class represents the add feature.
 *
 * @author Kiara
 * @version 4.0
 */
public class AddTask {

    private final List list;

    private final TaskNumber generator;
    private final Hibernate hibernate;

    /**
     * Add a new task.
     *
     * @param list com.spring24.todoapp.List object that contains the task objects
     * @param generator An ArrayList of taskNumbers
     */
    public AddTask(List list, TaskNumber generator, Hibernate hibernate){
        this.list = list;
        this.generator = generator;
        this.hibernate = hibernate;
    }

    /**
     * Creates a new task via user-input.
     * Assigns a task number for that specific task.
     */
    public void addTask(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Add an new task:");
        String subject = scanner.nextLine();
        generator.assignID();
        int taskNumber = generator.getCurrentID();
        Task task = new Task(subject);
        list.addTask(task);
        hibernate.addTaskHib(task);
    }
}

