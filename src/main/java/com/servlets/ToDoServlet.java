package com.servlets;

import com.spring24.todoapp.*;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

/**
 * This class represents the main Servlet for the Application.
 *
 * @author Kiara
 * @version 2.0
 */

@WebServlet(name = "ToDoServlet", urlPatterns = "/ToDoServlet")
public class ToDoServlet extends HttpServlet {

    public ToDoServlet() {
        super();
    }

    @Override
    public void init() throws ServletException {
        super.init();
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        switch (action) {
            case "add":
                AddTask addTask = (AddTask) getServletContext().getAttribute("addTask");

                    String subject = req.getParameter("subject");
                    System.out.println(subject);
                    addTask.addTask(subject);
                    req.setAttribute("subject", subject);
                    resp.sendRedirect("ToDoServlet?action=view");
                break;
            case "delete":
                Hibernate hibernate = (Hibernate) getServletContext().getAttribute("hibernate");

                int taskID = Integer.parseInt(req.getParameter("taskID"));
                System.out.println(taskID);
                hibernate.deleteTaskHib(taskID);
                resp.sendRedirect("ToDoServlet?action=view");
                break;
            default:
                break;
        }

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        switch (action) {
            case "view":
                // Pulls viewTaskHibWeb method
                Hibernate hibernate = (Hibernate) getServletContext().getAttribute("hibernate");
                List<Task> tasks = hibernate.viewTaskHibWeb();
                req.setAttribute("tasks", tasks);

                RequestDispatcher dispatcher = req.getRequestDispatcher("/viewList.jsp");
                dispatcher.forward(req,resp);
                break;
            default:
                break;
        }
    }

}
