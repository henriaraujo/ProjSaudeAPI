package com.projsaude.api.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class EstoqueMaterial {

	@Id
	private String id;
	private String idMaterial;
	private String idAlmoxarifado;
	private String quantidade;
	
	public EstoqueMaterial () {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIdMaterial() {
		return idMaterial;
	}

	public void setIdMaterial(String idMaterial) {
		this.idMaterial = idMaterial;
	}

	public String getIdAlmoxarifado() {
		return idAlmoxarifado;
	}

	public void setIdAlmoxarifado(String idAlmoxarifado) {
		this.idAlmoxarifado = idAlmoxarifado;
	}

	public String getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}


	
}
