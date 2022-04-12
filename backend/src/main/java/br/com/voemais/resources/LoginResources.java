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

import br.com.voemais.entities.Login;
import br.com.voemais.services.LoginService;

@RestController
@RequestMapping("/login")
@CrossOrigin(origins = "https://voe-mais.herokuapp.com")
public class LoginResources {
	
	@Autowired
	private LoginService logingService;
	
	@GetMapping
	public List<Login> findAll(){
		return logingService.findAll();
	}

	@GetMapping(value = "/{id}")
	public Login findById(@PathVariable Long idLogin) {	
		return logingService.findById(idLogin);
	}

	@PostMapping(value = "/salvar")
	public ResponseEntity<Login> save(@RequestBody  Login login){
		logingService.save(login);
		return ResponseEntity.ok().body(login);
	}
	
	@PutMapping(value = "/atualizar")
	public ResponseEntity<Login> update(@RequestBody  Login login){
		logingService.save(login);
		return ResponseEntity.ok().body(login);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Login> delete(@PathVariable Long id){
		logingService.delete(id);
		Login result = logingService.findById(id);
		return ResponseEntity.ok().body(result);
		
	}
	

}
