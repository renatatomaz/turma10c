package repeticao;

import javax.swing.JOptionPane;

public class ExercicioRepeticao2 {

	public static void main(String[] args) {
		//String nome1 = JOptionPane.showInputDialog("Informe seu nome");
				//int idade1 = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade"));
				
			//	System.out.println("Nome: " + nome1 + " - idade: " + idade1 + " anos.");
				
				String nome = "";
				int pessoa = 0;
				int idade = 0;
				int somaIdade = 0;
				int media = 0;
				int maiorDezoito = 0;
				
				do {
					nome = JOptionPane.showInputDialog("informe seu nome").toUpperCase();
					idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade"));
					pessoa ++;
					somaIdade = somaIdade + idade;
					media = somaIdade / pessoa;
					if (idade > 18) {
						maiorDezoito ++ ;
					}
					
				} while (nome.length() > 2);
						
				System.out.println("Soma Idade: " + somaIdade);
				System.out.println("M�dia Idade: " + media);
				System.out.println("Quantidade maior que dezoito anos: " + maiorDezoito);
			}
			

		}