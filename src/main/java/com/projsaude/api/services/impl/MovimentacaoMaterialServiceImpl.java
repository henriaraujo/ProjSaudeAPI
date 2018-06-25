package com.projsaude.api.services.impl;

import org.springframework.stereotype.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.projsaude.api.documents.MovimentacaoMaterial;
import com.projsaude.api.repositories.MovimentacaoMaterialRepository;

import com.projsaude.api.services.MovimentacaoMaterialService;

@Service
public class MovimentacaoMaterialServiceImpl implements MovimentacaoMaterialService {

	@Autowired
	private MovimentacaoMaterialRepository movimentacaoMaterialRepository;
	
	@Override
	public List<MovimentacaoMaterial> listarTodos() {
		return this.movimentacaoMaterialRepository.findAll();
	}

	@Override
	public MovimentacaoMaterial listarPorId(String id) {
		return this.movimentacaoMaterialRepository.findOne(id);
	}

	@Override
	public MovimentacaoMaterial cadastrar(MovimentacaoMaterial movimentacaoMaterial) {
		return this.movimentacaoMaterialRepository.save(movimentacaoMaterial);
	}

	@Override
	public MovimentacaoMaterial atualizar(MovimentacaoMaterial movimentacaoMaterial) {
		return this.movimentacaoMaterialRepository.save(movimentacaoMaterial);
	}

	@Override
	public void remover(String id) {
		this.movimentacaoMaterialRepository.delete(id);
	}

}
