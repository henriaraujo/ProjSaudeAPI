package com.projsaude.api.services;

import java.util.List;

import com.projsaude.api.documents.Material;

public interface MaterialService {

	List<Material> listarTodos();
	Material listarPoId (String id);
	Material cadastrar (Material material);
	Material atualizar (Material material);
	void remover (String id);
}
