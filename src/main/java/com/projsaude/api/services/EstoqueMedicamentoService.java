package com.projsaude.api.services;

import java.util.List;

import com.projsaude.api.documents.EstoqueMedicamento;

public interface EstoqueMedicamentoService {

	List<EstoqueMedicamento> listarTodos();
	EstoqueMedicamento listarPorId (String id);
	EstoqueMedicamento cadastrar (EstoqueMedicamento estoqueMedicamento);
	EstoqueMedicamento atualizar (EstoqueMedicamento estoqueMedicamento);
	void remover (String id);
}
