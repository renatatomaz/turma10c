package br.com.concessionaria.teste;

import javax.swing.JOptionPane;

import br.com.concessionaria.modelo.Formula1;

public class TesteFormula1 {

	public static void main(String[] args) {
		// Criar um objeto
		Formula1 objeto = null;
		
		// Instanciar um objeto
		Formula1 carro = new Formula1 ();
		carro.preencherEscuderia("ferrari");
		System.out.println(carro.retornarEscuderia());
		
		carro.preencherCor(JOptionPane.showInputDialog("Digite a cor"));
		System.out.println(carro.retornarCor());
		
		carro.preencherValor((float)4454.98);
		System.out.println(carro.retornarValor());
		
		if (JOptionPane.showConfirmDialog(null, "Ligar", "Pergunta", JOptionPane.YES_NO_OPTION)==0) {
			System.out.println(carro.ligar());
		} else {
			System.out.println(carro.desligar());
		}
		
		
		carro.acelerar(50);
		carro.acelerar(20);
		System.out.println(carro.retornarVelocidade());
		carro.desacelerar(100);
		System.out.println(carro.retornarVelocidade());

	}
	
	}
