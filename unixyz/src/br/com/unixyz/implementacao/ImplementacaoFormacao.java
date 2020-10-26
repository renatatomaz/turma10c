package br.com.unixyz.implementacao;

import br.com.unixyz.modelo.Bacharelado;
import br.com.unixyz.modelo.Formacao;
import br.com.unixyz.modelo.Medio;
import br.com.unixyz.modelo.Tecnologo;
import br.com.unixyz.util.Magica;

public class ImplementacaoFormacao {

	public static void main(String[] args) {
		Formacao form = null;
		
		char resposta = Magica.s("Digite <T> Tecnologo <B> Bacharelado ou <M> Medio").charAt(0);
		if (resposta == 'T') {
			form = new Tecnologo (
					Magica.s("Descrição"),
					Magica.i("Duração"),
					Magica.f("Mensalidade"),
					true
					);
		} else if ( resposta == 'B') {
			form = new Bacharelado (
					Magica.s("Descrição"),
					Magica.i("Duração"),
					Magica.f("Mensalidade"),
					Magica.i("Carga Horario Estagio"),
					Magica.s("TCC")
					);
		} else {
			form = new Medio (
					Magica.s("Descrição"),
					Magica.i("Duração"),
					Magica.f("Mensalidade"),
					Magica.s("Tipo")
					);
		}
		
		form.calcMensalidade(0.005);
		System.out.println(form.getAll());
		System.out.println(form.retornarMedia(5, 7, 4, 10));

		
	}

}
