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
public class Destino{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDestino;
	private String nome, cidade, uf, ida, volta;

	@ManyToOne
	@JoinColumn(name="idCadastro")
	private Cadastro cadastro;
	
	public Destino() {
		
	}
	
	
	public Destino(String nome, String cidade, String uf, String ida, String volta, Cadastro idCadastro) {		
		this.nome = nome;
		this.cidade = cidade;
		this.uf = uf;
		this.ida = ida;
		this.volta = volta;
		this.cadastro = idCadastro;
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

	public Cadastro getCadastro() {
		return cadastro;
	}

	public void setCadastro(Cadastro idCadastro) {
		this.cadastro = idCadastro;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idDestino);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Destino other = (Destino) obj;
		return Objects.equals(idDestino, other.idDestino);
	}

	
	

}
