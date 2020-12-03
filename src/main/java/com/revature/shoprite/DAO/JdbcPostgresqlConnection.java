package com.revature.shoprite.DAO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcPostgresqlConnection {
    final String url = "jdbc:postgresql://localhost:5433/Shoprite";
    final String user = "postgres";
    final String password = "password123";


    public List viewAll(){
        List result = new ArrayList();
        try(Connection connection = DriverManager.getConnection(url,user,password);){
            if (connection != null){
                System.out.println("Connected to PostgreSQL server successfully");

                String sql = "SELECT * from employees";

                Statement statement = connection.createStatement();

                ResultSet results = statement.executeQuery(sql);

                while (results.next()){
                    result.add("Employee #" + Integer.toString(results.getInt("id")) + ": " + results.getString("first_name") +
                            " " + results.getString("last_name") + " the " + results.getString("job"));
                }
                return result;

            }
            else{
                result.add("Failed to connect to the PostgreSQL server");
                return (result);
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
            result.add("Refresh Page Please");
            return (result);
        }
    }

    public void change(int id1, String job1){
        try(Connection connection = DriverManager.getConnection(url,user,password);){
            if (connection != null){
                System.out.println("Connected to PostgreSQL server successfully");

                String sql = "UPDATE employees SET job=(?) WHERE id=(?)";

                PreparedStatement statement = connection.prepareStatement(sql);

                statement.setString(1,job1);
                statement.setInt(2,id1);

                ResultSet results = statement.executeQuery();

            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

                    //SQL select based on ID number, change job to equal new job
    }

    public void fire(int id1){
        try(Connection connection = DriverManager.getConnection(url,user,password);){
            if (connection != null){
                System.out.println("Connected to PostgreSQL server successfully");

                String sql = "DELETE from employees WHERE id=(?)";

                PreparedStatement statement = connection.prepareStatement(sql);

                statement.setInt(1,id1);

                statement.executeQuery();

            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        //SQL select based on ID number, delete the whole row
    }
    public void addEmployee(String firstName, String lastName, String job1){
        try(Connection connection = DriverManager.getConnection(url,user,password);){
            if (connection != null){
                String sql = "INSERT INTO employees (first_name, last_name, job) VALUES (?, ?, ?)";

                PreparedStatement statement = connection.prepareStatement(sql);

                statement.setString(1, firstName);
                statement.setString(2, lastName);
                statement.setString(3, job1);


                statement.executeQuery();

            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }


    }


}
