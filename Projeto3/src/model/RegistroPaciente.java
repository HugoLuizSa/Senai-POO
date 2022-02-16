package model;

import java.util.ArrayList;
import java.util.List;

import exceptions.NomeInvalidoException;
import exceptions.ValidaCodigoException;
import exceptions.ValidaIdadeException;
import interfaces.ValidadorRegistro;

public class RegistroPaciente {

	private int codigo;
	private String nomeCompleto;
	private int idade;
	private char tipo;
	private RegistroPaciente cloneRegistro;
	
	private List<ValidadorRegistro> validacoes= new ArrayList<>();

	public RegistroPaciente() {
	}
	
	public RegistroPaciente(RegistroPaciente registro) {
		this.cloneRegistro=registro;
	}

	public RegistroPaciente(int codigo, String nomeCompleto, int idade, char tipo) {

		this.codigo = codigo;
		this.nomeCompleto = nomeCompleto;
		this.idade = idade;
		this.tipo = tipo;
		
		try {
			this.carregarValidacoes();
			this.excutarValidacoes();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void carregarValidacoes () {
		this.validacoes.add(new NomeInvalidoException());
		this.validacoes.add(new ValidaCodigoException());
		this.validacoes.add(new NomeInvalidoException());
		this.validacoes.add(new ValidaIdadeException());
	}
	
	public void excutarValidacoes() throws Exception{
		this.validacoes.forEach(v->v.validarRegistroPaciente(this));
	}

	public int getCodigo() {
		return codigo;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public int getIdade() {
		return idade;
	}

	public char getTipo() {
		return tipo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setTipo(char tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		
		str.append("Codigo : "+this.codigo+",");
		str.append("Nome Completo : "+this.nomeCompleto+",");
		str.append("Idade : "+this.idade+",");
		str.append("Tipo : "+(this.tipo+"").toUpperCase()+",");
		
		return str.toString();
	}

	public RegistroPaciente getCloneRegistro() {
		return cloneRegistro;
	}
}
