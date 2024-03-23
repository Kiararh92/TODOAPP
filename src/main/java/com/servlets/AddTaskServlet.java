//package com.servlets;
//
//import com.spring24.todoapp.*;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//
//import java.io.IOException;
//import java.util.ArrayList;
//
//public class AddTaskServlet extends HttpServlet {
//
//    private Hibernate hibernate;
//    private List list;
//    private DeleteTask deleteTask;
//    private AddTask addTask;
//    private ViewList viewList;
//    private ArrayList<Task> ToDoList;
//    private ArrayList<Integer> idList;
//
//    public AddTaskServlet() {
//        super();
//    }
//
//    public void inti(ArrayList<Task> ToDoList, ArrayList<Integer> idList, List list, DeleteTask deleteTask,
//                     AddTask addTask, ViewList viewList, Hibernate hibernate) throws ServletException {
//        super.init();
//        this.idList = idList;
//        this.ToDoList = ToDoList;
//        this.list = list;
//        this.deleteTask = deleteTask;
//        this.addTask = addTask;
//        this.viewList = viewList;
//        this.hibernate = hibernate;
//    }
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        //
//        //String taskName = req.getParameter("taskName");
//        String taskDescription = req.getParameter("taskDescription");
//
//        addTask.addTask(taskDescription);
//
//
//    }
//}
