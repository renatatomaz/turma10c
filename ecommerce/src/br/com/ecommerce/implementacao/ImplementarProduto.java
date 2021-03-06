package br.com.ecommerce.implementacao;

import br.com.ecommerce.beans.Produto;
import br.com.ecommerce.util.Magica;

public class ImplementarProduto {

	public static void main(String[] args) {
		
		Produto p = new Produto ();
		
		p.setQuantidade(Magica.i("Quantidade"));
		p.setValorCompra(Magica.f("Compra"));
		p.setValorVenda(Magica.f("Venda"));
		
		// getDesconto () ajustarValores() totalCompras() totalVenda()
				
		System.out.println("Total de Compra: " + p.totalCompra());
		System.out.println("Total de Venda: " + p.totalVenda());
		System.out.println("Venda com 10%: " + p.getDesconto());
		System.out.println("Venda com x%: " + p.getDesconto(Magica.f("Porcentagem")));
		
		p.ajustarValores(Magica.f("Valor a ser adicionado"));
		System.out.println("Valor Compra: R$ " + p.getValorCompra());
		System.out.println("Valor Venda: R$ " + p.getValorVenda());
		
	}

}
