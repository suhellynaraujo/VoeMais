package br.com.voemais.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.voemais.entities.Cadastro;
import br.com.voemais.repositories.CadastroRepository;

@Service
public class CadastroService {
	
	@Autowired
	private CadastroRepository cadastroRepository;
	
	@Transactional(readOnly = true)
	public List<Cadastro> findAll(){
		List<Cadastro> result = cadastroRepository.findAll();
		return result;
	}
	

}
