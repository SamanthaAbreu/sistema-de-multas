package br.ifpe.sm;

public class Carro extends automoveis {
	
	private boolean cinto;

	public Carro(String modelo, String placa, int ano, double velocidade, boolean cinto) {
		super(modelo, placa, ano, velocidade);
		this.cinto = cinto;
	}
	public boolean getCinto () {
		return cinto;
	}
	
	public void setCinto(boolean cinto) {
		this.cinto = cinto;
	}
	

//@Override
//public String toString() {
//	// TODO Auto-generated method stub
//	return "Carro: " + getModelo();
}

