package br.ifpe.sm;

public class multaPeso extends multas {
	private double sobrePeso;

	public multaPeso(automoveis automovel, guarda Guarda,double sobrePeso) {
		super(automovel, Guarda);
	}

		@Override
		public double calculaValorMulta() {
			double peso = ((Caminhao)getAutomovel()).getSobrePeso();
		      
		      if(peso - sobrePeso <= 600) {
		    	  setValor(130.16);
		    	  System.out.println("Peso máximo exigido é em até 600kg. \n *Infração Leve!* "
		    	                           + "\nMulta de: R$  " + getValor());
		    	  return 130.16;
		      }else {
		    		
		    	 if (peso - sobrePeso >=601 && peso - sobrePeso <= 1000) {
		    		setValor(195.23);
		    		System.out.println("Peso máximo exigido é entre 600kg e 1000kg. \n *Infração Mediana!*" + "\nMulta de: R$" + getValor());
		          return 195.23;
		    	    
			}else {
				setValor(peso/500*293.47);
				System.out.println("Peso máximo exigido em mais de 1000kg. \n *Infração Grave!*" 
				            + "\nMulta de: R$" + getValor());
				
				return peso/500*293.47;	

			}
		      
	  }
	 }
	}