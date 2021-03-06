package br.com.ecommerce.implementacao;

import br.com.ecommerce.beans.Cliente;
import br.com.ecommerce.beans.Endereco;
import br.com.ecommerce.beans.PessoaFisica;
import br.com.ecommerce.beans.PessoaJuridica;
import br.com.ecommerce.util.Magica;

public class ImplementarCliente {

	public static void main(String[] args) {
		Cliente c = new Cliente();
		
		int resposta = Magica.i("Digite <1> PF ou <2> PJ");
		if (resposta == 1) {
			c = new PessoaFisica (
					1,
					"Regina",
					"1244-8870",
					new Endereco (),
					"402.913.158-10",
					"35.437.484-9"
					);
		} else if (resposta == 2) {
			c = new PessoaJuridica (
					2,
					"churros ltda",
					"5546-9987",
					new Endereco (),
					"00.000.000/0001-99",
					"887.000.001.002",
					"Sr JOAOZINHO"
					);
			
		}

		System.out.println(c.getAll());
		
		
		
	} // fecha o main

} // fecha a classe
