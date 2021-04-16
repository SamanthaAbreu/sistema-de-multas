package br.ifpe.sm;

public class multaCinto extends multas {

	private boolean cinto;
	

	public multaCinto(automoveis automovel, guarda Guarda) {
		super(automovel, Guarda);
	}

	@Override
	public double calculaValorMulta() {
		cinto = ((Carro) getAutomovel()).getCinto();

		if (cinto == false) {
			System.out.println("Cadê o cinto meu camarada");
			setValor(195.23);
		}
		return 195.23;
	}


}
