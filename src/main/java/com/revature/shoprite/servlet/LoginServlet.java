package com.revature.shoprite.servlet;

import com.revature.shoprite.DAO.JdbcPostgresqlConnection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;

@WebServlet("/ShopriteWorkers")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        JdbcPostgresqlConnection jdbcPostgresqlConnection = new JdbcPostgresqlConnection();


        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String idToChange = request.getParameter("idToChange");
        String newJob = request.getParameter("newJob");


        System.out.println("username: " + username);
        System.out.println("password: " + password);
        PrintWriter writer = response.getWriter();
        String htmlRespone = "<html>";

        if (username.equals("Bob") && password.equals("password")) {

            htmlRespone += "<h2>Your username is: " + username + "<br/>";
            htmlRespone += "Your password is: " + password + "<br/>";
            htmlRespone += "Your coworkers are:" + "<br/>";

            jdbcPostgresqlConnection.viewAll();
            htmlRespone += (jdbcPostgresqlConnection.viewAll());


            htmlRespone += "</h2>";
            htmlRespone += "</html>";

            // return response
            writer.println(htmlRespone);
        }

        /*
        'Andy' is a placeholder for the admins.
        Do everything that Bob can do, but also gain the
        ability to select an employee by name and change their job.
         */

        else if (username.equals("Andy") && password.equals("password")){
            if (!idToChange.equals("")) {
                if (newJob.equals("fire")){
                    jdbcPostgresqlConnection.fire(Integer.parseInt(idToChange));
                    htmlRespone += "fired a person";
                }
                else if (newJob.equals("add")){
                    jdbcPostgresqlConnection.addEmployee("Annie","Paulsen","Trainee");
                    htmlRespone += "added a person";
                }
                else {
                    jdbcPostgresqlConnection.change(Integer.parseInt(idToChange), newJob);
                    htmlRespone += "changed someone's job";
                }
            }

            htmlRespone += "<h2>Your username is: " + username + "<br/>";
            htmlRespone += "Your password is: " + password + "<br/>";
            htmlRespone += "You are the admin! <br/>";
            htmlRespone += "Your employees are:" + "<br/>";


            htmlRespone += (jdbcPostgresqlConnection.viewAll());
            htmlRespone += "</html>";

            // return response
            writer.println(htmlRespone);
        }
        else{
            htmlRespone += "Wrong username or password</html>";
            writer.println(htmlRespone);
        }
    }
}