package br.com.excecoes.implementacao;

public class TesteExcecao {

	public static void main(String[] args) {
		// Exce��es: N�o s�o controladas pelo programador.
		// Existem dois tipos:
		// A -) Checked: o Java verifica antes da compila��o;
		// B -) Unchecked: s� ocorre ap�s a compila��o.
		
		try {
			int numero = Integer.parseInt("8");
			System.out.println("Resultado = " + (numero * 10));
			
			String email = null;
			if (email == null) {
				throw new RuntimeException("Dado corrompido");
			}
			System.out.println("Usu�rio: " + email.substring(0, email.indexOf("@")));
			
		} catch (NullPointerException e) {
			System.out.println("Objeto Nulo");
			
		} catch (NumberFormatException e) {
			System.out.println("Numero inv�lido");
				
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Coordenada inv�lida");
			
		} catch (Exception e) {
			System.out.println("Deu ruim");
			
			//Manter esse comando abaixo para que possa apontar os erros, ap�s validado pode deixar como coment�rio.
			e.printStackTrace();
		}finally {
			System.out.println("At� Logo");
		}

		
	}

}
