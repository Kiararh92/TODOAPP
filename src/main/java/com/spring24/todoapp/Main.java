package com.spring24.todoapp;

import com.servlets.ViewListServlet;

import java.util.ArrayList;
/**
 * com.spring24.todoapp.Main class of the To-Do com.spring24.todoapp.List.
 * Initializes the application and starts the main menu.
 *
 * Course: Software Development II
 * Professor: Professor Walauskis
 *
 * @author Kiara
 * @version 4.0
 */

public class Main {
    public static void main(String[] args) {

        // Initializes the application components and dependencies.
        ArrayList<Task> ToDoList = new ArrayList<>();
        ArrayList<Integer> idList = new ArrayList<>();
        Hibernate hibernate = new Hibernate();

        List list = new List(ToDoList);
        TaskNumber generator = new TaskNumber(idList);
        DeleteTask deleteTask = new DeleteTask(list, idList, hibernate);
        AddTask addTask = new AddTask(list, generator, hibernate);
        ViewList viewList = new ViewList(list, hibernate);

        Menu menu = new Menu(ToDoList, idList, list, deleteTask, addTask, viewList, hibernate);
        ViewListServlet addTServlet = new ViewListServlet();

        hibernate.hibernateInit();
        // Starts the main application menu
        menu.toDoMenu();
    }
}
