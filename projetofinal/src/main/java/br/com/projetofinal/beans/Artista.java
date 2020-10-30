package br.com.projetofinal.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
	
	@JsonIgnoreProperties("artista")
	@OneToMany(mappedBy = "artista", cascade = CascadeType.ALL)
	// cascade = Pergunta o que fazer se você alterar ou excluir o artista? Ele irá refletir o mesmo que for feito em musica.
	private List<Musica> musicas;
	
	
	public List<Musica> getMusicas() {
		return musicas;
	}

	public void setMusicas(List<Musica> musicas) {
		this.musicas = musicas;
	}

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
