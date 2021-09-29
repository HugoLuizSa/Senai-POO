package exercicio1;

import java.util.ArrayList;
import java.util.Iterator;

public class Urna {

	private int secao;
	private int urna;
	private ArrayList<Voto> Votos = new ArrayList<>();

	public Urna() {
	}

	public Urna(int secao, int urna) {
		this.setSecao(secao);
		this.urna = urna;
	}

	public int getSecao() {
		return secao;
	}

	public void setSecao(int secao) {
		this.secao = secao;
	}

	public int getUrna() {
		return urna;
	}

	public void setUrna(int urna) {
		this.urna = urna;
	}

	public ArrayList<Voto> getVotos() {
		return Votos;
	}

	public void setVotos(ArrayList<Voto> votos) {
		this.Votos = votos;
	}

	public void votar(Voto voto) {
		Votos.add(voto);
	}

	@SuppressWarnings({ "unused" })
	public void relatorio() {

		StringBuilder str = new StringBuilder();

		ArrayList<Candidato> candidatosComputados = new ArrayList<>();

		Votos.forEach(voto -> {

			Candidato c = voto.getCandidatoVotado();
			int qtdVotosCanditado = 0;

			for (Voto votoCanditado : Votos) {
				if (votoCanditado.getCandidatoVotado().equals(voto.getCandidatoVotado())) {
					qtdVotosCanditado += 1;
				}
				continue;
			}

			// verificar se o candidato já foi computado
			if (!candidatosComputados.contains(c)) {
				System.out.println(c + "" + qtdVotosCanditado + "\n" + "=============");
				candidatosComputados.add(c);
			}

		});
	}

}
