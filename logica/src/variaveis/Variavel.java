package variaveis;

import javax.swing.JOptionPane;

public class Variavel {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite seu nome: ");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura: "));
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso: "));
		double imc = peso / (altura * altura);
		System.out.print(nome);
		System.out.print(idade);
		System.out.println(imc);
		System.out.println("Usu�rio: " + nome);
		System.out.println("Idade: " + idade);
		// %f => n�meros reais /// %s => Strings /// %d => inteiros
		System.out.printf("IMC: %.2f\n", imc);
		System.out.printf("Sr(a) %s, voc� tem %d anos de idade. Seu IMC � %.2f.\n", nome, idade, imc);
		
	}

}
