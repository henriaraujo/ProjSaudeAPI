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

import com.projsaude.api.documents.Medicamento;
import com.projsaude.api.responses.Response;
import com.projsaude.api.services.MedicamentoService;


@RestController
@RequestMapping(path = "/api/medicamentos")
public class MedicamentoController {

	@Autowired
	private MedicamentoService medicamentoService;
	
	@GetMapping
	public ResponseEntity<Response<List<Medicamento>>> listarTodos()
	{
		return ResponseEntity.ok(new Response<List<Medicamento>>(this.medicamentoService.listarTodos()));
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<Response<Medicamento>> listarPorId(@PathVariable(name = "id") String id)
	{
		return ResponseEntity.ok(new Response<Medicamento>(this.medicamentoService.listarPorId(id)));
	}
	
	@PostMapping
	public ResponseEntity<Response<Medicamento>> cadastrar(@Valid @RequestBody Medicamento medicamento, BindingResult result)
	{
		if(result.hasErrors()) {
			List<String> erros = new ArrayList<String>();
			result.getAllErrors().forEach(erro -> erros.add(erro.getDefaultMessage()));
			return ResponseEntity.badRequest().body(new Response<Medicamento>(erros));
		}
		return ResponseEntity.ok(new Response<Medicamento>(this.medicamentoService.cadastrar(medicamento)));
	}
	
	@PutMapping(path = "/{id}")
	public ResponseEntity<Response<Medicamento>> atualizar(@PathVariable(name = "id") String id,@RequestBody Medicamento medicamento, BindingResult result)
	{
		if(result.hasErrors()) {
			List<String> erros = new ArrayList<String>();
			result.getAllErrors().forEach(erro -> erros.add(erro.getDefaultMessage()));
			return ResponseEntity.badRequest().body(new Response<Medicamento>(erros));
		}
		medicamento.setId(id);
		return ResponseEntity.ok(new Response<Medicamento>(this.medicamentoService.atualizar(medicamento)));
	}
	
	@DeleteMapping(path = "/{id}")
	public ResponseEntity<Response<Integer>> remover(@PathVariable(name = "id") String id)
	{
		this.medicamentoService.remover(id);
		return ResponseEntity.ok(new Response<Integer>(1));
	}
}