package br.com.voemais.DTO;

import br.com.voemais.entities.Cadastro;
import br.com.voemais.entities.Destino;

public class DestinoDTO {
	
	private Long idDestino;
	private String nome, cidade, uf, ida, volta;
	private Cadastro idCadastro;
	
	public DestinoDTO() {
		
	}

	public DestinoDTO(Long idDestino, String nome, String cidade, String uf, String ida, String volta,
			Cadastro idCadastro) {

		this.idDestino = idDestino;
		this.nome = nome;
		this.cidade = cidade;
		this.uf = uf;
		this.ida = ida;
		this.volta = volta;
		this.idCadastro = idCadastro;
	}


	public DestinoDTO(Destino destino) {

		this.idDestino = destino.getIdDestino();
		this.nome = destino.getNome();
		this.cidade = destino.getCidade();
		this.uf = destino.getUf();
		this.ida = destino.getIda();
		this.volta = destino.getVolta();
		this.idCadastro = destino.getIdCadastro();
	}

	public Long getIdDestino() {
		return idDestino;
	}

	public void setIdDestino(Long idDestino) {
		this.idDestino = idDestino;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getIda() {
		return ida;
	}

	public void setIda(String ida) {
		this.ida = ida;
	}

	public String getVolta() {
		return volta;
	}

	public void setVolta(String volta) {
		this.volta = volta;
	}

	public Cadastro getIdCadastro() {
		return idCadastro;
	}

	public void setIdCadastro(Cadastro idCadastro) {
		this.idCadastro = idCadastro;
	}
}
