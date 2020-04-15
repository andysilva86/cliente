package com.punkapi.cliente.controller;

import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.punkapi.cliente.model.PunkBeer;
import com.punkapi.cliente.service.CervaService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*", 
			allowCredentials = "false")
public class ControllerApiClient {
	
	@Resource
	private CervaService cervaService;
	
	// ENDPOINT PARA TRAZER INFORMACOES DE TODAS AS CERVEJAS
	@GetMapping(value = "/cerva", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getControllerCervejas() {
		PunkBeer[] cerva = null;
		
		try {
			cerva = cervaService.buscarGeral();
		}catch (Exception c) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.status(HttpStatus.OK).body(cerva);
	}
	
	// ENDPOINT PARA TRAZER INFORMACOES DE UMA UNICA CERVEJA
	@GetMapping(value = "/cerva/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getControllerCervejaDetalhe(@PathVariable("id") int cervaId) {
		PunkBeer cerva = null;
		// posiciona sempre 1 indice anterior para manter o Id igual ao guardado em memoria
		cervaId = cervaId - 1;
		try {
			cerva = cervaService.buscarDetalhe(cervaId);
		}catch (Exception c) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.status(HttpStatus.OK).body(cerva);
	}
	
	// ENDPOINT PARA ALTERAR A DESCRICAO DA CERVEJA
	@PatchMapping(value = "/cerva/descricao/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getControllerCervejaAlterarDetalhe(@PathVariable("id") int cervaId, @RequestBody String descricao, HttpServletRequest request) {
		
	    Map<String, String> map = new Gson().fromJson(descricao, new TypeToken<Map<String, String>>() {}.getType());
	    String description = map.get("descricao");
	    String ipCliente = null;
	    
        if (request != null) {
            ipCliente = request.getHeader("X-FORWARDED-FOR");
            if (ipCliente == null || "".equals(ipCliente)) {
            	ipCliente = request.getRemoteAddr();
            }
        }
	    
		PunkBeer cerva = null;
		
		// posiciona sempre 1 indice anterior para manter o Id igual ao do PATH do endpoint
		cervaId = cervaId - 1;
		try {
			cerva = cervaService.alterarDescricao(cervaId, description.toString(),ipCliente);
		}catch (Exception c) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.status(HttpStatus.OK).body(cerva);
	}
}