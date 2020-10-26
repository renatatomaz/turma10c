package br.com.ecommerce.beans;

public class PessoaFisica extends Cliente{ // esse extends significa herança no java, você indica quem é o pai. 
	//Sempre colocar o extends antes de montar o contrutor.

	private String cpf;
	private String rg;
	
	public void setAll (int id, String nome, String fone, Endereco endereco, String cpf, String rg) {
		super.setAll (id, nome, fone, endereco);
		this.cpf = cpf;
		this.rg = rg;
	}

	public String getAll () {
		return
				super.getAll() + "\n" + // precisamos colocar o super. para indicar qual informação queremos que retorne do classe super.
				"CPF: " + cpf + "\n" +
				"RG: " + rg;
	}
	
	// quando for montar o construtor cheio, temos que selecionar o cheio também da super classe.
	public PessoaFisica(int id, String nome, String fone, Endereco endereco, String cpf, String rg) {
		super(id, nome, fone, endereco);
		this.cpf = cpf;
		this.rg = rg;
	}
	
	// Quando for montar o construtor vazio, a opção da super class tem que estar vazio também.
	public PessoaFisica() {
		super();
	}
	
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	
}
