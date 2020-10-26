package variaveis;

import javax.swing.JOptionPane;

public class Notas {

	public static void main(String[] args) {
		/*Parse => convers�o entre tipos incompat�veis (String => primitivo)
				 * Primitivo => s�o os tipos que fazem parte da linguagem (come�am com letras minusculas)
				 * 
				 * boolean => armazena True ou False
				 * char => armazena um caracter
				 * byte => numeros inteiros (-127 // +128)
				 * short => numeros inteiros (-32k // + 32k)
				 * int => numeros inteiros (-2bilhoes // +2bilhoes)
				 * long => numeros inteiros 
				 * float => numeros reais
				 * double => numeros reais (possui o dobro de precis�o nas casas decimais)
				 * 
				 * Classe Wrapper => s�o classes que apoiam os tipos primitivos. Exemplo: parse().
				 * int => Integer
				 * double => Double
				 * float => Float
				 * boolean = Boolean
				 */
		
		//input de nome do aluno, disciplina e duas notas.
		// exibir o nome do aluno, a m�dia e a disciplina.
		
		String nome = JOptionPane.showInputDialog("Digite seu nome: ");
		String disciplina1 = JOptionPane.showInputDialog("Digite a Disciplina: ");
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua nota: "));
		String disciplina2 = JOptionPane.showInputDialog("Digite a Disciplina: ");
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua nota: "));
		double media = (nota1 + nota2) / 2;
		
		System.out.println("Nome do Aluno: " + nome);
		System.out.print("Materia1= " + disciplina1);
		System.out.println("  Nota: " + nota1);
		System.out.print("Materia2= " + disciplina2);
		System.out.println("  Nota: " + nota2);
		System.out.println("M�dia= " + media);
		
		// corre��o do professor
		
		String nomea = JOptionPane.showInputDialog("Digite seu nome: ");
		String disciplinaa = JOptionPane.showInputDialog("Digite a Disciplina: ");
		float nota1a = Float.parseFloat(JOptionPane.showInputDialog("Digite sua nota: "));
		float nota2a = Float.parseFloat(JOptionPane.showInputDialog("Digite sua nota: "));
		double mediaa = (nota1a + nota2a) / 2;
		
		System.out.println("Nome do Aluno: " + nomea);
		System.out.println("Materia1= " + disciplinaa);
		System.out.println("Nota: " + nota1a);
		System.out.println("Nota: " + nota2a);
		System.out.println("M�dia= " + mediaa);
		System.out.printf(" %s sua m�dia na disciplina de %s foi de %.2f.", nomea, disciplinaa, mediaa);
	}

}
