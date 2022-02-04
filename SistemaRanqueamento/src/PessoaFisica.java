
public class PessoaFisica extends Pessoa {

	private int idade;
	private String cpf;
	static int idIncrementavel=1;

	public PessoaFisica() {
		idIncrementavel=super.gerarNovoId(idIncrementavel);
	}

	public PessoaFisica(Endereco endereco,int idade,String cpf) {
		super(endereco);
		super.id = idIncrementavel;
		this.idade=idade;
		this.cpf=cpf;
		idIncrementavel=super.gerarNovoId(idIncrementavel);
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public NivelDeRisco getNivelDeRisco() {

		if(this.idade<18) return NivelDeRisco.ALTO;
		
		if(this.idade>18 && this.idade<40) return NivelDeRisco.MEDIO;
		
		return NivelDeRisco.BAIXO;
	}
}
