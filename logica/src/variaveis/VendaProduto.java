package variaveis;

import javax.swing.JOptionPane;

public class VendaProduto {

	public static void main(String[] args) {
		// Crie as variaveis para armazenar: nome do produto, c�digo, valor e quantidade.
		// Exiba no final o nome do produto, o total e o total com 10% de desconto.
		
		String nomedoproduto = "Bolo";
		int codigo = 1232;
		double valorproduto = 48.95;
		int quantidade = 6;
		double total = valorproduto * quantidade;
		double desconto = total - (total * 0.10);
				
		System.out.println("Nome do produto: " + nomedoproduto);
		System.out.printf("Valor Total: R$ %.2f\n", total);
		System.out.printf("Valor Total: R$ %.2f\n", (valorproduto * quantidade));
		System.out.printf("Valor com Desconto: R$ %.2f\n", desconto);
		System.out.printf("Valor com Desconto: R$ %.2f\n", (total * 0.9));
		// o ideal � sempre fazer as opera��es matematicas nas variaveis e n�o na impress�o.
		System.out.println("Quantidade comprada: " + quantidade);
		System.out.println("Valor Unit�rio: R$ " + valorproduto);
		
		/*
		 * Parse => convers�o entre tipos incompat�veis (String => primitivo)
		 * Primitivo => s�o os tipos que fazem parte da linguagem (come�am com letras minusculas)
		 * Classe Wrapper => s�o classes que apoiam os tipos primitivos. Exemplo: parse().
		 * int => Integer
		 * double => Double
		 */
		
		String produto = JOptionPane.showInputDialog("Informe o produto");
		int codigo2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o c�digo: "));
		double valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor: "));
		int quantidade2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade: "));
		double total2 = valor2 * quantidade2;
		double desconto2 = total2 - (total2 * 0.10);
				
		System.out.println("\nNome do produto: " + produto);
		System.out.printf("Valor Total: R$ %.2f\n", total2);
		System.out.printf("Valor Total: R$ %.2f\n", (valor2 * quantidade2));
		System.out.printf("Valor com Desconto: R$ %.2f\n", desconto2);
		System.out.printf("Valor com Desconto: R$ %.2f\n", (total2 * 0.9));
		// o ideal � sempre fazer as opera��es matematicas nas variaveis e n�o na impress�o.
		System.out.println("Quantidade comprada: " + quantidade2);
		System.out.println("Valor Unit�rio: R$ " + valor2);
	}

}
