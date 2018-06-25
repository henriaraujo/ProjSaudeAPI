package com.projsaude.api.services;

import java.util.List;

import com.projsaude.api.documents.MovimentacaoMaterial;

public interface MovimentacaoMaterialService {

	List<MovimentacaoMaterial> listarTodos();
	MovimentacaoMaterial listarPorId (String id);
	MovimentacaoMaterial cadastrar (MovimentacaoMaterial movimentacaoMaterial);
	MovimentacaoMaterial atualizar (MovimentacaoMaterial movimentacaoMaterial);
	void remover (String id);
}
