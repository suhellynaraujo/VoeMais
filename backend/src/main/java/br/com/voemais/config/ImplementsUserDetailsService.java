/*package br.com.voemais.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

import br.com.voemais.entities.Login;
import br.com.voemais.repositories.LoginRepository;

@Repository
public class ImplementsUserDetailsService implements UserDetailsService{

	@Autowired
	private LoginRepository ur;
	
	@Override
	public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
		Login user = ur.findByLogin(login);
		
		if(user == null) {
			throw new UsernameNotFoundException("Usuario não encontrado");
		}
		return user;
	}

}
*/