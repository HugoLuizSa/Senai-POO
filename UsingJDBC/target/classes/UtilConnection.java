
public class UtilConnection {

	String url = "jdbc:postgresql://localhost:5432/postgres";
	Properties props = new Properties();
	props.setProperty("user","postgres");
	props.setProperty("password","root");
	props.setProperty("ssl","true");
	Connection conn = DriverManager.getConne 	ction(url, props);

	String url = "jdbc:postgresql://localhost/postgres?user=postgres&password=root&ssl=true";
	Connection conn = DriverManager.getConnection(url);
	
	public static Connection obterConexao() {
		Connection conn = DriverManager.getConnection(url);
		return conn;
	}
	
}
