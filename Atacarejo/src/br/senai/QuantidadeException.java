package br.senai;

public class QuantidadeException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public QuantidadeException(String string) {
	}

	public void LancaErro () {
		throw new QuantidadeException("A quantidade deve ser positiva");
	}
	
}
