package com.servlets;

import com.spring24.todoapp.*;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

import java.util.ArrayList;

/**
 * This class represents the Servlet Context Listener for the To-Do Webapp.
 *
 * @author Kiara
 * @version 2.0
 */
@WebListener
public class WebInitializer implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        // performs the initializations for the web version
        ArrayList<Task> ToDoList = new ArrayList<>();
        ArrayList<Integer> idList = new ArrayList<>();
        Hibernate hibernate = new Hibernate();

        List list = new List(ToDoList);
        TaskNumber generator = new TaskNumber(idList);
        DeleteTask deleteTask = new DeleteTask(list, idList, hibernate);
        AddTask addTask = new AddTask(list, generator, hibernate);
        ViewList viewList = new ViewList(list, hibernate);

        sce.getServletContext().setAttribute("addTask",addTask);
        sce.getServletContext().setAttribute("deleteTask",deleteTask);
        sce.getServletContext().setAttribute("viewList",viewList);
        sce.getServletContext().setAttribute("hibernate",hibernate);
        sce.getServletContext().setAttribute("list",list);
        sce.getServletContext().setAttribute("generator", generator);

        hibernate.hibernateInit();
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }
}
