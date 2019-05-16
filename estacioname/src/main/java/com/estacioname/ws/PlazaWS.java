package com.estacioname.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estacioname.modelos.Plaza;
import com.estacioname.servicios.PlazaServicio;

@RestController
@RequestMapping("/plaza")
public class PlazaWS {

	@Autowired
	PlazaServicio s;

	@GetMapping("/bienvenida")
	public String Mensaje() {
		return "Portal estacioname";
	}

	@GetMapping("/{id}")
	public ResponseEntity<Plaza> buscar(@PathVariable int id) {
		Plaza resultado = s.buscar(id);
		if (resultado == null) {
			return new ResponseEntity<Plaza>(HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<Plaza>(resultado, HttpStatus.OK);
		}

	}

	@PostMapping("/insertar") // el post es para insertar
	public ResponseEntity<Plaza> insertar( Plaza plz) {
		Plaza resultado = s.crear(plz);
		return new ResponseEntity<Plaza>(resultado, HttpStatus.OK);
	}

}
