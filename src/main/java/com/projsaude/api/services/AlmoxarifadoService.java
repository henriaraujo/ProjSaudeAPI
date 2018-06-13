package com.projsaude.api.services;

import java.util.List;

import com.projsaude.api.documents.Almoxarifado;

public interface AlmoxarifadoService {

	List<Almoxarifado> listarTodos();
	Almoxarifado listarPorId (String id);
	Almoxarifado cadastrar (Almoxarifado almoxarifado);
	Almoxarifado atualizar (Almoxarifado almoxarifado);
	void remover (String id);
}
