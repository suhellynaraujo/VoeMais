package br.com.voemais.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.voemais.DTO.ContatoDTO;
import br.com.voemais.entities.Contato;
import br.com.voemais.repositories.ContatoRepository;

@Service
public class ContatoService {
	
	@Autowired
	private ContatoRepository contatoRepository;

	@Transactional(readOnly = true)
	public List<Contato> findAll(){
		List<Contato> result = contatoRepository.findAll();
		return result;
	}

	@Transactional(readOnly = true)
	public ContatoDTO findById(Long idContato){
		Contato result = contatoRepository.findById(idContato).get();
		ContatoDTO dto = new ContatoDTO(result);
		return dto;
	}
	@Transactional
	public void save(Contato contato) {
		contatoRepository.save(contato);
		
	}
	
	

}
