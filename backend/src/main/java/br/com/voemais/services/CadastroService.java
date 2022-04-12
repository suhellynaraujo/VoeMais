package br.com.voemais.services;

import java.util.List;
import java.util.Optional;

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

	@Transactional(readOnly = true)
	public Cadastro findById(Long idCadastro){
		Cadastro result = cadastroRepository.findById(idCadastro).get();
		return result;
	}
	
	public Cadastro getById(Long idCadastro) {
		 Optional<Cadastro> destino = cadastroRepository.findById(idCadastro);
		 if(destino.isPresent()) {
			 return destino.get();
		 }else {
			 return null;
		 }
	}
	
	public void save(Cadastro cadastro) {
		try {
			cadastroRepository.save(cadastro);
			
		} catch (Exception ex) {
			throw ex;
		}
				
	}
	
	public void update(Cadastro cadastro) {
		try {
			cadastroRepository.save(cadastro);
			
		} catch (Exception ex) {
			throw ex;
		}
				
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

}
