package exercicio1;

public class Voto {

	private Candidato candidatoVotado;
	
	public Voto() {
		// TODO Auto-generated constructor stub
	}

	public Voto(Candidato candidatoVotado) {
		super();
		this.candidatoVotado = candidatoVotado;
	}

	public Candidato getCandidatoVotado() {
		return candidatoVotado;
	}

	public void setCandidatoVotado(Candidato candidatoVotado) {
		this.candidatoVotado = candidatoVotado;
	}

}
