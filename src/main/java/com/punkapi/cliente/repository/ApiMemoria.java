package com.punkapi.cliente.repository;

import java.io.IOException;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.punkapi.cliente.model.PunkBeer;

@Repository
public class ApiMemoria {
	
	final static String uri = "https://api.punkapi.com/v2/beers";
	public static PunkBeer punkBeers;
	public static PunkBeer[] apiDadosMemoria;

	public static void CargaMemoria() throws JsonParseException, JsonMappingException, IOException {
		
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> retorno = restTemplate.getForEntity(uri, String.class);

		ObjectMapper apiMapper = new ObjectMapper();
		apiDadosMemoria = apiMapper.readValue(retorno.getBody(), PunkBeer[].class);
	}

	public static PunkBeer[] getApiDadosMemoria() {
		return apiDadosMemoria;
	}

	public static void setApiDadosMemoria(PunkBeer[] apiDadosMemoria) {
		ApiMemoria.apiDadosMemoria = apiDadosMemoria;
	}
	
	
}