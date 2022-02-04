
public abstract class Veiculo extends Entidade implements Ranqueavel {

	protected String fabricante;
	protected String renavam;
	protected int ano;
	protected double valor;

	public Veiculo() {
	}

	public Veiculo(String fabricante, String renavam, int ano, double valor) {
		this.fabricante = fabricante;
		this.renavam = renavam;
		this.ano = ano;
		this.valor = valor;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getRenavam() {
		return renavam;
	}

	public void setRenavam(String renavam) {
		this.renavam = renavam;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}
