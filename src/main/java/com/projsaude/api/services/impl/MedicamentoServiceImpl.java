package com.projsaude.api.services.impl;

import org.springframework.stereotype.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.projsaude.api.documents.Medicamento;
import com.projsaude.api.repositories.MedicamentoRepository;

import com.projsaude.api.services.MedicamentoService;

@Service
public class MedicamentoServiceImpl implements MedicamentoService {

	@Autowired
	private MedicamentoRepository medicamentoRepository;
	
	@Override
	public List<Medicamento> listarTodos() {
		return this.medicamentoRepository.findAll();
	}

	@Override
	public Medicamento listarPorId(String id) {
		return this.medicamentoRepository.findOne(id);
	}

	@Override
	public Medicamento cadastrar(Medicamento medicamento) {
		return this.medicamentoRepository.save(medicamento);
	}

	@Override
	public Medicamento atualizar(Medicamento medicamento) {
		return this.medicamentoRepository.save(medicamento);
	}

	@Override
	public void remover(String id) {
		this.medicamentoRepository.delete(id);
	}

}
