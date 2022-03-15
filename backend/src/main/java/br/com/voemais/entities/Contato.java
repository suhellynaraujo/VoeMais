package br.com.voemais.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contato implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idContato;
	@Column(nullable = false)
	private String email,mensagem;
	
	
	public Contato() {
		
	}


	public Contato(String email, String mensagem) {		
		this.email = email;
		this.mensagem = mensagem;
	}


	public Long getIdContato() {
		return idContato;
	}


	public void setIdContato(Long idContato) {
		this.idContato = idContato;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getMensagem() {
		return mensagem;
	}


	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}


	@Override
	public int hashCode() {
		return Objects.hash(idContato);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contato other = (Contato) obj;
		return Objects.equals(idContato, other.idContato);
	}


	@Override
	public String toString() {
		return "Contato [idContato=" + idContato + ", email=" + email + ", mensagem=" + mensagem + "]";
	}
	
	
	
	
}
