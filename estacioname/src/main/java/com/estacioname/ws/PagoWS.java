package com.estacioname.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estacioname.modelos.Pago;
import com.estacioname.servicios.PagoServicio;


@RestController
@RequestMapping("/pago")
public class PagoWS {
	
	@Autowired
	PagoServicio s;

	@GetMapping("/listar")
	public ResponseEntity<List<Pago>> consultar() {
		List<Pago> resultado = s.consultar();
		if (resultado.isEmpty()) 
			return  new ResponseEntity<>(HttpStatus.NO_CONTENT);
		else
			return new ResponseEntity<List<Pago>>(resultado,HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Pago> buscar(@PathVariable int id){
		Pago resultado = s.buscar(id);
		if (resultado ==null) {
			return new ResponseEntity<Pago>(HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<Pago>(resultado,HttpStatus.OK);
		}
		
	}
	
	@PostMapping("/registrar")// el post es para insertar
	public ResponseEntity<Pago> insertar( Pago p){
		Pago resultado = s.crear(p);
		return new ResponseEntity<Pago>(resultado,HttpStatus.OK);
	}
	

}
