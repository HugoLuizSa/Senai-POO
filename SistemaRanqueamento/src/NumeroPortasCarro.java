
public enum NumeroPortasCarro {

	PORTAS_2("2 portas",2),
	PORTAS_4("4 portas",4);
	
	private String label;
	private int numeroPortas;
	
	private NumeroPortasCarro(String label, int numeroPortas) {
		this.label = label;
		this.numeroPortas = numeroPortas;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public int getNumeroPortas() {
		return numeroPortas;
	}

}
