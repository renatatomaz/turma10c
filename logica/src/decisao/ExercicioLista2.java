package decisao;

import javax.swing.JOptionPane;

public class ExercicioLista2 {

	public static void main(String[] args) {
		/*
		 * Um hotel cobra R$ 80,00 a di�ria e mais uma taxa de servi�os. 
		 * A taxa de servi�os � de: 
		 * �	R$ 5,50 por di�ria, se o n�mero de di�rias for maior que 15; 
		 * �	R$ 6,00 por di�ria, se o n�mero de di�rias for igual a 15; 
		 * �	R$ 8,00 por di�ria, se o n�mero de di�rias for menor que 15.
		 * Monte uma aplica��o que apresente a conta do cliente.
		 */

		String cliente = JOptionPane.showInputDialog("Informe o nome do Cliente");
		short diarias = Short.parseShort(JOptionPane.showInputDialog("Informe o n�mero de diarias"));
		double valorDiaria = 80.00;
		double taxaMenor = 8.00;
		double taxaIgual = 6.00;
		double taxaMaior = 5.50;


		System.out.println("Cliente: " + cliente);

		if (diarias < 15) {
			double totalConta = valorDiaria * diarias * taxaMenor ;
			System.out.println("Total per�odo: R$ " + totalConta);
		} else
			if (diarias == 15) {
				double totalConta = valorDiaria * diarias * taxaIgual ;
				System.out.println("Total per�odo: R$ " + totalConta);
			} else
				if (diarias > 15) {
					double totalConta = valorDiaria * diarias * taxaMaior ;
					System.out.println("Total per�odo: R$ "+ totalConta);
				}
		System.out.println("Obrigada! Volte sempre!");
	}

}
