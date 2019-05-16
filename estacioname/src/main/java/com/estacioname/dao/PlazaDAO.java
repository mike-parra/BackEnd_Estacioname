package com.estacioname.dao;

import org.springframework.stereotype.Service;

import com.estacioname.modelos.Plaza;

@Service
public interface PlazaDAO {

	public Plaza buscar(int id);

	public int insertar(Plaza plz);

	public void actualizar(Plaza plz);

	public void borrar(int id);

}
