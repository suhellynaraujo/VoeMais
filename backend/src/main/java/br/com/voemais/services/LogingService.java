package br.com.voemais.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.voemais.repositories.LoginRepository;

@Service
public class LogingService {
	
	@Autowired
	private LoginRepository loginRepository;

}
