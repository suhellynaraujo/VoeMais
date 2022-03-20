package br.com.voemais.DTO;

import br.com.voemais.entities.Cadastro;

public class CadastroDTO {
	private Long idCadastro;
	private String nome, email, senha;	
	
	public CadastroDTO() {
		
	}

	public CadastroDTO(Long idCadastro, String nome, String email, String senha) {
		this.idCadastro = idCadastro;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}
	public CadastroDTO(Cadastro cadastro) {
		this.idCadastro = cadastro.getId();
		this.nome = cadastro.getNome();
		this.email = cadastro.getEmail();
		this.senha = cadastro.getSenha();
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


}
