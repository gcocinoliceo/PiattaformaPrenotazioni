package backend;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InterfaceDB {
	public static void InsertClassi(int id, String piano, int capacita) {
		try {

			Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/platformdb?user=root&password=cocito2022");

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
		ResultSet item = null;
		
		try {
				Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/platformdb?user=root&password=cocito2022");
	
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
	
	public static ResultSet GetAule() {
		ResultSet item = null;
		try {
				Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/platformdb?user=root&password=cocito2022");

				Statement stmt = connection.createStatement();

				String script="Select * from aula";
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
	
	public static void InsertInsegnanti(String nome, String email, String materia) {
		try {

			Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/platformdb?user=root&password=cocito2022");

			System.out.println("connessione aperta");

			Statement stmt = connection.createStatement();

			String script="INSERT INTO insegnante (nome, email, materia) VALUES ('" + nome + "', '" + email + "', '" + materia + "')";

			stmt.executeUpdate(script);

			stmt.close();

			connection.close();

			}

			catch(SQLException ex) {

			ex.printStackTrace();

			}
	}
	
	public static void InsertCorso(String nome, String descrizione, int bloccoOrario, int IDinsegnante, int IDaula) {
		try {

			Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/platformDB?user=root&password=cocito2022");

			System.out.println("connessione aperta");

			Statement stmt = connection.createStatement();

			String script="INSERT INTO corso (Nome, Descrizione, BloccoOrario, IDAula, IDInsegnante) VALUES ('" + nome + "', '" + descrizione + "', " + bloccoOrario + ", " + IDaula + ", " + IDinsegnante + " )";

			stmt.executeUpdate(script);

			stmt.close();

			connection.close();

			}

			catch(SQLException ex) {

			ex.printStackTrace();

			}
	}
	
	public static void InsertAula(String codice, int capacita) {
		try {

			Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/platformdb?user=root&password=cocito2022");

			System.out.println("connessione aperta // InsertAula");

			Statement stmt = connection.createStatement();

			String script="INSERT INTO aula (codice, capacita) VALUES ('" + codice + "', " + capacita + ")";

			stmt.executeUpdate(script);

			stmt.close();

			connection.close();

			}

			catch(SQLException ex) {

			ex.printStackTrace();

			}
	}
}
