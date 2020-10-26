package br.com.excecoes.implementacao;

public class TesteExcecao {

	public static void main(String[] args) {
		// Exceções: Não são controladas pelo programador.
		// Existem dois tipos:
		// A -) Checked: o Java verifica antes da compilação;
		// B -) Unchecked: só ocorre após a compilação.
		
		try {
			int numero = Integer.parseInt("8");
			System.out.println("Resultado = " + (numero * 10));
			
			String email = null;
			if (email == null) {
				throw new RuntimeException("Dado corrompido");
			}
			System.out.println("Usuário: " + email.substring(0, email.indexOf("@")));
			
		} catch (NullPointerException e) {
			System.out.println("Objeto Nulo");
			
		} catch (NumberFormatException e) {
			System.out.println("Numero inválido");
				
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Coordenada inválida");
			
		} catch (Exception e) {
			System.out.println("Deu ruim");
			
			//Manter esse comando abaixo para que possa apontar os erros, após validado pode deixar como comentário.
			e.printStackTrace();
		}finally {
			System.out.println("Até Logo");
		}

		
	}

}
