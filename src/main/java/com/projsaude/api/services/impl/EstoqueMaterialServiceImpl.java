package com.projsaude.api.services.impl;

import org.springframework.stereotype.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.projsaude.api.documents.EstoqueMaterial;
import com.projsaude.api.repositories.EstoqueMaterialRepository;

import com.projsaude.api.services.EstoqueMaterialService;

@Service
public class EstoqueMaterialServiceImpl implements EstoqueMaterialService {

	@Autowired
	private EstoqueMaterialRepository estoqueMaterialRepository;
	
	@Override
	public List<EstoqueMaterial> listarTodos() {
		return this.estoqueMaterialRepository.findAll();
	}

	@Override
	public EstoqueMaterial listarPorId(String id) {
		return this.estoqueMaterialRepository.findOne(id);
	}

	@Override
	public EstoqueMaterial cadastrar(EstoqueMaterial estoqueMaterial) {
		return this.estoqueMaterialRepository.save(estoqueMaterial);
	}

	@Override
	public EstoqueMaterial atualizar(EstoqueMaterial estoqueMaterial) {
		return this.estoqueMaterialRepository.save(estoqueMaterial);
	}

	@Override
	public void remover(String id) {
		this.estoqueMaterialRepository.delete(id);
	}

}
