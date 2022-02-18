package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UtilsConnection {

	static String url = "jdbc:postgresql://localhost:5432/postgres";
	static String user ="postgres";
	static String password="root";
	
	public static Connection obterConexao() {
		try {
			Connection conn = null;
			conn = DriverManager.getConnection(url, user, password);
			
			return conn;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
