package br.com.projetofinal.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.projetofinal.beans.Musica;

public interface MusicaDAO extends CrudRepository <Musica, Integer> {
	
	List<Musica> findByLancamento (int lancamento);
	

}
