package br.com.ecommerce.util;

import javax.swing.JOptionPane;

public class Magica {
	
	public static String s(String msg) { // irá substituir o JOptionPane.showInputDialog (). Para facilitar.
		return JOptionPane.showInputDialog(msg).toUpperCase();
	}
	
	public static int i (String msg) {
		return Integer.parseInt(s(msg));
	}
	
	public static float f (String msg) {
		return Float.parseFloat(s(msg));
	}

}
