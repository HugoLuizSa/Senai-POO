
public class PessoaJuridica extends Pessoa {

	private String nomeFantasia;
	private String razaoSocial;
	private String cnpj;
	private int tempoExistencia;
	private Endereco endereco;
	static int idIncrementavel=1;

	public PessoaJuridica() {
		idIncrementavel=super.gerarNovoId(idIncrementavel);
	}
	
	public PessoaJuridica(String nomeFantasia, String razaoSocial, String cnpj, Endereco endereco,int tempoExistencia) {
		super(endereco);
		super.id=idIncrementavel;
		this.nomeFantasia = nomeFantasia;
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.tempoExistencia=tempoExistencia;
		idIncrementavel=super.gerarNovoId(idIncrementavel);
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public int getTempoExistencia() {
		return tempoExistencia;
	}

	public void setTempoExistencia(int tempoExistencia) {
		this.tempoExistencia = tempoExistencia;
	}

	@Override
	public NivelDeRisco getNivelDeRisco() {

		if(this.tempoExistencia<3) return NivelDeRisco.ALTO;
		
		if(this.tempoExistencia>3 && this.tempoExistencia<6) return NivelDeRisco.MEDIO;
		
		return NivelDeRisco.BAIXO;
	}

}
