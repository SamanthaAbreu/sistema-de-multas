package br.ifpe.sm;

public class GuardaMunicipal implements guarda {
	private int id;
	private String nome;

	public GuardaMunicipal(int id, String nome) {
		this.id = id;
		this.nome = nome;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public void verificaVelocidade(automoveis a, double limite) {
		if (a.getVelocidade() > limite) {
			multas mt = new multaVelocidade(a, this, 100);
			mt.calculaValorMulta();
			System.out.println("pague a multa de: " + mt.getValor());
		} else {
			System.out.println("volte pra casa patrulheiro, ela já foi pro infinito e além com outro");
		}
	}

	@Override
	public void Cinto(automoveis a, boolean cinto) throws Exception{
		cinto = ((Carro) a).getCinto();
		if (a == ((Carro)a) ||a == ((Caminhao)a)){	
			if (cinto == false) {
			multas m = new multaCinto(a, this);
			m.calculaValorMulta();
			a.addMultas(m);
			System.out.println("Você está dirigindo sem cinto sua multa é:\n" + m.getValor());
		} else if(cinto == true){
			System.out.println("Vai timbora carniça!");
		}else {
			throw new Exception();

		}}

	}

	@Override
	public void autuarEstacionamento(automoveis a) {
		multas m = new multaEstacionamento(a, this);
		m.calculaValorMulta();
		System.out.println("Voçê estacionou em local proibido. \n Multa de: " + m.getValor());
	}

	@Override
	public void temCapacete(automoveis m, boolean temCapacete) {
		temCapacete = ((Moto) m).getCapacete();
		if (temCapacete == false) {
			multas ml = new multaCapacete(m, this);
			ml.calculaValorMulta();
			m.addMultas(ml);
			System.out.println("Você está dirigindo sem cinto sua multa é:\n" + ml.getValor());
		} else {
			System.out.println("Vai timbora carniça!");}

		}
		
		@Override
		public void peso(automoveis p, double sobrePeso) {
			double peso = ((Caminhao) p).getSobrePeso();
			if (peso > sobrePeso) {
				multas ml = new multaPeso(p, this, 900);
				ml.calculaValorMulta();
				p.addMultas(ml);
				System.out.println("Você está dirigindo com excesso de peso sua multa é de: \n" + ml.getValor());
			} else {
				System.out.println("Vai nessa cara!");
		

	}
}

	
		}
