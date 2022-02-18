package conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import interfaces.CrudDAO;
import models.Cidade;

public final class CidadesDAO implements CrudDAO {

	public void insert(Cidade cidade) {

		StringBuilder sql = new StringBuilder();
		
		sql.append("insert into cidades (descricao) values (?) ;");
		
		try(Connection connection = UtilsConnection.obterConexao();
			PreparedStatement stm = connection.prepareStatement(sql.toString())){
			stm.setString(1, cidade.getDescricao());
			stm.execute();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	public void select(String cidade) {
		// TODO Auto-generated method stub
		
	}

	public void update(Cidade cidade) {
		// TODO Auto-generated method stub
		
	}

}
