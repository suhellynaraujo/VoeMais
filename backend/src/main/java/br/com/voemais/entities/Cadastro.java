package br.com.voemais.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cadastro implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCadastro;
	
	@Column(nullable = false)
	private String nome, email, senha;	
	
	@OneToMany(mappedBy= "Login")
	private List<Login> login;
	
	@OneToMany(mappedBy= "Destino")
	private List<Destino> destino;

	
	public Cadastro() {
		
	}

	public Cadastro(String nome, String email, String senha) {
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}

	public Long getId() {
		return idCadastro;
	}

	public void setId(Long id) {
		this.idCadastro = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	@Override
	public int hashCode() {
		return Objects.hash(idCadastro);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cadastro other = (Cadastro) obj;
		return Objects.equals(idCadastro, other.idCadastro);
	}

	@Override
	public String toString() {
		return "Cadastro [id=" + idCadastro + ", nome=" + nome + ", email=" + email + ", senha=" + senha + "]";
	}
	
	

}
