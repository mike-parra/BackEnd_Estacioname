package com.estacioname.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estacioname.dao.UsuarioDAO;
import com.estacioname.modelos.Usuario;

@Service
public class LogicaUsuario implements UsuarioServicio {
	
	@Autowired
	UsuarioDAO repositorio;

	@Override
	public Usuario crear(Usuario usr) {
		// TODO Auto-generated method stub
		int id = repositorio.insertar(usr);
		usr.setId(id);
		return usr;
	}

	@Override
	public void modificar(Usuario usr) {
		// TODO Auto-generated method stub
		repositorio.actualizar(usr);
	}

	@Override
	public void borrar(int id) {
		// TODO Auto-generated method stub
		repositorio.borrar(id);

	}

}
