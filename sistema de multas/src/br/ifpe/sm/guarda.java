package br.ifpe.sm;

public interface guarda {
	
	public void verificaVelocidade(automoveis a, double limite);
	public void autuarEstacionamento (automoveis a);
	//public void Cinto(automoveis a, boolean cinto) throws Exception;
	//void temCapacete(automoveis m, boolean temCapacete);
	void temCapacete(automoveis m, boolean temCapacete);
	public void peso(automoveis p,double sobrePeso);
	void Cinto(automoveis a, boolean cinto) throws Exception;
}
