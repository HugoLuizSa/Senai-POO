package exercicio1;

public class Candidato {

	private int numero;
	private String nome;
	private int cargo;

	public Candidato() {
		// TODO Auto-generated constructor stub
	}

	public Candidato(int numero, String nome, int cargo) {
		this.numero = numero;
		this.nome = nome;
		this.cargo = cargo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCargo() {
		return cargo;
	}

	public void setCargo(int cargo) {
		this.cargo = cargo;
	}
	
	public String toString() {
		return
		"Candidato : "+this.getCargo()+"\n"+
		"Número: "+this.getCargo()+"\n"+
		"Cargo : "+this.getCargo()+"\n"+
		"Total de Votos: ";
	}

}
