package com.spring24.todoapp;

import java.util.ArrayList;

/**
 * This class represents the com.spring24.todoapp.List of To-Do com.spring24.todoapp.Task as a whole.
 *
 * @author Kiara
 * @version 3.0
 */
public class List<T> {
    public ArrayList<Task> ToDoList;

    /**
     * Complies an ArrayList of task objects
     *
     * @param ToDoList An ArrayList of task objects
     */
    public List(ArrayList<Task> ToDoList){
        this.ToDoList = ToDoList;
    }

    /**
     * Adds a specific task to the To-Do com.spring24.todoapp.List.
     *
     * @param task A task object
     */
    public void addTask( Task task) {
        ToDoList.add(task);
    }

    /**
     * Retrieves the list of all the task objects.
     *
     * @return each task in the To-Do com.spring24.todoapp.List
     */
    public ArrayList<Task> getTasks(){
        return ToDoList;
    }
}
