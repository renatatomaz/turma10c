package br.com.colecoes.implementacao;

import java.util.HashSet;
import java.util.Set;

public class TesteSet {

	public static void main(String[] args) {
		// SET n�o aceita elementos repetidos, diferente o LIST. 
		// Mostra o resultado, as informa�oes na sequencia em que ele aloca na memoria.
		// N�o coloca na sequ�ncia informada, ele verifica a melhor forma de alocar na memoria e ir� apresentar dessa forma.
		
		Set <String> lista = new HashSet <String> ();
		
		lista.add("DBA");
		lista.add("ANALISTA");
		lista.add("INFRA");
		lista.add("DEVOPS");
		lista.add("DBA");
		lista.add("DEV");
		lista.add("ESTAGIARIO");
		
		System.out.println(lista);
		
		// N�o � poss�vel colocar em ordem alfabetica.
		// Para o SET � obrigatorio usar o Foreach, o outro FOR n�o funciona.
		// SET n�o existe indice, a ordena��o que prevalece � a ordena��o de Hash.
		
		for (String elemento : lista) {
			System.out.println("Cargo: " + elemento);
		}
		
		
		
		
		
		
		
		

	}

}