package repeticao;

import javax.swing.JOptionPane;

public class DesafioDo {

	public static void main(String[] args) {
		/*
		 * Um jogo de adivinha��o.
		 * O jogador 1 digita um n�mero inteiro;
		 * o jogador 2 tem que adivinhar o n�mero que foi digitado pelo jogador 1
		 * Enquanto ele n�o acertar o jogo continua perguntando o n�mero.
		 */

		int jogador1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero"));
		int jogador2 = 0;
		int tentativas = 0;

		do {
			jogador2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero"));
			tentativas = tentativas + 1;
		}	while (jogador2 != jogador1);
										
			System.out.println("Parab�ns voc� acertou!\nTotal de tentativas " + tentativas);
		}
}
