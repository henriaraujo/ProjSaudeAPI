package com.projsaude.api.services;

import java.util.List;

import com.projsaude.api.documents.EstoqueMaterial;

public interface EstoqueMaterialService {

	List<EstoqueMaterial> listarTodos();
	EstoqueMaterial listarPorId (String id);
	EstoqueMaterial cadastrar (EstoqueMaterial estoqueMaterial);
	EstoqueMaterial atualizar (EstoqueMaterial estoqueMaterial);
	void remover (String id);
}
