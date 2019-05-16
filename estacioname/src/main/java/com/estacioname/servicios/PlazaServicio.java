package com.estacioname.servicios;

import org.springframework.stereotype.Service;

import com.estacioname.modelos.Plaza;

@Service
public interface PlazaServicio {

	public Plaza buscar(int id);

	public Plaza crear(Plaza plz);

	public void modificar(Plaza plz);

	public void borrar(int id);

}
