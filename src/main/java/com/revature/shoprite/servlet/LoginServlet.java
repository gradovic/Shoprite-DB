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

        PrintWriter writer = response.getWriter();


        JdbcPostgresqlConnection jdbcPostgresqlConnection = new JdbcPostgresqlConnection();
        writer.println(jdbcPostgresqlConnection.viewAll());






//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//        String personToChange = request.getParameter("personToChange");
//        String newJob = request.getParameter("newJob");



  //      System.out.println("username: " + username);
    //    System.out.println("password: " + password);
      //  PrintWriter writer = response.getWriter();
        //if (username.equals("Bob") && password.equals("password")){

          //  String htmlRespone = "<html>";
            //htmlRespone += "<h2>Your username is: " + username + "<br/>";
//            htmlRespone += "Your password is: " + password + "<br/>";
  //          htmlRespone += "Your coworkers are:" + "<br/>";

    //        JdbcPostgresqlConnection jdbcPostgresqlConnection = new JdbcPostgresqlConnection();
      //      htmlRespone += (jdbcPostgresqlConnection.viewAll());


        //    htmlRespone += "</h2>";
          //  htmlRespone += "</html>";

            // return response
            //writer.println(htmlRespone);
        }

        /*
        'Andy' is a placeholder for the admins.
        Do everything that Bob can do, but also gain the
        ability to select an employee by name and change their job.
         */

/*        else if (username.equals("Andy") && password.equals("password")){

            for (Employee employee: employees){
                if (employee.getName().equals(personToChange)){
                    employee.setJob(newJob);
                }
            }

            String htmlRespone = "<html>";
            htmlRespone += "<h2>Your username is: " + username + "<br/>";
            htmlRespone += "Your password is: " + password + "<br/>";
            htmlRespone += "You are the admin <br/>";
            htmlRespone += "Your employees are:" + "<br/>";
            for (Employee employee: employees){
                htmlRespone += (employee) + "<br/>";
            }
                    htmlRespone += "</html>";

            // return response
            writer.println(htmlRespone);
        }
*/



        /*
        Initialize the employees, and put them all in an arraylist.
        In future updates, initialize them as an SQL table instead.
         */


/*        Employee employee1 = new Employee(1, "Andrew", "Associate");
        Employee employee2 = new Employee(2, "Billy", "Bagger");
        Employee employee3 = new Employee(3, "Carl", "Cashier");
        Employee employee4 = new Employee(4, "Dylan", "Manager");

        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
*/

        /*
        Connect to the servlet. Initialize variables based on the userinput.
        */

        /*
        'Bob' is a placeholder for all non-admin users.
        Return a list of all coworkers, but do not give this user
        the ability to change anything.
         */
        /*
        If the username and/or password is incorrect, don't let the user do anything.
         */

//        else{
  //              writer.println("<div class=\"popup\" onclick=\"myFunction()\">" +
    //            "  <span class=\"popuptext\" id=\"myPopup\">Wrong Username or Password</span>\n" +
      //          "</div>");
        //        }
        //}
}
