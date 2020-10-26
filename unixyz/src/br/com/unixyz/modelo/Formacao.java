package br.com.unixyz.modelo;

/*
 * Polimorfismo: � quando o mesmo m�todo possui possui comportamentos diferentes e o mesmo nome.
 * 2 tipos:
 * Overload (sobrecarga): quando os m�todos est�o na mesma classe, com assinaturas diferentes. Ex: retornar m�dia;
 * Override (sobrescrita): quando os m�todos est�o em classes diferentes, podem possuir a mesma assinatura. Ex: getAll.
 * 
 */

// Classe abstrata � quando n�o instanciamos esta classe
public class Formacao {

	private String descricao;
	private int duracao;
	private float mensalidade;
	
	public void calcMensalidade (double fator) {} // Para atender os metodos das subclasses
	
	public float retornarMedia (float n1, float n2) {
		return 
				n1 * (float) 0.5 + n2 * (float) 0.5;
	}
	
	public float retornarMedia (float n1, float n2, float proj1, float proj2) {
		return 
				n1 * (float)0.4 + n2 * (float)0.4 + proj1 * (float) 0.10 + proj2 * (float) 0.10;
	}
	
	public String getAll () {
		return
				"Descri��o: " + descricao + "\n" +
				"Dura��o curso: " + duracao + "\n" +
				"Mensalidade: " + mensalidade;
	}
	
	public void setAll (String descricao, int duracao, float mensalidade) {
		this.descricao = descricao;
		this.duracao = duracao;
		this.mensalidade = mensalidade;
	}

	public Formacao() {
		super();
	}

	public Formacao(String descricao, int duracao, float mensalidade) {
		super();
		this.descricao = descricao;
		this.duracao = duracao;
		this.mensalidade = mensalidade;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	public float getMensalidade() {
		return mensalidade;
	}
	public void setMensalidade(float mensalidade) {
		this.mensalidade = mensalidade;
	}
	
	
}
