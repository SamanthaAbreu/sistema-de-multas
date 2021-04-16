package br.ifpe.sm;

public class multaCapacete extends multas {
	
	
	
	

	public multaCapacete(automoveis automovel, guarda Guarda) {
		super(automovel, Guarda);
	}

	@Override
	public double calculaValorMulta() {
		boolean temCapacete = ((Moto) getAutomovel()).getCapacete();

		if (temCapacete == false) {
			System.out.println("Cadê o capacete meu camarada");
			setValor(250);
		}
		return 250;
	}


}

