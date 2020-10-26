package variaveis;

public class ManipulaString {

	public static void main(String[] args) {

		String email = "reGina@gAma.aCaDemy";
		System.out.println("Original: " + email);
		System.out.println("Minuscula: " + email.toLowerCase());
		System.out.println("Maiusculas: " + email.toUpperCase());
		System.out.println("Quantidade de cartacteres: " + email.length());
		System.out.println("Posi��o do @: " + email.indexOf("@"));
		System.out.println("Exibir do 2� at� o 4�: " + email.substring(1, 4));
		System.out.println("Do 3� em diante: " + email.substring(2));
		System.out.println("Primeira metade: " + email.substring(0, email.length()/2));
		
		// Exibir o servidor do email antes do @
		System.out.println("Usu�rio antes do @: " + email.substring(0, email.indexOf("@")));
		
		//Exibir servidor do email depois do @
		System.out.println("Servidor depois do @: " + email.substring(email.indexOf("@")+1));
		
		// Extrair determinado caracter do texto
		System.out.println("Primeiro Caracter: " + email.charAt(4));

		// Comparando, usar sempmre equals e n�o ==
		System.out.println("Comparando com == " + (email=="reGina@gAma.aCaDemy"));
		System.out.println("Compara��o: " + email.equals("reGina@gAma.aCaDemy"));
		System.out.println("Compara��o ignorando caixa: " + email.equalsIgnoreCase("REGINA@gAma.aCaDemy"));
		
	}

}
