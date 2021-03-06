package br.com.ecommerce.implementacao;

import br.com.ecommerce.beans.Cliente;
import br.com.ecommerce.beans.Endereco;
import br.com.ecommerce.beans.Produto;
import br.com.ecommerce.beans.Venda;
import br.com.ecommerce.util.Magica;

public class ImplementacaoVenda {

	public static void main(String[] args) {

		Venda venda = new Venda(
				Magica.i("Nota Fiscal"),
				Magica.f("Total Venda"),
				Magica.f("Desconto da Venda"),
				Magica.s("Data Venda"),
				new Cliente (
						Magica.i("ID Cliente"),
						Magica.s("Nome Cliente"),
						Magica.s("Telefone Cliente"),
						new Endereco (
								Magica.s("Logradouro"),
								Magica.s("N�mero"),
								Magica.s("Complemento"),
								Magica.s("Bairro"),
								Magica.s("Cidade"),
								Magica.s("Estado"),
								Magica.s("CEP")
								)
						),		
				new Produto (
						Magica.i("ID Produto"),
						Magica.s("Descri��o Produto"),
						Magica.f("Valor de venda produto"),
						Magica.f("Valor de Compra produto"),
						Magica.i("Quantidade de produto")						
						)
				);
		
		System.out.println(venda.getAll());
		//System.out.println(venda.getCliente().getEndereco());
		//System.out.println(venda.getCliente().getAll());
		// System.out.println(venda.getProduto().getAll());

	}

}
