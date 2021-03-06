package br.com.unixyz.modelo;

/*
 * Implanta��o = principal = teste (camada onde tem o main())
 * Modelo = beans = javabeans = dto = to
 * 
 * Design Patterns => DTO (Data Transfer Object)
 * - Todo atributo DEVE ser privado.
 * - Cada atributo deve possuir UM m�todo de INPUT (setter) e UM m�todo de OUTPUT (getter).
 * - Cada classe deve possuir no m�nimo dois construtores (um vazio e outro cheio - com todos os atributos)
 */

public class Aluno {

	private int rm;
	private String nome;
	private String email;
	
	public Aluno() {
		super(); // utilizado quando tem heran�a.
	}

	public Aluno(int rm, String nome, String email) {
		super();
		this.rm = rm;
		this.nome = nome;
		this.email = email;
	}

	public void setAll (int rm, String nome, String email) {
		this.rm = rm;
		this.nome = nome;
		this.email=email;
	}
	
	public String getAll () {
		return 
				"RM:" + rm + "\n" +
				"Nome:" + nome + "\n" +
				"Email:" + email + "\n";
	}
	
	public int getRm() {
		return rm;
	}
	public void setRm(int rm) {
		this.rm = rm;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
	
} // fecha a classe
