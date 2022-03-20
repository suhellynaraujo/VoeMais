package br.com.voemais.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.voemais.DTO.CadastroDTO;
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
	public CadastroDTO findById(Long id){
		Cadastro result = cadastroRepository.findById(id).get();
		CadastroDTO dto = new CadastroDTO(result);
		return dto;
	}
	@Transactional(readOnly = true)
	public void save(Cadastro cadastro) {
		cadastroRepository.save(cadastro);
		
	}
	

	/*public void delete(Long id) {
		Optional<Cadastro> cadastro = cadastroRepository.findById(id);
		cadastroRepository.delete(cadastro.get());
		
	}*/
	
	public void delete(Long id) {
		Optional<Cadastro> cadastro = cadastroRepository.findById(id);
		if(cadastro.isPresent()) {
			cadastroRepository.delete(cadastro.get());
			System.out.println(cadastro.get().getNome());
		}else {
			System.out.println("Esse cadastro não existe");
		}
	}

	public Cadastro getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
