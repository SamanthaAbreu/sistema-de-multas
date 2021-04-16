package br.ifpe.sm;

public class multaEstacionamento extends multas {

	public multaEstacionamento(automoveis automovel, guarda Guarda) {
		super(automovel, Guarda);
		
	}

	@Override
	public double calculaValorMulta() {
		setValor(350);
		return 350;
	}


}
