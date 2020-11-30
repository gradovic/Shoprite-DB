import java.sql.*;

public class JdbcPostgresqlConnection {
    public void connect(){
        final String url = "jdbc:postgresql://localhost:5433/Shoprite";
		final String user = "postgres";
		final String password = "password123";
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

						System.out.printf("%d - %s - %s - %s\n", id, firstName, lastName, job);
					}

				}
				else{
					System.out.println("Failed to connect to the PostgreSQL server");
				}
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
    }
}
