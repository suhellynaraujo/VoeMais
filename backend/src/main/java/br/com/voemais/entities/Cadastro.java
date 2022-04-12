package br.com.voemais.entities;

import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table
public class Cadastro{
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCadastro;	
	private String nome, email, senha;
	
		
	@OneToMany(mappedBy = "idDestino")
	private List<Destino> destino;
	
	@OneToMany(mappedBy = "idLogin")
	private List<Login> login;
	
	public Cadastro() {
		
	}

	public Cadastro(Long idCadastro, String nome, String email, String senha) {
		super();
		this.idCadastro = idCadastro;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}

	

	public Long getIdCadastro() {
		return idCadastro;
	}

	public void setIdCadastro(Long idCadastro) {
		this.idCadastro = idCadastro;
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

	
	public List<Destino> getDestino() {
		return destino;
	}

	public void setDestino(List<Destino> destino) {
		this.destino = destino;
	}

	public List<Login> getLogin() {
		return login;
	}

	public void setLogin(List<Login> login) {
		this.login = login;
	}
	
	
	

}
