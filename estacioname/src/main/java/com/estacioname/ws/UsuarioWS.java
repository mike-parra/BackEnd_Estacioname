package com.estacioname.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estacioname.modelos.Usuario;
import com.estacioname.servicios.UsuarioServicio;

@RestController
@RequestMapping("/usr")
public class UsuarioWS {

	@Autowired
	UsuarioServicio us;

	@GetMapping("/bienvenida")
	public String Mensaje() {
		return "Portal estacioname";
	}

	@PostMapping("/usuario") // el post es para insertar
	public ResponseEntity<Usuario> insertar( Usuario usr) {
		Usuario resultado = us.crear(usr);
		return new ResponseEntity<Usuario>(resultado, HttpStatus.OK);
	}

}
