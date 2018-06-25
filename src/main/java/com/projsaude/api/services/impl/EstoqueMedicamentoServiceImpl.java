package com.projsaude.api.services.impl;

import org.springframework.stereotype.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.projsaude.api.documents.EstoqueMedicamento;
import com.projsaude.api.repositories.EstoqueMedicamentoRepository;

import com.projsaude.api.services.EstoqueMedicamentoService;

@Service
public class EstoqueMedicamentoServiceImpl implements EstoqueMedicamentoService {

	@Autowired
	private EstoqueMedicamentoRepository estoqueMedicamentoRepository;
	
	@Override
	public List<EstoqueMedicamento> listarTodos() {
		return this.estoqueMedicamentoRepository.findAll();
	}

	@Override
	public EstoqueMedicamento listarPorId(String id) {
		return this.estoqueMedicamentoRepository.findOne(id);
	}

	@Override
	public EstoqueMedicamento cadastrar(EstoqueMedicamento estoqueMedicamento) {
		return this.estoqueMedicamentoRepository.save(estoqueMedicamento);
	}

	@Override
	public EstoqueMedicamento atualizar(EstoqueMedicamento estoqueMedicamento) {
		return this.estoqueMedicamentoRepository.save(estoqueMedicamento);
	}

	@Override
	public void remover(String id) {
		this.estoqueMedicamentoRepository.delete(id);
	}

}
