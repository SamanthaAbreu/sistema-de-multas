package br.ifpe.sm;

public class Caminhao extends automoveis {
	private double sobrePeso;
	
	public double getSobrePeso() {
		return sobrePeso;
	}
	
	public void setSobrePeso(double sobrePeso) {
		this.sobrePeso = sobrePeso;
	}

	public Caminhao(String modelo, String placa, int ano, double velocidade, double sobrePeso) {
		super(modelo, placa, ano, velocidade);
		this.sobrePeso = sobrePeso;
	}
		
//		public void peso(boolean temPeso) {
//			if (temPeso == true) {
//			if (temPeso) {
//				System.out.println("limite de carga permitido");
//			} else {
//				System.out.println("excesso de carga");
//				
//			}
//			}
//		
//		
//	}
	
}

