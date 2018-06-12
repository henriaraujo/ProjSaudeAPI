package com.projsaude.api.services.impl;

import org.springframework.stereotype.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.projsaude.api.documents.Instituicao;
import com.projsaude.api.repositories.InstituicaoRepository;

import com.projsaude.api.services.InstituicaoService;

@Service
public class InstituicaoServiceImpl implements InstituicaoService {

	@Autowired
	private InstituicaoRepository instituicaoRepository;
	
	@Override
	public List<Instituicao> listarTodos() {
		return this.instituicaoRepository.findAll();
	}

	@Override
	public Instituicao listarPorId(String id) {
		return this.instituicaoRepository.findOne(id);
	}

	@Override
	public Instituicao cadastrar(Instituicao instituicao) {
		return this.instituicaoRepository.save(instituicao);
	}

	@Override
	public Instituicao atualizar(Instituicao instituicao) {
		return this.instituicaoRepository.save(instituicao);
	}

	@Override
	public void remover(String id) {
		this.instituicaoRepository.delete(id);
	}

}
