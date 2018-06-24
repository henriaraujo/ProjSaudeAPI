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

import com.projsaude.api.documents.Estoque;
import com.projsaude.api.responses.Response;
import com.projsaude.api.services.EstoqueService;


@RestController
@RequestMapping(path = "/api/estoque")
public class EstoqueController {

	@Autowired
	private EstoqueService estoqueService;
	
	@GetMapping
	public ResponseEntity<Response<List<Estoque>>> listarTodos()
	{
		return ResponseEntity.ok(new Response<List<Estoque>>(this.estoqueService.listarTodos()));
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<Response<Estoque>> listarPorId(@PathVariable(name = "id") String id)
	{
		return ResponseEntity.ok(new Response<Estoque>(this.estoqueService.listarPorId(id)));
	}
	
	@PostMapping
	public ResponseEntity<Response<Estoque>> cadastrar(@Valid @RequestBody Estoque estoque, BindingResult result)
	{
		if(result.hasErrors()) {
			List<String> erros = new ArrayList<String>();
			result.getAllErrors().forEach(erro -> erros.add(erro.getDefaultMessage()));
			return ResponseEntity.badRequest().body(new Response<Estoque>(erros));
		}
		return ResponseEntity.ok(new Response<Estoque>(this.estoqueService.cadastrar(estoque)));
	}
	
	@PutMapping(path = "/{id}")
	public ResponseEntity<Response<Estoque>> atualizar(@PathVariable(name = "id") String id,@RequestBody Estoque estoque, BindingResult result)
	{
		if(result.hasErrors()) {
			List<String> erros = new ArrayList<String>();
			result.getAllErrors().forEach(erro -> erros.add(erro.getDefaultMessage()));
			return ResponseEntity.badRequest().body(new Response<Estoque>(erros));
		}
		estoque.setIdMaterialOuMedicamento(id);
		return ResponseEntity.ok(new Response<Estoque>(this.estoqueService.atualizar(estoque)));
	}
	
	@DeleteMapping(path = "/{id}")
	public ResponseEntity<Response<Integer>> remover(@PathVariable(name = "id") String id)
	{
		this.estoqueService.remover(id);
		return ResponseEntity.ok(new Response<Integer>(1));
	}
}