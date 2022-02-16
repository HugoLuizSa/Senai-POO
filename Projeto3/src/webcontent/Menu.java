package webcontent;

import java.util.List;

import javax.swing.JOptionPane;

import model.RegistroPaciente;
import service.RegistrosService;

public class Menu {

	public static String getMenu() {
		StringBuilder str = new StringBuilder();

		str.append("1- Adicionar Paciente \n");
		str.append("2- Listar Doadores \n");
		str.append("3- Listar Receptores \n");
		str.append("4- Encerrar aplicação \n");

		return str.toString();
	}

	public static RegistroPaciente cadastrarRegistro() {

		int codigo = Integer.parseInt(JOptionPane.showInputDialog("Informe o codigo do cliente"));
		String nomeCompleto = JOptionPane.showInputDialog("Informe o nome do cliente");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do cliente"));
		char tipo = JOptionPane.showInputDialog("o tipo do paciente D ou R").charAt(0);

		return new RegistroPaciente(codigo, nomeCompleto, idade, tipo);
	}

	public static void listarDoadores(List<RegistroPaciente> doadores) {
		try {
			RegistrosService registrosService = new RegistrosService(doadores);
			List<RegistroPaciente> listaDoadores = registrosService.getDoadores();
			String listaDoadoresString = registrosService.imprimirListaConcatenada(listaDoadores);

			System.out.println(listaDoadoresString);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}

	public static void listarReceptores(List<RegistroPaciente> receptores) {
		try {
			RegistrosService registrosService = new RegistrosService(receptores);
			List<RegistroPaciente> listaReceptores = registrosService.getReceptores();
			String listaReceptoresString = registrosService.imprimirListaConcatenada(listaReceptores);

			System.out.println(listaReceptoresString);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}

}
