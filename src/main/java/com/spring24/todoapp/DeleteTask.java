package com.spring24.todoapp;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * This class represents the delete feature.
 *
 * @author Kiara
 * @version 4.0
 *
 */
public class DeleteTask {


    private final List list;
    private final Hibernate hibernate;
    public ArrayList<Integer> idList;
    int taskID;


    /**
     * Delete a task via Task Number.
     *
     * @param list List object that contains the task objects
     * @param idList An ArrayList of taskNumbers
     */
    public DeleteTask(List list, ArrayList<Integer> idList, Hibernate hibernate) {
        this.list = list;
        this.idList = idList;
        this.hibernate = hibernate;
    }

    /**
     * Selects a task via task number.
     * Deletes the task from the ToDoList, along with its subject and task number.
     */
    public void removeViaTaskNumber() {

        Scanner scanner = new Scanner(System.in);
        boolean found = false;

        while(true) {
            System.out.println("Delete an task:");
            System.out.println("Task # of task:");
            taskID = scanner.nextInt();
            hibernate.deleteTaskHib(taskID);
            break;
        }
    }
}
