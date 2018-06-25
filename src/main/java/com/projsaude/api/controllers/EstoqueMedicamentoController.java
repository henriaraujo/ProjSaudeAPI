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

import com.projsaude.api.documents.EstoqueMedicamento;
import com.projsaude.api.responses.Response;
import com.projsaude.api.services.EstoqueMedicamentoService;


@RestController
@RequestMapping(path = "/api/estoqueMedicamentos")
public class EstoqueMedicamentoController {

	@Autowired
	private EstoqueMedicamentoService estoqueMedicamentoService;
	
	@GetMapping
	public ResponseEntity<Response<List<EstoqueMedicamento>>> listarTodos()
	{
		return ResponseEntity.ok(new Response<List<EstoqueMedicamento>>(this.estoqueMedicamentoService.listarTodos()));
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<Response<EstoqueMedicamento>> listarPorId(@PathVariable(name = "id") String id)
	{
		return ResponseEntity.ok(new Response<EstoqueMedicamento>(this.estoqueMedicamentoService.listarPorId(id)));
	}
	
	@PostMapping
	public ResponseEntity<Response<EstoqueMedicamento>> cadastrar(@Valid @RequestBody EstoqueMedicamento estoqueMedicamento, BindingResult result)
	{
		if(result.hasErrors()) {
			List<String> erros = new ArrayList<String>();
			result.getAllErrors().forEach(erro -> erros.add(erro.getDefaultMessage()));
			return ResponseEntity.badRequest().body(new Response<EstoqueMedicamento>(erros));
		}
		return ResponseEntity.ok(new Response<EstoqueMedicamento>(this.estoqueMedicamentoService.cadastrar(estoqueMedicamento)));
	}
	
	@PutMapping(path = "/{id}")
	public ResponseEntity<Response<EstoqueMedicamento>> atualizar(@PathVariable(name = "id") String id,@RequestBody EstoqueMedicamento estoqueMedicamento, BindingResult result)
	{
		if(result.hasErrors()) {
			List<String> erros = new ArrayList<String>();
			result.getAllErrors().forEach(erro -> erros.add(erro.getDefaultMessage()));
			return ResponseEntity.badRequest().body(new Response<EstoqueMedicamento>(erros));
		}
		estoqueMedicamento.setId(id);
		return ResponseEntity.ok(new Response<EstoqueMedicamento>(this.estoqueMedicamentoService.atualizar(estoqueMedicamento)));
	}
	
	@DeleteMapping(path = "/{id}")
	public ResponseEntity<Response<Integer>> remover(@PathVariable(name = "id") String id)
	{
		this.estoqueMedicamentoService.remover(id);
		return ResponseEntity.ok(new Response<Integer>(1));
	}
}