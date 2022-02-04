
public class Moto extends Veiculo {

	private int cilindradas;
	static int idIncrementavel;
	
	public Moto() {
	}
	
	public Moto(String fabricante, String renavam, int ano, double valor) {
		super(fabricante, renavam, ano, valor);
		super.id=idIncrementavel;
		this.cilindradas=125;
		idIncrementavel=super.gerarNovoId(idIncrementavel);
	}

	public Moto(String fabricante, String renavam, int ano, double valor,int cilindradas) {
		super(fabricante, renavam, ano, valor);
		super.id=idIncrementavel;
		this.cilindradas=cilindradas;
		idIncrementavel=super.gerarNovoId(idIncrementavel);
	}

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}
	
	@Override
	public NivelDeRisco getNivelDeRisco() {

		if(this.valor<10000) return NivelDeRisco.BAIXO;
		
		if(this.valor>10000 && this.valor<35000) return NivelDeRisco.MEDIO;
		
		return NivelDeRisco.ALTO;
	}

}
