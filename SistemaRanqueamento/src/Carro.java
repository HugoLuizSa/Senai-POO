
public class Carro extends Veiculo {

	private NumeroPortasCarro numeroPortasCarro;
	static int idIncrementavel=1;
	
	public Carro() {
		super.id=super.gerarNovoId(idIncrementavel);
	}

	public Carro(String fabricante, String renavam, int ano, double valor) {
		super(fabricante, renavam, ano, valor);
		super.id=idIncrementavel;
		this.numeroPortasCarro = NumeroPortasCarro.PORTAS_4;
		idIncrementavel=super.gerarNovoId(idIncrementavel);
	}

	public Carro(String fabricante, String renavam, int ano, double valor, int numeroPortas) {
		super(fabricante, renavam, ano, valor);
		super.id=idIncrementavel;
		this.numeroPortasCarro = numeroPortas == 4 ? NumeroPortasCarro.PORTAS_4 : NumeroPortasCarro.PORTAS_2;
		idIncrementavel=super.gerarNovoId(idIncrementavel);
	}

	public NumeroPortasCarro getNumeroPortasCarro() {
		return numeroPortasCarro;
	}

	public void setNumeroPortasCarro(NumeroPortasCarro numeroPortasCarro) {
		this.numeroPortasCarro = numeroPortasCarro;
	}

	@Override
	public NivelDeRisco getNivelDeRisco() {

		if(this.valor<20000) return NivelDeRisco.BAIXO;
		
		if(this.valor>20000 && this.valor<55000) return NivelDeRisco.MEDIO;
		
		return NivelDeRisco.ALTO;
	}
	
}
