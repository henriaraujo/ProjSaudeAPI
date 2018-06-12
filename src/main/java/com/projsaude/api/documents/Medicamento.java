package com.projsaude.api.documents;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Medicamento {

	@Id
	private String id;
	private String nome;
	private String nomeGenerico;
	private String concentracaoOuComposicao;
	private String formaFarmaceutica;
	
	public Medicamento () {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@NotEmpty(message = "O nome não pode ser vazio")
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@NotEmpty(message = "O nome genérico não pode ser vazio")
	public String getNomeGenerico() {
		return nomeGenerico;
	}

	public void setNomeGenerico(String nomeGenerico) {
		this.nomeGenerico = nomeGenerico;
	}


	public String getConcetracaoOuComposicao() {
		return concentracaoOuComposicao;
	}

	public void setConcetracaoOuComposicao(String concentracaoOuComposicao) {
		this.concentracaoOuComposicao = concentracaoOuComposicao;
	}

	@NotEmpty(message = "A forma farmacêutica não pode ser vazia")
	public String getFormaFarmaceutica() {
		return formaFarmaceutica;
	}

	public void setFormaFarmaceutica(String formaFarmaceutica) {
		this.formaFarmaceutica = formaFarmaceutica;
	}
	
}
