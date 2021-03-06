package br.com.colecoes.implementacao;

import java.util.ArrayList;
import java.util.List;

import br.com.colecoes.beans.Cargo;

public class TesteListObjeto {

	public static void main(String[] args) {
		// Para criar o generics (abaixo que esta como cargo) sempre deve ser uma classe.
		
		List <Cargo> lista = new ArrayList <Cargo> ();
		
		lista.add(new Cargo (
				"DBA",
				"JUNIOR",
				8000
				));
		lista.add(new Cargo ( "PROJETO", "PLENO", 20000));
		lista.add(new Cargo ( "ESTAGIARIO", "SENIOR", 5000));

		//System.out.println(lista.get(1).getSalario());
		//System.out.println(lista.get(2).getNivel());	
		
		// 1� Exiba o total de todos os salarios;
		// 2� Exibam somente os sal�rios maior que 7000;
		
		for (Cargo objeto : lista) {
			System.out.println("Nome: " + objeto.getNome());
			System.out.println("Sal�rio: R$ " + objeto.getSalario());
		}
		
		float totalSalario = 0;
		
		for (Cargo objeto : lista) {
			totalSalario = totalSalario + objeto.getSalario();
		}
			System.out.println("\n1� -> Sal�rio: R$ " + totalSalario + "\n");
		
		for (Cargo objeto : lista) {
			if (objeto.getSalario() > 7000) {
				System.out.println("2� -> Nome: " + objeto.getNome());
				System.out.println("Sal�rio: R$ " + objeto.getSalario());
			}
			// System.out.println("Nome: " + objeto.getNome());
			// System.out.println("Sal�rio: R$ " + objeto.getSalario());
		}
		
		

	}

}
