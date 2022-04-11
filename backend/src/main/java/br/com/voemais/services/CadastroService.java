package br.com.voemais.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.voemais.entities.Cadastro;
import br.com.voemais.repositories.CadastroRepository;

@Service
public class CadastroService{
	
	@Autowired
	private CadastroRepository cadastroRepository;
	
	@Transactional(readOnly = true)
	public List<Cadastro> findAll(){
		List<Cadastro> result = cadastroRepository.findAll();
		return result;
	}
	
	@Transactional(readOnly = true)
	public Cadastro findById(Long id){
		Cadastro result = cadastroRepository.findById(id).get();
		return result;
	}
	
	@Transactional(readOnly = true)
	public void save(Cadastro cadastro) {
		cadastroRepository.save(cadastro);
		
	}
	
	@Transactional(readOnly = true)
	public void update(Cadastro cadastro) {
		cadastroRepository.save(cadastro);
		
	}
	
	public void delete(Long id) {
		Optional<Cadastro> cadastro = cadastroRepository.findById(id);
		if(cadastro.isPresent()) {
			cadastroRepository.delete(cadastro.get());
			System.out.println(cadastro.get().getNome());
		}else {
			System.out.println("Esse cadastro não existe");
		}
	}

	public Cadastro getById(Long idCadastro) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
