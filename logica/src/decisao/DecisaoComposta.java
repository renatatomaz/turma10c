package decisao;

import javax.swing.JOptionPane;

public class DecisaoComposta {

	public static void main(String[] args) {
		/*
		 * Pe�am o total de faltas
		 * Se o total de faltas for maior que 20, o aluno ser� reprovado.
		 */
		
		String nome = JOptionPane.showInputDialog("Digite seu nome: ").toUpperCase();
		short faltas = Short.parseShort(JOptionPane.showInputDialog("Informe o n�mero de faltas"));
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota 1: "));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota 2: "));
		float media = (nota1 + nota2)/2;
		
		System.out.println("Aluno: " + nome);
		
		if (faltas > 20) {
			System.out.println("Seu n�mero de altas � acima do permitido, por isso voc� esta reprovado.\nSeu n�mero de faltas � de "+ faltas);
		} else		
		if (media >= 6) {
			System.out.println("Aprovado com media: " + media);
		} else if (media < 4) {
			System.out.println("Infelizmente voc� foi reprovado: " + media);
		} else  {
			System.out.println("Voc� ainda tem uma chance no exame, sua m�dia atual � " + media);
		}
				
		//and => &&
		// or => ||
				
		//else {
		//	System.out.println("Infelizmente voc� foi reprovado: " + media);
		//}
		
		}
}
