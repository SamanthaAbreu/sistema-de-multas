package br.ifpe.sm;

import java.util.ArrayList;

public class automoveis {
	private String placa;
	private String modelo;
	private int ano;
	private double velocidade;
	private ArrayList<multas> listaMulta;
	private double infracao;
	private int id;

	public void estacionar() {

	}

	public int getAno() {
		return this.ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public ArrayList<multas> getListaMulta() {
		return listaMulta;
	}

	public void setListaMulta(ArrayList<multas> listaMulta) {
		this.listaMulta = listaMulta;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

	public void setInfracao(double infracao) {
		this.infracao = infracao;
	}

	public double getInfracao() {
		return infracao;
	}

	public automoveis(String modelo, String placa, int ano, double velocidade) {
		this.modelo = modelo;
		this.placa = placa;
		this.ano = ano;
		this.velocidade = velocidade;
		listaMulta = new ArrayList<multas>();
	}

	@Override
	public String toString() {

		return "Auto: " + getModelo() + "\nPlaca: " + getPlaca() + "\nVelocidade: " + getVelocidade();

	}

	public void acelerar(double velocidade) throws Exception {
		if (velocidade < 0) {
			throw new Exception();
		} else {
			this.velocidade = velocidade;
		}

	}

	public void desacelerar(double velocidade) {
		if (velocidade < this.velocidade) {
			this.velocidade = velocidade;
			System.out.println("houve uma diminuição na velocidade para: " + velocidade);
		} else {
			System.out.println("Aqui é só lentidão meu patrão");
		}

	}

	public void addMultas(multas m) {
		listaMulta.add(m);
	}

	public void removeMultas() {
		multas m = null;
		for (int i = 0; i < listaMulta.size(); i++) {
			if (id == listaMulta.get(i).getId()) {
				m = listaMulta.get(i);
			}

		}
		listaMulta.remove(m);
	}

	public void listarMultas() {
		for (int i = 0; i < listaMulta.size(); i++) {
			System.out.println("Id das multas:" + listaMulta.get(i).getId());
		}
		
		
	}
}
