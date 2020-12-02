package com.revature.shoprite.DAO;
import java.sql.*;

public class JdbcPostgresqlConnection {
    final String url = "jdbc:postgresql://localhost:5433/Shoprite";
    final String user = "postgres";
    final String password = "password123";


    public String viewAll(){
        String result = "";
        try(Connection connection = DriverManager.getConnection(url,user,password);){
            if (connection != null){
                System.out.println("Connected to PostgreSQL server successfully");

                String sql = "SELECT * from employees";

                Statement statement = connection.createStatement();

                ResultSet results = statement.executeQuery(sql);

                while (results.next()){
                    int id = results.getInt("id");
                    String firstName = results.getString("first_name");
                    String lastName = results.getString("last_name");
                    String job = results.getString("job");

                    result += id + " - " + firstName + " - " + lastName + " - " + job + "\n";
                }
                return result;

            }
            else{
                return ("Failed to connect to the PostgreSQL server");
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
            return ("Refresh Page Please");
        }
    }

    public void change(int id1, String job1){
        try(Connection connection = DriverManager.getConnection(url,user,password);){
            if (connection != null){
                System.out.println("Connected to PostgreSQL server successfully");

                String sql = "UPDATE employees" +
                        "SET job=(?)" +
                        "WHERE id=(?)";

                PreparedStatement statement = connection.prepareStatement(sql);

                statement.setString(1,job1);
                statement.setInt(2,id1);

                statement.executeQuery();

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
