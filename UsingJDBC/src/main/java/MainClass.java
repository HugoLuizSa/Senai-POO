import conexao.CidadesDAO;
import models.Cidade;

public class MainClass {

	public static void main(String[] args) {

//		try {
//			Connection connection = UtilsConnection.obterConexao();
//			PreparedStatement stm = connection.prepareStatement(" select descricao from cidades ");
//
//			ResultSet rs = stm.executeQuery();
//
//			while (rs.next()) {
//				String descricaoCidade = rs.getString("descricao");
//				System.out.println(descricaoCidade);
//			}
//
//		} catch (Exception e) {
//			e.printStackTrace();
		
		CidadesDAO cidadesDAO = new CidadesDAO();
		cidadesDAO.insert(new Cidade("Capivari de Baixo"));
	}
}
