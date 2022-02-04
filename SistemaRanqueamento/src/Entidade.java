
public abstract class Entidade {

	public int id;
	
	public int gerarNovoId(int id) {
		return id+1;
	}

	public int getId() {
		return id;
	}
	
}
