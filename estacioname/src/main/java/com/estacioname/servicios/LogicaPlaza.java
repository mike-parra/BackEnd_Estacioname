package com.estacioname.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estacioname.dao.PlazaDAO;
import com.estacioname.modelos.Plaza;

@Service
public class LogicaPlaza implements PlazaServicio {

	@Autowired
	PlazaDAO repositorio;

	@Override
	public Plaza buscar(int id) {
		// TODO Auto-generated method stub
		return repositorio.buscar(id);
	}

	@Override
	public Plaza crear(Plaza plz) {
		// TODO Auto-generated method stub
		int id = repositorio.insertar(plz);
		plz.setId(id);
		return plz;
	}

	@Override
	public void modificar(Plaza plz) {
		// TODO Auto-generated method stub
		repositorio.actualizar(plz);

	}

	@Override
	public void borrar(int id) {
		// TODO Auto-generated method stub
		repositorio.borrar(id);

	}

}
