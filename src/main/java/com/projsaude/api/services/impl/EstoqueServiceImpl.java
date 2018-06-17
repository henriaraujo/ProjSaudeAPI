package com.projsaude.api.services.impl;

import org.springframework.stereotype.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.projsaude.api.documents.Estoque;
import com.projsaude.api.repositories.EstoqueRepository;

import com.projsaude.api.services.EstoqueService;

@Service
public class EstoqueServiceImpl implements EstoqueService {

	@Autowired
	private EstoqueRepository estoqueRepository;
	
	@Override
	public List<Estoque> listarTodos() {
		return this.estoqueRepository.findAll();
	}

	@Override
	public Estoque listarPorId(String id) {
		return this.estoqueRepository.findOne(id);
	}

	@Override
	public Estoque cadastrar(Estoque estoque) {
		return this.estoqueRepository.save(estoque);
	}

	@Override
	public Estoque atualizar(Estoque estoque) {
		return this.estoqueRepository.save(estoque);
	}

	@Override
	public void remover(String id) {
		this.estoqueRepository.delete(id);
	}

}
