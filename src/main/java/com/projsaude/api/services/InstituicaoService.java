package com.projsaude.api.services;

import java.util.List;

import com.projsaude.api.documents.Instituicao;

public interface InstituicaoService {

	List<Instituicao> listarTodos();
	Instituicao listarPorId (String id);
	Instituicao cadastrar (Instituicao instituicao);
	Instituicao atualizar (Instituicao instituicao);
	void remover (String id);
}
