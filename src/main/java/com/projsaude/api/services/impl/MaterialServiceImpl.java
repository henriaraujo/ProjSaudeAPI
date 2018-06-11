package com.projsaude.api.services.impl;

import org.springframework.stereotype.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.projsaude.api.documents.Material;
import com.projsaude.api.repositories.MaterialRepository;

import com.projsaude.api.services.MaterialService;

@Service
public class MaterialServiceImpl implements MaterialService {

	@Autowired
	private MaterialRepository materialRepository;
	
	@Override
	public List<Material> listarTodos() {
		return this.materialRepository.findAll();
	}

	@Override
	public Material listarPorId(String id) {
		return this.materialRepository.findOne(id);
	}

	@Override
	public Material cadastrar(Material material) {
		return this.materialRepository.save(material);
	}

	@Override
	public Material atualizar(Material material) {
		return this.materialRepository.save(material);
	}

	@Override
	public void remover(String id) {
		this.materialRepository.delete(id);
	}

}
