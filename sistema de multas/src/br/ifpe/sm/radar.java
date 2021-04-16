package br.ifpe.sm;

public class radar extends multas {

	/*private double velocidadeMaxima;

	public radar(automoveis automovel, guarda Guarda,double velocidadeMaxima) {
		super(automovel, Guarda);
		this.velocidadeMaxima = velocidadeMaxima;
	}

	@Override
	public double calculaValorMulta(automoveis a) {
		double custo = 0;
		double auto = getAutomovel().getVelocidade();
		return 0;
		if (auto > this.velocidadeMaxima + (auto * 0 / 100)&& auto < this.velocidadeMaxima + (auto * 20 / 100)) {
			setValor(130.16);
			custo = 130.16;
			System.out.println("pego na lombada eletrônica 4 pontos na CNH, 20% a mais da velocidade permitida, multa de: " + custo);
			return 130.16;
	} else {

		if (auto >= this.velocidadeMaxima + (auto * 20 / 100)&& auto <= this.velocidadeMaxima + (auto * 50 / 100)) {
			setValor(195.23);
			custo = 195.23;
			System.out.println("lombada é tenso 5 pontos na CNH, está entre 20% e 50% a mais, multa de: " + custo);
			return 195.23;
		} else {
			if (auto > this.velocidadeMaxima + (auto * 50 / 100)) {
				setValor(880.41);
				return 880.41;
			}
			return custo;*/
	
	private double velocidadeMaxima;

	public radar(automoveis automovel, guarda Guarda, double velocidadeMaxima) {
		super(automovel, Guarda);
		this.velocidadeMaxima = velocidadeMaxima;
	}

	@Override
	public double calculaValorMulta() {
		double valor = 0;
		double velAuto = getAutomovel().getVelocidade();
		if (velAuto > this.velocidadeMaxima + (velAuto * 0 / 100)&& velAuto < this.velocidadeMaxima + (velAuto * 20 / 100)) {
			setValor(130.16);
			valor = 130.16;
			System.out.println("Calma lá né meu patrão, 20% a mais, multa de: " + valor);
			return 130.16;
		} else {

			if (velAuto >= this.velocidadeMaxima + (velAuto * 20 / 100)&& velAuto <= this.velocidadeMaxima + (velAuto * 50 / 100)) {
				setValor(195.23);
				valor = 195.23;
				System.out.println("Calma lá né meu patrão alivia o pé, está entre 20% e 50% a mais, multa de: " + valor);
				return 195.23;
			} else {
				if (velAuto > this.velocidadeMaxima + (velAuto * 30 / 100)) {
					setValor(880.41);
					return 880.41;

				}

			}

		}
		return valor;
	}
}
