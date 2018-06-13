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

import com.projsaude.api.documents.Almoxarifado;
import com.projsaude.api.responses.Response;
import com.projsaude.api.services.AlmoxarifadoService;


@RestController
@RequestMapping(path = "/api/almoxarifados")
public class AlmoxarifadoController {

	@Autowired
	private AlmoxarifadoService almoxarifadoService;
	
	@GetMapping
	public ResponseEntity<Response<List<Almoxarifado>>> listarTodos()
	{
		return ResponseEntity.ok(new Response<List<Almoxarifado>>(this.almoxarifadoService.listarTodos()));
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<Response<Almoxarifado>> listarPorId(@PathVariable(name = "id") String id)
	{
		return ResponseEntity.ok(new Response<Almoxarifado>(this.almoxarifadoService.listarPorId(id)));
	}
	
	@PostMapping
	public ResponseEntity<Response<Almoxarifado>> cadastrar(@Valid @RequestBody Almoxarifado almoxarifado, BindingResult result)
	{
		if(result.hasErrors()) {
			List<String> erros = new ArrayList<String>();
			result.getAllErrors().forEach(erro -> erros.add(erro.getDefaultMessage()));
			return ResponseEntity.badRequest().body(new Response<Almoxarifado>(erros));
		}
		return ResponseEntity.ok(new Response<Almoxarifado>(this.almoxarifadoService.cadastrar(almoxarifado)));
	}
	
	@PutMapping(path = "/{id}")
	public ResponseEntity<Response<Almoxarifado>> atualizar(@PathVariable(name = "id") String id,@RequestBody Almoxarifado almoxarifado, BindingResult result)
	{
		if(result.hasErrors()) {
			List<String> erros = new ArrayList<String>();
			result.getAllErrors().forEach(erro -> erros.add(erro.getDefaultMessage()));
			return ResponseEntity.badRequest().body(new Response<Almoxarifado>(erros));
		}
		almoxarifado.setId(id);
		return ResponseEntity.ok(new Response<Almoxarifado>(this.almoxarifadoService.atualizar(almoxarifado)));
	}
	
	@DeleteMapping(path = "/{id}")
	public ResponseEntity<Response<Integer>> remover(@PathVariable(name = "id") String id)
	{
		this.almoxarifadoService.remover(id);
		return ResponseEntity.ok(new Response<Integer>(1));
	}
}