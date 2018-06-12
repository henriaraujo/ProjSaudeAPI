package com.projsaude.api.services;

import java.util.List;

import com.projsaude.api.documents.Medicamento;

public interface MedicamentoService {

	List<Medicamento> listarTodos();
	Medicamento listarPorId (String id);
	Medicamento cadastrar (Medicamento medicamento);
	Medicamento atualizar (Medicamento medicamento);
	void remover (String id);
}
