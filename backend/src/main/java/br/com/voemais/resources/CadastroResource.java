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

import br.com.voemais.DTO.CadastroDTO;
import br.com.voemais.entities.Cadastro;
import br.com.voemais.services.CadastroService;

@RestController
@RequestMapping("/cadastro")
@CrossOrigin(origins = "http://localhost:3000")
public class CadastroResource {
	
	@Autowired
	private CadastroService cadastroService;
	
	@GetMapping
	public List<Cadastro> findAll(){
		return cadastroService.findAll();
	}
	
	@GetMapping(value = "/{id}")
	public CadastroDTO findById(@PathVariable Long id) {	
		return cadastroService.findById(id);	
		
	}
	
	@PostMapping("/salvar")
	public ResponseEntity<Cadastro> save(@RequestBody @Valid Cadastro cadastro){
		cadastroService.save(cadastro);
		return ResponseEntity.ok().body(cadastro);
		
	}
	
	@PutMapping("/atualizar")
	public ResponseEntity<Cadastro> update(@RequestBody @Valid Cadastro cadastro){
		cadastroService.save(cadastro);
		return ResponseEntity.ok().body(cadastro);
		
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Cadastro> delete(@PathVariable Long id){
		cadastroService.delete(id);
		Cadastro result = cadastroService.getById(id);
		return ResponseEntity.ok().body(result);
		
	}
	
	
}
