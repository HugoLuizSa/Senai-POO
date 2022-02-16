package mainClass;

import javax.swing.JOptionPane;
import model.RegistroPaciente;
import service.RegistrosService;
import webcontent.Menu;

public class MainClass {

	public static void main(String[] args) {

		RegistrosService registrosService = new RegistrosService();
		
		String opcao="1";
		int opcaoEscolhida;
		
		do {
			
			opcao = JOptionPane.showInputDialog("Digite uma das opcoes \n"+Menu.getMenu());
			opcaoEscolhida = Integer.parseInt(opcao);
			
			if(opcaoEscolhida==1) {
				RegistroPaciente registro = Menu.cadastrarRegistro();
				registrosService.adicionarRegistro(registro);
			}
			
			if(opcaoEscolhida==2) {
				Menu.listarDoadores(registrosService.listaRegistroPaciente);
			}
			
			if(opcaoEscolhida==3) {
				Menu.listarReceptores(registrosService.listaRegistroPaciente);
			}
			
		} while (opcaoEscolhida > 0 && opcaoEscolhida < 4 );
	}
	
	
	
}

