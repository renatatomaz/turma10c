package decisao;

import javax.swing.JOptionPane;

public class DesafioComposta {

	public static void main(String[] args) {
		// Pe�a entrada de Veiculos, capacidade de passageiros
		// Exibir a mensagem:
		// "Veiculos Categoria A", se a quantidade passageiros for igual a 2
		// "Veiculos Categoria B", se a quantidade de passageiros estiver entre 4 e 7
		// "Veiculos Categoria C", se quantidade maior que 7
		
		String veiculos = JOptionPane.showInputDialog("Informe o Veiculo: ");
		byte passageiros = Byte.parseByte(JOptionPane.showInputDialog("Informe a quantidade de passageiros"));
		
		System.out.println("Veiculos informado: " + veiculos);
		
		if (passageiros == 2){
			System.out.printf("Veiculo categoria A, com %d passageiros.\n", passageiros);
		} else 
			if (passageiros >= 4 && passageiros <=7) {
				System.out.printf("Veiculo categoria B, com %d passageiros.\n", passageiros);
			} else
				if (passageiros > 7) {
					System.out.printf("Veiculo categoria C, com %d passageiros. \n", passageiros);
				} else {
					System.out.println("Informa��o n�o reconhecida.");
				}

	}

}
