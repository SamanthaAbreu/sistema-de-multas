package br.ifpe.sm;

public abstract class multas {

	private double valor;
	private automoveis automovel;
	private guarda Guarda;
	private int id;

    
	
	public multas(automoveis automovel, guarda Guarda) {
		this.automovel = automovel;
		this.Guarda = Guarda;
	}

	public automoveis getAutomovel() {
		return automovel;
	}

	public void setAutomovel(automoveis automovel) {
		this.automovel = automovel;
	}

	public guarda getGuarda() {
		return Guarda;
	}

	public void setGuarda(guarda guarda) {
		Guarda = guarda;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getId() {
		return id;
	}
	public void setId (int id) {
		this.id = id;
	}
	
	public abstract double calculaValorMulta();

	
	}

