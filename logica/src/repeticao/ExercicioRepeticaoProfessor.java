package repeticao;

import javax.swing.JOptionPane;

public class ExercicioRepeticaoProfessor {

	public static void main(String[] args) {
		
		String nome = "";
		short idade = 0;
		int contMaiorIdade = 0;
		int qtdePessoas = 0;
		int totalIdades = 0;
		String pessoaMaisExperiente = "";
		int idadeMaisExperiente = 0;
		String pessoaMaisJovem = "";
		int idadeMaisJovem = 0;
		
		do {
			nome = JOptionPane.showInputDialog("Digite seu nome");
			idade = Short.parseShort(JOptionPane.showInputDialog("Digite sua idade"));
			if (idade > 18) {
				contMaiorIdade ++;
			}
			totalIdades += idade; // mesma coisa que => totalIdades = totalIdades + idade;
			qtdePessoas ++ ;
			if (idade > idadeMaisExperiente) {
				idadeMaisExperiente = idade;
				pessoaMaisExperiente = nome;
			}
			if (idade < idadeMaisJovem || qtdePessoas == 1) {
				idadeMaisJovem = idade;
				pessoaMaisJovem = nome;
			}
		} while (JOptionPane.showConfirmDialog(
				null, //posi��o inicial da janela (centralizada em rela��o ao monitor)
				"Deseja Continuar?", // Mensagem principal (que fica no centro da janela)
				"Pergunta", // mensagem que aparece no barra de titulo da janela
				JOptionPane.YES_NO_OPTION) // configura��o dos bot�es da janela (Yes==0 // No ==1)
				== 0);
				
		
				
		System.out.println("Total maior de idade: " + contMaiorIdade);
		System.out.println("M�dia Idade: " + (totalIdades / qtdePessoas));
		System.out.println("Mais experiente: " + pessoaMaisExperiente);
		System.out.println("Idade mais experiente: " + idadeMaisExperiente);
		System.out.println("Mais jovem: " + pessoaMaisJovem);
		System.out.println("Idade mais jovem: " + idadeMaisJovem);
	}
	

}
