package br.senai;

public class Produto implements Tributavel {

	private int id;
	private String descricao;
	private int quantidade;
	private double preco;
	private double icms;

	public Produto() {
	}

	public Produto(int codigo, String descricao, int quantidade, double preco, double icms) {
		this.id = codigo;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.preco = preco;
		this.icms = icms;
	}

	public int getCodigo() {
		return id;
	}

	public void setCodigo(int codigo) {
		this.id = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getIcms() {
		return icms;
	}

	public void setIcms(double icms) {
		this.icms = icms;
	}

	@Override
	public double getTributos(Tributavel tributavel) {
		// TODO Auto-generated method stub
		return 0;
	}

}
