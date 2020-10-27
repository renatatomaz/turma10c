package br.com.projetofinal.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "TB_ARTISTA")
public class Artista {
	
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "nomeartistico", length = 50)
	private String nome;
	
	@Column(name = "nacionalidade", length = 30)
	private String nacionalidade;
	
	
	public Artista() {
		super();
	}

	public Artista(int id, String nome, String nacionalidade) {
		super();
		this.id = id;
		this.nome = nome;
		this.nacionalidade = nacionalidade;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

}
