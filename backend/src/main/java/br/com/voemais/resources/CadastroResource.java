package br.com.voemais.resources;

import java.util.List;

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

import br.com.voemais.entities.Cadastro;
import br.com.voemais.services.CadastroService;

@RestController
@RequestMapping("/cadastro")
@CrossOrigin(origins = "https://voemais.netlify.app/")
public class CadastroResource {
	
	@Autowired
	private CadastroService cadastroService;
	
	@GetMapping
	public List<Cadastro> findAll(){
		return cadastroService.findAll();
	}

	@GetMapping(value = "/{idCadastro}")
	public Cadastro findById(@PathVariable Long idCadastro) {	
		return cadastroService.findById(idCadastro);	
		
	}
	
	@PostMapping(value ="/salvar")
	public ResponseEntity<Cadastro> save(@RequestBody  Cadastro cadastro){
		cadastroService.save(cadastro);
		return ResponseEntity.ok().body(cadastro);
		
	}
	
	@PutMapping(value ="/atualizar")
	public ResponseEntity<Cadastro> update(@RequestBody Cadastro cadastro){
		cadastroService.save(cadastro);
		return ResponseEntity.ok().body(cadastro);
		
	}
	
	@DeleteMapping(value = "/{idCadastro}")
	public ResponseEntity<Cadastro> delete(@PathVariable Long idCadastro){
		cadastroService.delete(idCadastro);
		Cadastro result = cadastroService.getById(idCadastro);
		return ResponseEntity.ok().body(result);
		
	}
	
}
