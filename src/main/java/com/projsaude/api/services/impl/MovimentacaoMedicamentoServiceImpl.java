package com.projsaude.api.services.impl;

import org.springframework.stereotype.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.projsaude.api.documents.MovimentacaoMedicamento;
import com.projsaude.api.repositories.MovimentacaoMedicamentoRepository;

import com.projsaude.api.services.MovimentacaoMedicamentoService;

@Service
public class MovimentacaoMedicamentoServiceImpl implements MovimentacaoMedicamentoService {

	@Autowired
	private MovimentacaoMedicamentoRepository movimentacaoMedicamentoRepository;
	
	@Override
	public List<MovimentacaoMedicamento> listarTodos() {
		return this.movimentacaoMedicamentoRepository.findAll();
	}

	@Override
	public MovimentacaoMedicamento listarPorId(String id) {
		return this.movimentacaoMedicamentoRepository.findOne(id);
	}

	@Override
	public MovimentacaoMedicamento cadastrar(MovimentacaoMedicamento movimentacaoMedicamento) {
		return this.movimentacaoMedicamentoRepository.save(movimentacaoMedicamento);
	}

	@Override
	public MovimentacaoMedicamento atualizar(MovimentacaoMedicamento movimentacaoMedicamento) {
		return this.movimentacaoMedicamentoRepository.save(movimentacaoMedicamento);
	}

	@Override
	public void remover(String id) {
		this.movimentacaoMedicamentoRepository.delete(id);
	}

}
