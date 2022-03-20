package br.com.voemais.DTO;

import br.com.voemais.entities.Cadastro;
import br.com.voemais.entities.Login;

public class LoginDTO {
	
	private Long idLogin;
	private String email, senha;
	private Cadastro idCadastro;
	
	public LoginDTO() {
		
	}

	public LoginDTO(Long idLogin, String email, String senha, Cadastro idCadastro) {
		this.idLogin = idLogin;
		this.email = email;
		this.senha = senha;
		this.idCadastro = idCadastro;
	}

	public LoginDTO(Login login) {
		this.idLogin = login.getIdLogin();
		this.email = login.getEmail();
		this.senha = login.getSenha();
		this.idCadastro = login.getIdCadastro();
	}

	public Long getIdLogin() {
		return idLogin;
	}

	public void setIdLogin(Long idLogin) {
		this.idLogin = idLogin;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Cadastro getIdCadastro() {
		return idCadastro;
	}

	public void setIdCadastro(Cadastro idCadastro) {
		this.idCadastro = idCadastro;
	}
	
	
	
}
