package com.projsaude.api.documents;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Estoque {

	@Id
	private String idMaterialOuMedicamento;
	private String idAlmoxarifado;
	private String quantidade;
	
	public Estoque () {
		
	}

	public String getIdMaterialOuMedicamento() {
		return idMaterialOuMedicamento;
	}

	public void setIdMaterialOuMedicamento(String idMaterialOuMedicamento) {
		this.idMaterialOuMedicamento = idMaterialOuMedicamento;
	}

	@NotEmpty
	public String getIdAlmoxarifado() {
		return idAlmoxarifado;
	}

	public void setIdAlmoxarifado(String idAlmoxarifado) {
		this.idAlmoxarifado = idAlmoxarifado;
	}

	@NotEmpty
	public String getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}
	
}
