package br.com.voemais.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.voemais.entities.Cadastro;
import br.com.voemais.entities.Destino;
import br.com.voemais.repositories.DestinoRepository;

@Service
public class DestinoService {
	
	@Autowired
	private DestinoRepository destinoRepository;

	@Transactional(readOnly = true)
	public List<Destino> findAll(){
		List<Destino> result = destinoRepository.findAll();
		return result;
	}

	@Transactional(readOnly = true)
	public Destino findById(Long idDestino){
		Destino result = destinoRepository.findById(idDestino).get();

		return result;
	}
	public void save(Destino destino) {
		try {
			destinoRepository.save(destino);
			
		} catch (Exception ex) {
			throw ex;
		}
				
	}
	
	public void update(Destino destino) {
		try {
			destinoRepository.save(destino);
			
		} catch (Exception ex) {
			throw ex;
		}
				
	}
	
	public void delete(Long idDestino) {
		Optional<Destino> destino = destinoRepository.findById(idDestino);
		if(destino.isPresent()) {
			destinoRepository.delete(destino.get());
			System.out.println(destino.get().getNome());
		}else {
			System.out.println("Destino não existe");
		}
	}
	
	public Destino getById(Long idDedtino) {
		// TODO Auto-generated method stub
		return null;
	}


}
