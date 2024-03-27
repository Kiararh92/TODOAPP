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

/*

 */

@WebServlet(name = "ViewListServlet", urlPatterns = "/ViewListServlet")
public class ViewListServlet extends HttpServlet {

    public ViewListServlet() {
        super();
    }

    @Override
    public void init() throws ServletException {
        super.init();
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //String taskDescription = req.getParameter("taskDescription");

        //addTask.addTask(taskDescription);

        System.out.println("the POST request has been made to /ViewListServlet");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        switch (action) {
            case "add":
                break;
            case "delete":
                break;
            case "view":
                // Pulls viewTaskHibWeb method
                Hibernate hibernate = (Hibernate) getServletContext().getAttribute("hibernate");
                List<Task> tasks = hibernate.viewTaskHibWeb();


                req.setAttribute("tasks", tasks);
               // System.out.println("the GET request has been made to /ViewListServlet" + tasks);

                RequestDispatcher dispatcher = req.getRequestDispatcher("/viewList.jsp");
                dispatcher.forward(req,resp);

                System.out.println("the GET request has been made to /ViewListServlet" + tasks);
                break;
            default:
                break;
        }
        //sets the content type on website. from module vid. delete later
        resp.setContentType("text/html");
        //write/prints to the webpage from module vid. delete later
        resp.getWriter().println("Hello!");
    }

}
