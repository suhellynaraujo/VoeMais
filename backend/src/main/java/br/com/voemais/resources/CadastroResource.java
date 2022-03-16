package br.com.voemais.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.voemais.entities.Cadastro;
import br.com.voemais.services.CadastroService;

@RestController
@RequestMapping("/cadastro")
public class CadastroResource {
	
	@Autowired
	private CadastroService cadastroService;
	
	@GetMapping("/")
	public List<Cadastro> findAll(){
		return cadastroService.findAll();
	}

}
