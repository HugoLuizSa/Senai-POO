package interfaces;

import models.Cidade;

public interface CrudDAO {

	public void insert(Cidade cidade);

	public void delete(int id);

	public void select(String cidade);

	public void update(Cidade cidade);

}
