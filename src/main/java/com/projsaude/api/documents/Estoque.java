package com.projsaude.api.documents;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Estoque {

	@Id
	private String id;
	private String tipoInsumo;
	private String nome;
	private String quantide;
	
	public Estoque () {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@NotEmpty
	public String getTipoInsumo() {
		return tipoInsumo;
	}

	public void setTipoInsumo(String tipoInsumo) {
		this.tipoInsumo = tipoInsumo;
	}

	@NotEmpty
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@NotEmpty
	public String getQuantide() {
		return quantide;
	}

	public void setQuantide(String quantide) {
		this.quantide = quantide;
	}

	
	
	
}
