package br.com.unixyz.implementacao;

import javax.swing.JOptionPane;

import br.com.unixyz.modelo.Curso;

public class ImplementarCurso {

	public static void main(String[] args) {
		
		Curso curso = new Curso (
				Integer.parseInt(JOptionPane.showInputDialog("ID do curso")),
				JOptionPane.showInputDialog("Descri��o do curso").toUpperCase(),
				Float.parseFloat(JOptionPane.showInputDialog("Valor do curso")),
				Integer.parseInt(JOptionPane.showInputDialog("Carga hor�ria do curso - Apenas n�mero em horas"))	
				);
		
		System.out.println("ID curso: " + curso.getId());
		System.out.println("Descri��o do curso: " + curso.getDescricao());
		System.out.println("Valor do curso: R$ " + curso.getValor());
		System.out.println("Carga hor�ria do curso: " + curso.getCargaHoraria() + " horas");

	}

}
