package com.estacioname.servicios;

import java.util.List;

import org.springframework.stereotype.Service;

import com.estacioname.modelos.Cajon;

@Service
public interface CajonServicio {

	public List<Cajon> consultar();

	public Cajon buscar(int id);

	public Cajon crear(Cajon c);

	public void modificar(Cajon c);

}
