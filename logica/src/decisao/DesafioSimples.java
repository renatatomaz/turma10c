package decisao;

import javax.swing.JOptionPane;

public class DesafioSimples {

	public static void main(String[] args) {
		// Pe�a para o usuario nome e idade
		// Voc� deve exibir:
		// "Obrigado a votar" se a idade for maior que 17 e menor que 70
		// " Voto facultativo" se a idade for igual a 16 ou 17 ou for maior que 70
		// "Proibido vota" se a idade for menor que 16


		String nome= JOptionPane.showInputDialog ("Digite seu nome: ");
		short idade = Short.parseShort(JOptionPane.showInputDialog("Digite sua idade: "));
		//int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));

		if (idade > 17 && idade <= 70) {
			System.out.printf("Ol� %s, aten��o a mensagem abaixo!\n", nome);
			System.out.println("Voc� � Obrigado a votar, sua idade � " + idade);
		}
		
		if (idade >= 16 && idade <= 17 || idade > 70) {
			System.out.printf("Ol� %s, aten��o a mensagem abaixo!\n", nome);
			System.out.println(" Seu voto � facultativo, pois sua idade � " + idade);
		}
		
		if (idade < 16) {
			System.out.printf("Ol� %s, aten��o a mensagem abaixo!\n", nome);
			System.out.println("Proibido votar, sua idade � " + idade);
		}

	}

}