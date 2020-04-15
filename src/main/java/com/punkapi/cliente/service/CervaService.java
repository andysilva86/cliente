package com.punkapi.cliente.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.punkapi.cliente.model.PunkBeer;
import com.punkapi.cliente.repository.ApiMemoria;

@Service
public class CervaService {
	
	@Autowired
	public ApiMemoria apiMemoria;
	
	public PunkBeer[] buscarGeral() {
		
		PunkBeer[] retornoDetalhe = ApiMemoria.getApiDadosMemoria();
		
		return retornoDetalhe;
	}
	
	public PunkBeer buscarDetalhe(int id) {
		
		PunkBeer[] retornoDetalhe = ApiMemoria.getApiDadosMemoria();
		
		return retornoDetalhe[id];
	}
	
	public PunkBeer alterarDescricao(int id, String descricao, String ipCliente) {
		
		PunkBeer retornoDetalhe = buscarDetalhe(id);
		
		retornoDetalhe.setDescription(descricao);
		retornoDetalhe.setVersao(retornoDetalhe.getVersao()+1);
		retornoDetalhe.setIpVersao(ipCliente);
		
		return retornoDetalhe;
	}

}