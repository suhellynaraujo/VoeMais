package br.com.voemais.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
	public Contato findById(Long idContato){
		Contato result = contatoRepository.findById(idContato).get();
		return result;
	}
	@Transactional
	public void save(Contato contato) {
		contatoRepository.save(contato);
		
	}
	@Transactional
	public void update(Contato contato) {
		contatoRepository.save(contato);
		
	}
	
	public void delete(Long id) {
		Optional<Contato> contato = contatoRepository.findById(id);
		if(contato.isPresent()) {
			contatoRepository.delete(contato.get());
			System.out.println(contato.get().getEmail());
		}else {
			System.out.println("Esse contato não existe");
		}
	}

	
	

}
