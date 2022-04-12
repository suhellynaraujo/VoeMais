package br.com.voemais.entities;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Login {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idLogin;
	private String email, senha;	
	
	@ManyToOne
	@JoinColumn(name="idCadastro")
	private Cadastro cadastro;	
	
	public Login() {
		
	}
	
	public Login(Long idLogin, String email, String senha) {
		super();
		this.idLogin = idLogin;
		this.email = email;
		this.senha = senha;
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
		return cadastro;
	}

	public void setIdCadastro(Cadastro idCadastro) {
		this.cadastro = idCadastro;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idLogin);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Login other = (Login) obj;
		return Objects.equals(idLogin, other.idLogin);
	}


	
	

}
