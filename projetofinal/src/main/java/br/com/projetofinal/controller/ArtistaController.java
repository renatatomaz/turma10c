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

import br.com.projetofinal.beans.Artista;
import br.com.projetofinal.dao.ArtistaDAO;

@RestController
@CrossOrigin("*")
public class ArtistaController {

	@Autowired
	private ArtistaDAO dao;

	@GetMapping("/todosartistas")
	public ResponseEntity <List <Artista>> getAll (){
		List <Artista> lista = (List <Artista>) dao.findAll();
		if (lista.size() == 0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(lista);
	}

	@GetMapping("/artista/{cod}") // Variavel da URL indica por {}
	public ResponseEntity <Artista> pesquisarArtista (@PathVariable int cod) {
		Artista objeto = dao.findById(cod).orElse(null);
		if (objeto == null) {
			return ResponseEntity.status(404).build();
		} 
		return ResponseEntity.ok(objeto);			
	}

	// Se quiser retorno de mensagem fica como abaixo. Geralmente não tem mensagem, isso é tarefa do frontend.
	@GetMapping("/deletarartista/{cod}") // Variavel da URL indica por {}
	public String deletarArtista (@PathVariable int cod) {
		dao.deleteById(cod);
		return "Apagado com sucesso";
	}

	// se não quiser nenhum retorno após deletar fica assim:
	//@GetMapping("/deletarartista/{cod}") // Variavel da URL indica por {}
	// public void deletarArtista (@PathVariable int cod) {
	// dao.deleteById(cod);
	//}

	@PostMapping ("/loginartista")
	public ResponseEntity <Artista> gravar(@RequestBody Artista objeto) {
		try{
			Artista resposta = dao.save(objeto);
			return ResponseEntity.ok(resposta);
		}catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(403).build();
		}
	}

	@GetMapping("/nacionalidade/{nac}") // Variavel da URL indica por {}
	public ResponseEntity <List <Artista>> pesquisarNacionalidade (@PathVariable String nac) {
		List <Artista> nacion = (List <Artista>) dao.findByNacionalidade(nac);
		if (nacion.size() == 0) {
			return ResponseEntity.status(404).build();
		}
	    	return ResponseEntity.ok(nacion);			
	}

	@PostMapping ("/pesqnac")
	public ResponseEntity <List<Artista>> pesquisa (@RequestBody Artista objeto) {
		List <Artista> pesquisa = dao.findByNacionalidade(objeto.getNacionalidade());
		if (pesquisa == null) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(pesquisa);
	}



}
