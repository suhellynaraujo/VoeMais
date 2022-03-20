package br.com.voemais.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;


@Entity
public class Cadastro implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCadastro;
	
	@Column
	@NotBlank
	private String nome;
	
	@Column
	@Email
	private String email;
	
	@Column
	@NotBlank
	private String senha;
	
	@OneToMany(mappedBy = "idDestino")
	private Set<Destino> destino = new HashSet<>();
	
	@OneToMany(mappedBy = "idLogin")
	private Set<Login> login = new HashSet<>();
	
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
