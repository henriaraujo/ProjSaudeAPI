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

import com.projsaude.api.documents.MovimentacaoMedicamento;
import com.projsaude.api.responses.Response;
import com.projsaude.api.services.MovimentacaoMedicamentoService;


@RestController
@RequestMapping(path = "/api/movimentacaoMedicamentos")
public class MovimentacaoMedicamentoController {

	@Autowired
	private MovimentacaoMedicamentoService movimentacaoMedicamentoService;
	
	@GetMapping
	public ResponseEntity<Response<List<MovimentacaoMedicamento>>> listarTodos()
	{
		return ResponseEntity.ok(new Response<List<MovimentacaoMedicamento>>(this.movimentacaoMedicamentoService.listarTodos()));
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<Response<MovimentacaoMedicamento>> listarPorId(@PathVariable(name = "id") String id)
	{
		return ResponseEntity.ok(new Response<MovimentacaoMedicamento>(this.movimentacaoMedicamentoService.listarPorId(id)));
	}
	
	@PostMapping
	public ResponseEntity<Response<MovimentacaoMedicamento>> cadastrar(@Valid @RequestBody MovimentacaoMedicamento movimentacaoMedicamento, BindingResult result)
	{
		if(result.hasErrors()) {
			List<String> erros = new ArrayList<String>();
			result.getAllErrors().forEach(erro -> erros.add(erro.getDefaultMessage()));
			return ResponseEntity.badRequest().body(new Response<MovimentacaoMedicamento>(erros));
		}
		return ResponseEntity.ok(new Response<MovimentacaoMedicamento>(this.movimentacaoMedicamentoService.cadastrar(movimentacaoMedicamento)));
	}
	
	@PutMapping(path = "/{id}")
	public ResponseEntity<Response<MovimentacaoMedicamento>> atualizar(@PathVariable(name = "id") String id,@RequestBody MovimentacaoMedicamento movimentacaoMedicamento, BindingResult result)
	{
		if(result.hasErrors()) {
			List<String> erros = new ArrayList<String>();
			result.getAllErrors().forEach(erro -> erros.add(erro.getDefaultMessage()));
			return ResponseEntity.badRequest().body(new Response<MovimentacaoMedicamento>(erros));
		}
		movimentacaoMedicamento.setId(id);
		return ResponseEntity.ok(new Response<MovimentacaoMedicamento>(this.movimentacaoMedicamentoService.atualizar(movimentacaoMedicamento)));
	}
	
	@DeleteMapping(path = "/{id}")
	public ResponseEntity<Response<Integer>> remover(@PathVariable(name = "id") String id)
	{
		this.movimentacaoMedicamentoService.remover(id);
		return ResponseEntity.ok(new Response<Integer>(1));
	}
}