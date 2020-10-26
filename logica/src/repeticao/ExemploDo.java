package repeticao;

import javax.swing.JOptionPane;

public class ExemploDo {

	public static void main(String[] args) {
		String candidato = "";
		int totalVerde = 0;
		int totalAmarelo = 0;
		do {
			candidato = JOptionPane.showInputDialog("Digite <Verde> ou < Amarelo>").toUpperCase();
			if (candidato.equals("VERDE")) {
				totalVerde = totalVerde + 1;
			} else if (candidato.equals("AMARELO")) {
				totalAmarelo = totalAmarelo + 1;
			}
		} while (candidato.equals ("VERDE") || candidato.equals("AMARELO"));
		
		System.out.println("Total do candidato Verde: " + totalVerde);
		System.out.println("Total do candidato Amarelo: " + totalAmarelo);
		

	} // chave do metodo main

} // chave classe
