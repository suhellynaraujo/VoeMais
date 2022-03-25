package br.com.voemais.resources;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.voemais.entities.Contato;
import br.com.voemais.services.ContatoService;

@RestController
@RequestMapping("/contato")
@CrossOrigin(origins = "http://localhost:3000")
public class ContatoResource {
	
	@Autowired
	private ContatoService contatoService;	
	
	@GetMapping
	public List<Contato> findAll(){
		return contatoService.findAll();
	}
	

	@PostMapping(value ="/salvar")
	public ResponseEntity<Contato> save(@RequestBody Contato contato){
		contatoService.save(contato);
		return ResponseEntity.ok().body(contato);
	}
	
	@PutMapping(value = "/atualizar")
	public ResponseEntity<Contato> update(@RequestBody @Valid Contato contato){
		contatoService.save(contato);
		return ResponseEntity.ok().body(contato);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Contato> delete(@PathVariable Long id){
		contatoService.delete(id);
		Contato result = contatoService.findById(id);
		return ResponseEntity.ok().body(result);
		
	}

}
