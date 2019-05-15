package com.estacioname.dao;

import org.springframework.stereotype.Service;

import com.estacioname.modelos.Usuario;

@Service
public interface UsuarioDAO {

	public int insertar(Usuario usr);

	public void actualizar(Usuario usr);

	public void borrar(int id);

}
