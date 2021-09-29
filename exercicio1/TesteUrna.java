package exercicio1;

public class TesteUrna {

	public static void main(String[] args) {

		Candidato c1 = new Candidato(1, "Candidato 1", 1);
		Candidato c2 = new Candidato(2, "Candidato 2", 1);
		Candidato c3 = new Candidato(3, "Candidato 3", 1);
		
		Voto vt1 = new Voto(c1);
		Voto vt2 = new Voto(c1);
		Voto vt3 = new Voto(c1);
		Voto vt4 = new Voto(c2);
		Voto vt5 = new Voto(c2);
		Voto vt6 = new Voto(c3);
		
		Urna urna = new Urna(1, 2);
		
		urna.votar(vt1);
		urna.votar(vt2);
		urna.votar(vt3);
		urna.votar(vt4);
		urna.votar(vt5);
		urna.votar(vt6);
		
		urna.relatorio();
	}

}
