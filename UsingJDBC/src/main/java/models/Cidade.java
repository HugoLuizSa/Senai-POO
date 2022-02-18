package models;

public class Cidade {

	private int id;
	private String descricao;

	public Cidade() {
	}
	
	public Cidade(String descricao) {
		this.descricao = descricao;
	}

	public Cidade(int id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}

	public int getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
