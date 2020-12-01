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
            return ("0");
        }
    }

    public void change(String name, String job){
    }

    public void fire(String name){
    }


}
