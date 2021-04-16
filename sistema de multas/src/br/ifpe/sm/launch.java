package br.ifpe.sm;

public class launch {

	public static void main(String[] args) {
		automoveis c = new Carro("Celta rebaixado", "AVA-0000", 2008, 100, false);
		guarda g = new GuardaMunicipal(007, "James");
		// automoveis m = new GuardaMunicipal("98 Fuçada");

		automoveis m = new Moto("Biz", "AVA-0000", 2019, 500, false);
		
		automoveis p = new Caminhao("1620", "AVA-0000", 89, 300, 1500);
		
		System.out.println();
		g.verificaVelocidade(c, 100);
		System.out.println();
		g.autuarEstacionamento(c);
		System.out.println();
     	g.temCapacete(m, true);
     	System.out.println();
     	System.out.println();
		g.temCapacete(m, true);
		System.out.println();
		g.peso(p, 25);
		System.out.println();
		System.out.println(c);
		System.out.println();
		System.out.println(m);
		System.out.println();	
		System.out.println();
		System.out.println(p);
		c.listarMultas();


     	
		try {
			g.Cinto(c, true);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		try {
			c.acelerar(-50);
		} catch (Exception e) {
			System.err.println("Onde desgraça tu já viu uma velocidade negativa?");
		}
		try {
			g.temCapacete(c, true);
		} catch (Exception e) {
			System.err.println("Seu incompetente não se multa carro por não estar de capacete");
		}

		
		try {
			g.Cinto(m, true);
		} catch(Exception e1) {
			System.err.println("Meu irmão moto não tem cinto, seu trouxa");
		}
		try {
	     	  g.peso(m, 100);
	     	}catch (Exception e) {
	     	  System.err.println("Não pode multar uma moto por excesso de peso, idiota!");
	     	}
		// g.verificarVelocidade(c);

		
		
		
	
	}
}
