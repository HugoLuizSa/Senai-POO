package exceptions;

import interfaces.ValidadorRegistro;
import model.RegistroPaciente;

public class ValidaCodigoException implements ValidadorRegistro {

	@Override
	public void validarRegistroPaciente(RegistroPaciente registroPaciente) {
		int codigo = registroPaciente.getCodigo();
		
		if(codigo<0)
			throw new RuntimeException("O campo codigo do paciente deve ser positivo");
		
	}

	
	
}
