package br.com.voemais.DTO;

import br.com.voemais.entities.Contato;

public class ContatoDTO {
	
	private Long idContato;
	private String email,mensagem;
	
	public ContatoDTO() {
		
	}

	public ContatoDTO(Long idContato, String email, String mensagem) {

		this.idContato = idContato;
		this.email = email;
		this.mensagem = mensagem;
	}
	public ContatoDTO(Contato contato) {
		
		this.idContato = contato.getIdContato();
		this.email = contato.getEmail();
		this.mensagem = contato.getMensagem();
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

}
