package com.projsaude.api.services.impl;

import org.springframework.stereotype.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.projsaude.api.documents.Almoxarifado;
import com.projsaude.api.repositories.AlmoxarifadoRepository;

import com.projsaude.api.services.AlmoxarifadoService;

@Service
public class AlmoxarifadoServiceImpl implements AlmoxarifadoService {

	@Autowired
	private AlmoxarifadoRepository almoxarifadoRepository;
	
	@Override
	public List<Almoxarifado> listarTodos() {
		return this.almoxarifadoRepository.findAll();
	}

	@Override
	public Almoxarifado listarPorId(String id) {
		return this.almoxarifadoRepository.findOne(id);
	}

	@Override
	public Almoxarifado cadastrar(Almoxarifado almoxarifado) {
		return this.almoxarifadoRepository.save(almoxarifado);
	}

	@Override
	public Almoxarifado atualizar(Almoxarifado almoxarifado) {
		return this.almoxarifadoRepository.save(almoxarifado);
	}

	@Override
	public void remover(String id) {
		this.almoxarifadoRepository.delete(id);
	}

}
