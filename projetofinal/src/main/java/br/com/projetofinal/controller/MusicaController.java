package br.com.projetofinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetofinal.beans.Musica;
import br.com.projetofinal.dao.MusicaDAO;

@RestController
@CrossOrigin("*")
public class MusicaController {

	@Autowired
	private MusicaDAO dao;
	
	@GetMapping ("/lancamento/{valor}")
	public ResponseEntity <List<Musica>> getLancamento(@PathVariable int valor){
		List<Musica> lista = (List<Musica>) dao.findByLancamento(valor);
		if (lista.size() == 0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(lista);
	}
	
	@PostMapping ("/novamusica")
	public ResponseEntity<Musica> add(@RequestBody Musica objeto){
		try {
			dao.save(objeto);
			return ResponseEntity.ok(objeto);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(403).build();
		}
	}
	
	@GetMapping ("/musicas")
	public ResponseEntity <List<Musica>> getAll() {
		List<Musica> lista = (List<Musica>) dao.findAll();
		if (lista.size() == 0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(lista);
	}
}
