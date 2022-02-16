package exceptions;

import interfaces.ValidadorRegistro;
import model.RegistroPaciente;

public class NomeInvalidoException implements ValidadorRegistro{
	
	@Override
	public void validarRegistroPaciente(RegistroPaciente registroPaciente) {
		String nome = registroPaciente.getNomeCompleto();
		if(nome.length() < 3 || nome.length() >150 || nome.isEmpty())
			throw new RuntimeException("o nome do paciente deve conter entre 3 e 150 caracteres");
	}
	
}
