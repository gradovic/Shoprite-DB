import com.revature.shoprite.DAO.JdbcPostgresqlConnection;

import javax.servlet.annotation.WebServlet;
import java.awt.Desktop;
import java.net.URI;
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

public class App{
	public static void main(String[] args) {

		JdbcPostgresqlConnection jdbcPostgresqlConnection = new JdbcPostgresqlConnection();
		jdbcPostgresqlConnection.addEmployee("John","Smith","Worker");

		System.out.println(jdbcPostgresqlConnection.viewAll());






	}

}