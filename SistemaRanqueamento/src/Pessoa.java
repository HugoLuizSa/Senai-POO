
public abstract class Pessoa extends Entidade implements Ranqueavel {

	protected int id;
	protected Endereco endereco;

	public Pessoa() {
	}

	public Pessoa(Endereco endereco) {
		this.endereco = endereco;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
