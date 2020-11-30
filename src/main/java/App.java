import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.plaf.nimbus.State;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

@WebServlet("/loginServlet")
public class App{
	public static void main(String[] args) {

		JdbcPostgresqlConnection jdbcPostgresqlConnection = new JdbcPostgresqlConnection();
		jdbcPostgresqlConnection.connect();







//			LoginServlet loginServlet = new LoginServlet();
//			loginServlet.doPost(HttpServletRequest request, HttpServletResponse response);
	}

}




/*		boolean isAdmin = false;

		//Initialize the users, then put them in an array
		Login nonAdmin = new Login("Andy", "password", true);
		Login admin = new Login("Bob", "password", false);
		ArrayList<Login> logins = new ArrayList<>();
		logins.add(nonAdmin);
		logins.add(admin);


		Scanner scanner = new Scanner(System.in);

		boolean loggedIn = false;

		//This loop is where we have the login function.
		//It constantly asks for the Username and Password.
		//You can only leave the loop by getting them both correct.
		//If you log in as an admin, the program will remember that.
		while (true) {
			System.out.println("enter your username");

			String name = scanner.nextLine();

			System.out.println(name);
			for (int i = 0; i < logins.size(); i++) {
				if (logins.get(i).getUsername().equals(name)) {
					System.out.println("enter your password");
					String password = scanner.nextLine();
					if (password.equals(logins.get(i).getPassword())) {
						System.out.println("You're in!");
						loggedIn = true;
						if (logins.get(i).getIsAdmin()) {
							System.out.println("you're the admin!");
							isAdmin = true;
						}
					}
				}
			}
			if (loggedIn){
				break;
			}
		}

		searcher(isAdmin);


	}

	public static void searcher(boolean isAdmin){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the ID number of the employee!");

		String ID = scanner.nextLine();
		ArrayList<Employee> employees = readFile();

		//output all of the employees
		showEmployees(employees);

		// Set Role of Employee
		int index = search(employees, ID);
		if(index == -1) {
			System.out.println("Employee not found Exception"); // we could make our own exception
		}else {
			if (isAdmin) {
				System.out.println("What job do you want employee number " + ID + " to have?");
				employees.get(index).setJob(scanner.nextLine());
				showEmployees(employees);
			}
		}



		//  how we can make this better:
		//
		//   listening for user input during runtimemenu, or user-friendly-ness
		//  giving them suggestions <--- extra feature
		scanner.close();

	}

	private static int search(ArrayList<Employee> employees, String ID) {
		int index = -1;
//		employees.forEach((employee) -> {
//
//		});
		for(Employee employee:employees) {
			index++;
			if(Integer.toString(employee.getID()).equals(ID)) {
				return index;
			}
		}
		return -1;

	}

	private static void showEmployees(ArrayList<Employee> employees) {
		for(Employee employee: employees) {
			System.out.println(employee);
		}
	}

	private static ArrayList<Employee> readFile(){
		ArrayList<Employee> employees = new ArrayList<>();
		FileReader fileReader = null;
		try {
			fileReader = new FileReader("db.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		try {
			while(bufferedReader.ready()) {

				String[] tokens = bufferedReader.readLine().split(",");
				employees.add(new Employee(Integer.parseInt(tokens[0]),tokens[1],tokens[2]));


			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return employees;

 */




/*					String sql = "INSERT INTO employees (first_name, last_name, job)"
							+ "VALUES (?,?,?)";
					PreparedStatement statement = connection.prepareStatement(sql);

					statement.setString(1,"John");
					statement.setString(2,"Doe");
					statement.setString(3,"Bagger");


					int rows = statement.executeUpdate();
					if (rows > 0){
						System.out.println("A new contact has been inserted.");
					}
*/
