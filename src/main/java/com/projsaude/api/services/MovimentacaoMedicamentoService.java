package com.projsaude.api.services;

import java.util.List;

import com.projsaude.api.documents.MovimentacaoMedicamento;

public interface MovimentacaoMedicamentoService {

	List<MovimentacaoMedicamento> listarTodos();
	MovimentacaoMedicamento listarPorId (String id);
	MovimentacaoMedicamento cadastrar (MovimentacaoMedicamento movimentacaoMedicamento);
	MovimentacaoMedicamento atualizar (MovimentacaoMedicamento movimentacaoMedicamento);
	void remover (String id);
}
