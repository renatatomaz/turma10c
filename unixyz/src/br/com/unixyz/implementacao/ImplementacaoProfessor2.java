package br.com.unixyz.implementacao;

import br.com.unixyz.modelo.Endereco;
import br.com.unixyz.modelo.Professor;
import br.com.unixyz.util.Magica;

public class ImplementacaoProfessor2 {

	public static void main(String[] args) {
		
		Professor prof = new Professor (
				Magica.i("ID"),
				Magica.s("Nome"),
				Magica.s("Forma��o"),
				new Endereco (
						Magica.s("Logradouro"),
						Magica.s("N�mero"),
						Magica.s("Complemento"),
						Magica.s("Bairro"),
						Magica.s("Cidade"),
						Magica.s("Estado"),
						Magica.s("CEP")
						)
				);
		
		System.out.println(prof.getAll());
		
		
	} // fecha main

} // fecha a classe
