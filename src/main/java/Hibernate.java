import Entity.Tasks;
import jakarta.persistence.*;

/**
 * Hibernate Class.
 * Initializes the connection with the database.
 *
 * Course: Software Development II
 * Professor: Professor Walauskis
 *
 * @author Kiara
 * @version 1.0
 */
public class Hibernate {
    private EntityManagerFactory entityManagerFactory;
    private int taskNumber;

    public void hibernateInit() {
        // creates an entitymanagerfactory and entityManager
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
            //entityManagerFactory.close();
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

//            Task task = (Task) entityManager.createNativeQuery("SELECT t FROM Tasks t WHERE t.taskNumber = :taskNumber", Task.class)
//                    .setParameter("taskNumber", taskNumber)
//                    .getSingleResult();
//
//            System.out.println(taskNumber);
//            entityManager.remove(entityManager.contains(task) ? task : entityManager.merge(task));

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
        // starts a transaction
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();
            Query totalTaskQuery = entityManager.createNativeQuery("SELECT COUNT(*) FROM Tasks");
            Number totalTasks = (Number) totalTaskQuery.getSingleResult();
            //totalTaskQuery.executeUpdate();
            System.out.println("There are currently a total of " + totalTasks + " tasks on the To-Do List.");


            //entityManager.persist(task);
            transaction.commit();
            //cleans up resources
        }finally {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            entityManager.close();
            //entityManagerFactory.close();
        }

    }

    public void close() {
        if(entityManagerFactory.isOpen()) {
            entityManagerFactory.close();
        }
    }
}


