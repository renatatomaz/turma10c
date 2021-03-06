package br.com.unixyz.implementacao;

import br.com.unixyz.modelo.Endereco;
import br.com.unixyz.modelo.Professor;
import br.com.unixyz.util.Magica;

public class ImplementarProfessor {
	
	public static void main(String[] args) {
		
		Professor prof = new Professor();
		Endereco endereco = new Endereco ();
				
		prof.setId(Magica.i("ID"));
		prof.setNome(Magica.s("Nome"));
		prof.setFormacao(Magica.s("Forma��o"));
		
		// MUITO IMPORTANTE
		prof.setEndereco(endereco);
		//NUNCA esquecer de atribuir o objeto
		
		endereco.setLogradouro(Magica.s("Logradouro"));
		endereco.setNumero(Magica.s("Numero"));
		endereco.setComplemento(Magica.s("Complemento"));
		endereco.setBairro(Magica.s("Bairro"));
		endereco.setCidade(Magica.s("Cidade"));
		endereco.setEstado(Magica.s("Estado"));
		endereco.setCep(Magica.s("CEP"));
		
		System.out.println(prof.getAll());
		System.out.println(endereco.getCidade());// s� funcionou pq eu estava com o objeto endere�o aqui sen�o n�o iria funcionar.
		System.out.println(prof.getEndereco().getCidade());
		
	}

}
