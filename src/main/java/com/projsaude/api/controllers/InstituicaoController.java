package com.projsaude.api.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projsaude.api.documents.Instituicao;
import com.projsaude.api.responses.Response;
import com.projsaude.api.services.InstituicaoService;


@RestController
@RequestMapping(path = "/api/instituicoes")
public class InstituicaoController {

	@Autowired
	private InstituicaoService instituicaoService;
	
	@GetMapping
	public ResponseEntity<Response<List<Instituicao>>> listarTodos()
	{
		return ResponseEntity.ok(new Response<List<Instituicao>>(this.instituicaoService.listarTodos()));
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<Response<Instituicao>> listarPorId(@PathVariable(name = "id") String id)
	{
		return ResponseEntity.ok(new Response<Instituicao>(this.instituicaoService.listarPorId(id)));
	}
	
	@PostMapping
	public ResponseEntity<Response<Instituicao>> cadastrar(@Valid @RequestBody Instituicao instituicao, BindingResult result)
	{
		if(result.hasErrors()) {
			List<String> erros = new ArrayList<String>();
			result.getAllErrors().forEach(erro -> erros.add(erro.getDefaultMessage()));
			return ResponseEntity.badRequest().body(new Response<Instituicao>(erros));
		}
		return ResponseEntity.ok(new Response<Instituicao>(this.instituicaoService.cadastrar(instituicao)));
	}
	
	@PutMapping(path = "/{id}")
	public ResponseEntity<Response<Instituicao>> atualizar(@PathVariable(name = "id") String id,@RequestBody Instituicao instituicao, BindingResult result)
	{
		if(result.hasErrors()) {
			List<String> erros = new ArrayList<String>();
			result.getAllErrors().forEach(erro -> erros.add(erro.getDefaultMessage()));
			return ResponseEntity.badRequest().body(new Response<Instituicao>(erros));
		}
		instituicao.setId(id);
		return ResponseEntity.ok(new Response<Instituicao>(this.instituicaoService.atualizar(instituicao)));
	}
	
	@DeleteMapping(path = "/{id}")
	public ResponseEntity<Response<Integer>> remover(@PathVariable(name = "id") String id)
	{
		this.instituicaoService.remover(id);
		return ResponseEntity.ok(new Response<Integer>(1));
	}
}