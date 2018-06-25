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

import com.projsaude.api.documents.EstoqueMaterial;
import com.projsaude.api.responses.Response;
import com.projsaude.api.services.EstoqueMaterialService;


@RestController
@RequestMapping(path = "/api/estoqueMaterial")
public class EstoqueMaterialController {

	@Autowired
	private EstoqueMaterialService estoqueMaterialService;
	
	@GetMapping
	public ResponseEntity<Response<List<EstoqueMaterial>>> listarTodos()
	{
		return ResponseEntity.ok(new Response<List<EstoqueMaterial>>(this.estoqueMaterialService.listarTodos()));
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<Response<EstoqueMaterial>> listarPorId(@PathVariable(name = "id") String id)
	{
		return ResponseEntity.ok(new Response<EstoqueMaterial>(this.estoqueMaterialService.listarPorId(id)));
	}
	
	@PostMapping
	public ResponseEntity<Response<EstoqueMaterial>> cadastrar(@Valid @RequestBody EstoqueMaterial estoqueMaterialMaterial, BindingResult result)
	{
		if(result.hasErrors()) {
			List<String> erros = new ArrayList<String>();
			result.getAllErrors().forEach(erro -> erros.add(erro.getDefaultMessage()));
			return ResponseEntity.badRequest().body(new Response<EstoqueMaterial>(erros));
		}
		return ResponseEntity.ok(new Response<EstoqueMaterial>(this.estoqueMaterialService.cadastrar(estoqueMaterialMaterial)));
	}
	
	@PutMapping(path = "/{id}")
	public ResponseEntity<Response<EstoqueMaterial>> atualizar(@PathVariable(name = "id") String id,@RequestBody EstoqueMaterial estoqueMaterial, BindingResult result)
	{
		if(result.hasErrors()) {
			List<String> erros = new ArrayList<String>();
			result.getAllErrors().forEach(erro -> erros.add(erro.getDefaultMessage()));
			return ResponseEntity.badRequest().body(new Response<EstoqueMaterial>(erros));
		}
		estoqueMaterial.setId(id);
		return ResponseEntity.ok(new Response<EstoqueMaterial>(this.estoqueMaterialService.atualizar(estoqueMaterial)));
	}
	
	@DeleteMapping(path = "/{id}")
	public ResponseEntity<Response<Integer>> remover(@PathVariable(name = "id") String id)
	{
		this.estoqueMaterialService.remover(id);
		return ResponseEntity.ok(new Response<Integer>(1));
	}
}