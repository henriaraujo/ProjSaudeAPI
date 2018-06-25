package com.projsaude.api.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class EstoqueMedicamento {

	@Id
	private String id;
	private String idMedicamento;
	private String idAlmoxarifado;
	private String quantidade;
	
	public EstoqueMedicamento () {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIdMedicamento() {
		return idMedicamento;
	}

	public void setIdMedicamento(String idMedicamento) {
		this.idMedicamento = idMedicamento;
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
