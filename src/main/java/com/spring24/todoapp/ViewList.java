package com.spring24.todoapp;

/**
 * This class represents the feature of viewing the whole To-Do com.spring24.todoapp.List
 * as one.
 *
 * @author Kiara
 * @version 2.0
 *
 */
public class ViewList {
    private final List list;
    private final Hibernate hibernate;

    /**
     * Constructs a com.spring24.todoapp.List of all the tasks.
     *
     * @param list com.spring24.todoapp.List object that contains the task objects
     */
    public ViewList(List list, Hibernate hibernate){
        this.list = list;
        this.hibernate = hibernate;
    }

    /**
     * Displays the tasks in the list.
     * Each task is printed with its task number followed by the task subject.
     */
    public void displayToDoList() {
        hibernate.viewTaskHib();
    }
}
