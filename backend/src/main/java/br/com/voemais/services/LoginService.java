package br.com.voemais.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.voemais.DTO.LoginDTO;
import br.com.voemais.entities.Login;
import br.com.voemais.repositories.LoginRepository;

@Service
public class LoginService {
	
	@Autowired
	private LoginRepository loginRepository;

	@Transactional(readOnly = true)
	public List<Login> findAll(){
		List<Login> result = loginRepository.findAll();
		return result;
	}
	
	@Transactional(readOnly = true)
	public LoginDTO findById(Long idLogin){
		Login result = loginRepository.findById(idLogin).get();
		LoginDTO dto = new LoginDTO(result);
		return dto;
	}
	
	@Transactional
	public void save(Login login) {
		loginRepository.save(login);
		
	}
	@Transactional
	public void update(Login login) {
		loginRepository.save(login);
		
	}
	
	public void delete(Long id) {
		Optional<Login> login = loginRepository.findById(id);
		if(login.isPresent()) {
			loginRepository.delete(login.get());
			System.out.println(login.get().getEmail());
		}else {
			System.out.println("Esse cadastro não existe");
		}
	}

	
	
	
	
	

}
