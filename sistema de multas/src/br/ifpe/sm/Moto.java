package br.ifpe.sm;

public class Moto extends automoveis {
	public double moto;
	public boolean capacete;

	public Moto(String modelo, String placa, int ano, double velocidade, boolean temCapacete) {
		super(modelo, placa, ano, velocidade);
	}

	public boolean getCapacete() {
		return capacete;
	}
	public void setCapacete(boolean capacete) {
		this.capacete = capacete;
	}

}
