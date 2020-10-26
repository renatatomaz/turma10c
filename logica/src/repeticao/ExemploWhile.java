package repeticao;

import javax.swing.JOptionPane;

public class ExemploWhile {

	public static void main(String[] args) {
		String email = JOptionPane.showInputDialog("Email").toLowerCase();
		while (email.indexOf("@") == -1) {
			email= JOptionPane.showInputDialog("Email deve conter @").toLowerCase();
		}
		
		String nome = JOptionPane.showInputDialog("Digite seu nome").toUpperCase();
		while (nome.length()<5 || nome.length() >20) {
			nome = JOptionPane.showInputDialog("Digite seu nome, com mais de 5 digitos limitado a 20.");
		}
		System.out.println(nome);
		System.out.println(email);

	}

}
