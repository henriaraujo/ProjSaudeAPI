package com.projsaude.api.services;

import java.util.List;

import com.projsaude.api.documents.Estoque;

public interface EstoqueService {

	List<Estoque> listarTodos();
	Estoque listarPorId (String id);
	Estoque cadastrar (Estoque estoque);
	Estoque atualizar (Estoque estoque);
	void remover (String id);
}
