package com.punkapi.cliente;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.punkapi.cliente.repository.ApiMemoria;

@SpringBootApplication
public class ClienteApplication {
	
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		SpringApplication.run(ClienteApplication.class, args);
		//carrega os dados da API servidor na memoria
		ApiMemoria.CargaMemoria();
	}

}
