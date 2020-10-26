package decisao;

import javax.swing.JOptionPane;

public class DecisaoEncadeada {

	public static void main(String[] args) {

		short faltas = Short.parseShort(JOptionPane.showInputDialog("Informe o n�mero de faltas"));
		if (faltas > 20) {
			System.out.println("Seu n�mero de altas � acima do permitido, por isso voc� esta reprovado por faltas.\nSeu n�mero de faltas � de "+ faltas);
		} else {

			String nome = JOptionPane.showInputDialog("Digite seu nome: ").toUpperCase();
			float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota 1: "));
			float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota 2: "));
			float media = (nota1 + nota2)/2;

			System.out.println("Aluno: " + nome);

			if (media >= 6) {
				System.out.println("Aprovado com media: " + media);
			} else if (media < 4) {
				System.out.println("Infelizmente voc� foi reprovado: " + media);
			} else  {
				System.out.println("Voc� ainda tem uma chance no exame, sua m�dia atual � " + media);
			}
		}

	}
}
