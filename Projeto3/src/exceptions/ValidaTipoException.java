package exceptions;

import interfaces.ValidadorRegistro;
import model.RegistroPaciente;

public class ValidaTipoException implements ValidadorRegistro {

	@Override
	public void validarRegistroPaciente(RegistroPaciente registroPaciente) {
		char tipo= registroPaciente.getTipo();
		
		if((tipo!='D' || tipo!='d') || (tipo!='R' || tipo!='r'))
			throw new RuntimeException("O tipo deve ser D ou R");
	}

}
