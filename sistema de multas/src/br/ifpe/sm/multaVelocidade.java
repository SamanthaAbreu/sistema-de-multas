package br.ifpe.sm;

public class multaVelocidade extends multas {

	private double limitePermitido;

	public multaVelocidade(automoveis automovel, guarda Guarda, double limitePermitido) {
		super(automovel, Guarda);
		this.limitePermitido = limitePermitido;
	}

	@Override
	public double calculaValorMulta() {
		double valor = 0;
		double velAuto = getAutomovel().getVelocidade();
		if (velAuto > this.limitePermitido + (velAuto * 0 / 100)&& velAuto < this.limitePermitido + (velAuto * 20 / 100)) {
			setValor(130.16);
			valor = 130.16;
			System.out.println("Calma lá né meu patrão, 20% a mais, multa de: " + valor);
			return 130.16;
		} else {

			if (velAuto >= this.limitePermitido + (velAuto * 20 / 100)&& velAuto <= this.limitePermitido + (velAuto * 50 / 100)) {
				setValor(195.23);
				valor = 195.23;
				System.out.println("Calma lá né meu patrão alivia o pé, está entre 20% e 50% a mais, multa de: " + valor);
				return 195.23;
			} else {
				if (velAuto > this.limitePermitido + (velAuto * 50 / 100)) {
					setValor(880.41);
					return 880.41;

				}

			}

		}
		return valor;
	}
}
