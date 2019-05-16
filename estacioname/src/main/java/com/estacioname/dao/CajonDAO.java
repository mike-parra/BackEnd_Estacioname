package com.estacioname.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.estacioname.modelos.Cajon;

@Repository
public interface CajonDAO {

	List<Cajon> consultar();

	Cajon buscar(int id);

	int insertar(Cajon c);

	void actualizar(Cajon c);

}
