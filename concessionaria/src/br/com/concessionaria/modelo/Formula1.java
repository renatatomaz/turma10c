package br.com.concessionaria.modelo;

public class Formula1 {
	private String cor;
	private String escuderia;
	private boolean status;
	private float velocidadeAtual;
	private float valor;
	
	//Sintase para os metodos
	// <modificador> <tipo do retorno> <nome do metodo> (<TipoParam> <nomeParam>) {
	public void preencherEscuderia (String pEscuderia) {
		escuderia = pEscuderia.toUpperCase();
	}
	
	public String retornarEscuderia () {
		return escuderia;
	}
	
	public void preencherCor (String pCor) {
		cor = pCor.toLowerCase();
	}
	public String retornarCor () {
		return cor;
	}
	
	public void preencherValor (float pValor) {
		if (pValor > 0) {
			valor = pValor;
		}
	}
	public float retornarValor () {
		return valor;
	}
	
	public String ligar () {
		status = true;
		return "Carro Ligado!";
	}
	
	public String desligar () {
		status = false;
		return "Carro desligado!";
	}
	
	public void acelerar (float pVelocidade) {
		if (status == true) {
			velocidadeAtual = velocidadeAtual + pVelocidade;	
		}
	}
	public void desacelerar (float pVelocidade) {
		if (status == true) {
			velocidadeAtual = velocidadeAtual - pVelocidade;
			if (velocidadeAtual < 0) {
				velocidadeAtual = 0;
			}
		}
	}
	
	public float retornarVelocidade () {
		return velocidadeAtual;
	}
	
	
} // fechar classe
