package br.senai;

public class NFVenda {

	private int codigo;
	private Cliente cliente;
	private String dataLancamento;
	private Produto produto;
	private int quantidade;

	public NFVenda() {
		descontarEstoque();
	}

	public NFVenda(int codigo, Cliente cliente, String dataLancamento, Produto produto, int quantidade) {
		this.codigo = codigo;
		this.cliente = cliente;
		this.dataLancamento = dataLancamento;
		this.produto = produto;
		this.quantidade = quantidade;
	}

	public int getCodigo() {
		return codigo;
	}

	private void descontarEstoque() {
		int estoque = this.produto.getQuantidade();
		estoque-=1;
		this.produto.setQuantidade(estoque);
	}
	
	public double Total() {
		return this.produto.getPreco() * this.quantidade;
	}

	public double valorImposto() {
		return this.produto.getPreco() * this.produto.getIcms();
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

}
