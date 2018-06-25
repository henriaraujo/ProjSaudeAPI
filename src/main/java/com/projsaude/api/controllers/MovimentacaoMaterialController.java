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

import com.projsaude.api.documents.MovimentacaoMaterial;
import com.projsaude.api.responses.Response;
import com.projsaude.api.services.MovimentacaoMaterialService;


@RestController
@RequestMapping(path = "/api/movimentacaoMateriais")
public class MovimentacaoMaterialController {

	@Autowired
	private MovimentacaoMaterialService movimentacaoMaterialService;
	
	@GetMapping
	public ResponseEntity<Response<List<MovimentacaoMaterial>>> listarTodos()
	{
		return ResponseEntity.ok(new Response<List<MovimentacaoMaterial>>(this.movimentacaoMaterialService.listarTodos()));
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<Response<MovimentacaoMaterial>> listarPorId(@PathVariable(name = "id") String id)
	{
		return ResponseEntity.ok(new Response<MovimentacaoMaterial>(this.movimentacaoMaterialService.listarPorId(id)));
	}
	
	@PostMapping
	public ResponseEntity<Response<MovimentacaoMaterial>> cadastrar(@Valid @RequestBody MovimentacaoMaterial movimentacaoMaterial, BindingResult result)
	{
		if(result.hasErrors()) {
			List<String> erros = new ArrayList<String>();
			result.getAllErrors().forEach(erro -> erros.add(erro.getDefaultMessage()));
			return ResponseEntity.badRequest().body(new Response<MovimentacaoMaterial>(erros));
		}
		return ResponseEntity.ok(new Response<MovimentacaoMaterial>(this.movimentacaoMaterialService.cadastrar(movimentacaoMaterial)));
	}
	
	@PutMapping(path = "/{id}")
	public ResponseEntity<Response<MovimentacaoMaterial>> atualizar(@PathVariable(name = "id") String id,@RequestBody MovimentacaoMaterial movimentacaoMaterial, BindingResult result)
	{
		if(result.hasErrors()) {
			List<String> erros = new ArrayList<String>();
			result.getAllErrors().forEach(erro -> erros.add(erro.getDefaultMessage()));
			return ResponseEntity.badRequest().body(new Response<MovimentacaoMaterial>(erros));
		}
		movimentacaoMaterial.setId(id);
		return ResponseEntity.ok(new Response<MovimentacaoMaterial>(this.movimentacaoMaterialService.atualizar(movimentacaoMaterial)));
	}
	
	@DeleteMapping(path = "/{id}")
	public ResponseEntity<Response<Integer>> remover(@PathVariable(name = "id") String id)
	{
		this.movimentacaoMaterialService.remover(id);
		return ResponseEntity.ok(new Response<Integer>(1));
	}
}