package com.projsaude.api.documents;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Almoxarifado {

	@Id
	private String id;
	
	private String nome;
	private String cnes;
	private String endereco;
	private String bairro;
	private String cep;
	private String municipio;
	private String telefone;
	private String idInstituicaoAssociada;
	private String longetude;
	private String latitude;
	private String categoria;
	
	public Almoxarifado () {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@NotEmpty
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@NotEmpty
	public String getCnes() {
		return cnes;
	}

	public void setCnes(String cnes) {
		this.cnes = cnes;
	}

	@NotEmpty
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@NotEmpty
	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	@NotEmpty
	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	@NotEmpty
	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	@NotEmpty
	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@NotEmpty
	public String getIdInstituicaoAssociada() {
		return idInstituicaoAssociada;
	}

	public void setIdInstituicaoAssociada(String idInstituicaoAssociada) {
		this.idInstituicaoAssociada = idInstituicaoAssociada;
	}

	@NotEmpty
	public String getLongetude() {
		return longetude;
	}

	public void setLongetude(String longetude) {
		this.longetude = longetude;
	}

	@NotEmpty
	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	
	
	
}
