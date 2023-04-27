package backend;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InterfaceDB {
	public static void InsertClassi(int id, String piano, int capacita) {
		try {

			Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/platformDB?user=root&password=cocito2022");

			System.out.println("connessione aperta");

			Statement stmt = connection.createStatement();

			String script="INSERT INTO aula (ID, piano, capacita) VALUES ()";

			stmt.executeUpdate(script);

			stmt.close();

			connection.close();

			}

			catch(SQLException ex) {

			ex.printStackTrace();

			}
	}
	public static ResultSet GetInsegnanti() {
		ResultSet item=null;
		try {

			Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/platformDB?user=root&password=cocito2022");

			System.out.println("connessione aperta");

			Statement stmt = connection.createStatement();

			String script="Select * from insegnante";
			System.out.println(script);
			item=stmt.executeQuery(script);
			
			stmt.close();

			connection.close();

			}

			catch(SQLException ex) {

			ex.printStackTrace();

			}
		return item;
	}
	
	public static void InsertInsegnanti() {
		try {

			Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/platformDB?user=root&password=cocito2022");

			System.out.println("connessione aperta");

			Statement stmt = connection.createStatement();

			String script="INSERT INTO insegnante (ID, nome, email, materia) VALUES ()";

			stmt.executeUpdate(script);

			stmt.close();

			connection.close();

			}

			catch(SQLException ex) {

			ex.printStackTrace();

			}
	}
	public static void InsertCorsi() {
		try {

			Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/platformDB?user=root&password=cocito2022");

			System.out.println("connessione aperta");

			Statement stmt = connection.createStatement();

			String script="INSERT INTO corso () VALUES (3,'Prova J connessione', 'Test desc')";

			stmt.executeUpdate(script);

			stmt.close();

			connection.close();

			}

			catch(SQLException ex) {

			ex.printStackTrace();

			}
	}
}
