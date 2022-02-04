
public enum NivelDeRisco {

	ALTO("Risco Alto", 0), MEDIO("Risco Medio", 1), BAIXO("Risco Baixo", 2);

	private String label;
	private int ordinal;

	private NivelDeRisco(String label, int ordinal) {
		this.label = label;
		this.ordinal = ordinal;
	}

	public String getLabel() {
		return label;
	}

	public int getOrdinal() {
		return ordinal;
	}

}
