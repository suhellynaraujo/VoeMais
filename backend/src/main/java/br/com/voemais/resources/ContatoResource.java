package br.com.voemais.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.voemais.services.ContatoService;

@RestController
@RequestMapping("/Contato")
public class ContatoResource {
	
	@Autowired
	private ContatoService contatoService;

}
