package repeticao;

import javax.swing.JOptionPane;

public class ExercicioRepeticao {

	public static void main(String[] args) {
		
		String escolaridade = "";
		int totalMedio = 0;
		int totalSuperior = 0;
		int totalPos = 0;
		
		do {
			escolaridade = JOptionPane.showInputDialog("Informe sua escolaridade").toUpperCase();
			if (escolaridade.equals("MEDIO")) {
				totalMedio = totalMedio +1 ;
			} if (escolaridade.equals("SUPERIOR")) {
				totalSuperior ++;
			} else if (escolaridade.equals("POS")) {
				totalPos ++;
			}
			
		} while (escolaridade.equals("MEDIO") || escolaridade.equals("SUPERIOR") || escolaridade.equals("POS"));
		
		if (totalMedio > totalSuperior && totalMedio > totalPos) {
			System.out.println("Escolaridade mais informada: M�dio com " + totalMedio);
		} else if (totalSuperior > totalMedio && totalSuperior > totalPos) {
			System.out.println("Escolaridade mais informada: Superior com " + totalSuperior);
		} else if (totalPos > totalMedio && totalPos > totalSuperior) {
			System.out.println("Escolaridade mais informada: Pos com " + totalPos);
		} else if ((totalMedio == totalSuperior) || (totalMedio == totalPos) || (totalSuperior== totalPos)) {
			System.out.println("Empate vota��o");
		}
		System.out.println("M�dio " + totalMedio + "\nSuperior " + totalSuperior + "\nPos " + totalPos);
		
	}

}
