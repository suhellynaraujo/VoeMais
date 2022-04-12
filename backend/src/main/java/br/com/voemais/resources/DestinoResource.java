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

import br.com.voemais.entities.Destino;
import br.com.voemais.services.DestinoService;

@RestController
@RequestMapping("/destino")
@CrossOrigin(origins = "https://voe-mais.herokuapp.com")
public class DestinoResource {
	
	@Autowired
	private DestinoService destinoService;
	
	@GetMapping
	public List<Destino> findAll(){
		return destinoService.findAll();
	}

	@GetMapping(value = "/{id}")
	public Destino findById(@PathVariable Long idDestino) {	
		return destinoService.findById(idDestino);
	}

	@PostMapping(value ="/salvar")
	public ResponseEntity<Destino> save(@RequestBody Destino destino){
		destinoService.save(destino);		
		return ResponseEntity.ok().body(destino);
	}
	@PutMapping(value = "/atualizar")
	public ResponseEntity<Destino> update(@RequestBody Destino destino){
		destinoService.save(destino);
		return ResponseEntity.ok().body(destino);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Destino> delete(@PathVariable Long idDestino){
		destinoService.delete(idDestino);
		Destino result = destinoService.getById(idDestino);
		return ResponseEntity.ok().body(result);
		
	}
}
