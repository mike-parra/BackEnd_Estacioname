package com.estacioname.servicios;

import org.springframework.stereotype.Service;

import com.estacioname.modelos.Usuario;

@Service
public interface UsuarioServicio {

	public Usuario crear(Usuario usr);

	public void modificar(Usuario usr);

	public void borrar(int id);
}
