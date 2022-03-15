package br.com.voemais.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Login implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idLogin;
	
	@Column(nullable = false)	
	private String email, senha;
	
	@ManyToOne
	@JoinColumn(name="idCadastro")
	private Cadastro idCadastro;
	
	public Login() {
		
	}

	public Login(String email, String senha, Cadastro idCadastro) {		
		this.email = email;
		this.senha = senha;
		this.idCadastro = idCadastro;
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

	@Override
	public String toString() {
		return "Login [idLogin=" + idLogin + ", email=" + email + ", senha=" + senha + ", idCadastro=" + idCadastro
				+ "]";
	}
	
	
	
	

}
