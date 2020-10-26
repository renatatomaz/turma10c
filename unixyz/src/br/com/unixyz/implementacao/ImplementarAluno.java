package br.com.unixyz.implementacao;

import javax.swing.JOptionPane;

import br.com.unixyz.modelo.Aluno;

public class ImplementarAluno {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno ();
		
		aluno.setEmail(JOptionPane.showInputDialog("Email").toLowerCase());
		aluno.setNome(JOptionPane.showInputDialog("Nome").toUpperCase());
		aluno.setRm(Integer.parseInt(JOptionPane.showInputDialog("RM")));
				
		System.out.println("RM: " + aluno.getRm());
		System.out.println("Nome: " + aluno.getNome());
		System.out.println("Email: " + aluno.getEmail());
		
		System.out.println(aluno); // ele traz o endere�o de mem�ria do objeto. Colocar essa op��o n�o � boa pratica, n�o fazer.
			

	}

}
