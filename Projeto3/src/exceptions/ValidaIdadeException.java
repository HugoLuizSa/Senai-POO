package exceptions;

import interfaces.ValidadorRegistro;
import model.RegistroPaciente;

public class ValidaIdadeException implements ValidadorRegistro {

	@Override
	public void validarRegistroPaciente(RegistroPaciente registroPaciente) {
		int idade = registroPaciente.getIdade();
		
		if(idade<0)
			throw new RuntimeException("Idade do paciente deve ser positiva");
	}
}
