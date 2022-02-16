package service;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import model.RegistroPaciente;

public class RegistrosService {

	public List<RegistroPaciente> listaRegistroPaciente = new ArrayList<>();

	public RegistrosService() {
	}

	public RegistrosService(List<RegistroPaciente> listaRegistroPaciente) {
		this.listaRegistroPaciente = listaRegistroPaciente;
	}

	public List<RegistroPaciente> getListaRegistroPaciente() {
		return listaRegistroPaciente;
	}
	
	public void imprimirRegistros() {
		this.listaRegistroPaciente.forEach(registro->System.out.println(registro));
	}
	
	public void adicionarRegistro(RegistroPaciente listaRegistroPaciente) {
		RegistroPaciente registroAdicionar = new RegistroPaciente(listaRegistroPaciente).getCloneRegistro();
		
		this.listaRegistroPaciente.add(registroAdicionar);
	}
	
	public boolean isListaVazia() {
		return this.listaRegistroPaciente.isEmpty();
	}
	
	public List<RegistroPaciente> getDoadores () throws ArrayIndexOutOfBoundsException{
		
		if(isListaVazia()) {
			JOptionPane.showMessageDialog(null, "Lista se encontra Vazia");
			throw new ArrayIndexOutOfBoundsException("Lista vazia");
		}
		
		 List<RegistroPaciente> listaDoadores = this.listaRegistroPaciente
				 .stream()
				 .filter(registro->registro.getTipo()=='d' || registro.getTipo()=='D')
				 .toList();
		 
		return listaDoadores;
	}
	
	public List<RegistroPaciente> getReceptores () throws ArrayIndexOutOfBoundsException{
		
		if(isListaVazia()) {
			JOptionPane.showMessageDialog(null, "Lista se encontra Vazia");
			throw new ArrayIndexOutOfBoundsException("Lista vazia");
		}
		
		List<RegistroPaciente> listaReceptores = this.listaRegistroPaciente
				 .stream()
				 .filter(registro->registro.getTipo()=='r' || registro.getTipo()=='R')
				 .toList();
		
		return listaReceptores;
	}
	
	public String imprimirListaConcatenada(List<RegistroPaciente> registros) {
		StringBuilder registrosConcatenados= new StringBuilder();
		registros.forEach(registro->registrosConcatenados.append(registro.toString()+";"));
		return registrosConcatenados.toString();  
	}
	
}
