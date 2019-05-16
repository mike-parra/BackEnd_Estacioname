package com.estacioname.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estacioname.modelos.Cajon;
import com.estacioname.servicios.CajonServicio;

@RestController
@RequestMapping("/cajon")
public class CajonWS {
	
	@Autowired
	CajonServicio s;

	@GetMapping("/bienvenida")
	public String Mensaje() {
		return "Portal estacioname";
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Cajon> buscar(@PathVariable int id) {
		Cajon resultado = s.buscar(id);
		if (resultado == null) {
			return new ResponseEntity<Cajon>(HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<Cajon>(resultado, HttpStatus.OK);
		}

	}
	
	@GetMapping("/listar")//el get es para consultar
	public ResponseEntity<List<Cajon>> consultar() {
		List<Cajon> resultado = s.consultar();
		if (resultado.isEmpty()) 
			return  new ResponseEntity<>(HttpStatus.NO_CONTENT);
		else
			return new ResponseEntity<List<Cajon>>(resultado,HttpStatus.OK);
	}
	

}
