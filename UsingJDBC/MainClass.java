import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import org.postgresql.core.ConnectionFactory;
import org.postgresql.core.QueryExecutor;
import org.postgresql.util.HostSpec;

public class MainClass {

	public static void main(String[] args) {
		
//		String url = "jdbc:postgresql://localhost:5432/postgres";
//		 Connection connection = DriverManager.getConnection(url);
//			
//		connection.prepareStatement(url)
		
		try {
			Connection connection = UtilConnection.obterConexao();
			PreparedStatement stm = connection.prepareStatement(" select descricao from cidades ");
		
			ResultSet rs = stm.executeQuery();
			
			while(rs.next()) {
				String descricaoCidade = rs.getString("descricao");
				System.out.println(descricaoCidade);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
