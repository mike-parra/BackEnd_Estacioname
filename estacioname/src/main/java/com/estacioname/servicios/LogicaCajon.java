package com.estacioname.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estacioname.dao.CajonDAO;
import com.estacioname.modelos.Cajon;

@Service
public class LogicaCajon implements CajonServicio {

	@Autowired
	CajonDAO repositorio;

	@Override
	public List<Cajon> consultar() {
		// TODO Auto-generated method stub
		return repositorio.consultar();
	}

	@Override
	public Cajon buscar(int id) {
		// TODO Auto-generated method stub
		return repositorio.buscar(id);
	}

	@Override
	public Cajon crear(Cajon c) {
		// TODO Auto-generated method stub
		int id = repositorio.insertar(c);
		c.setId(id);
		return c;
	}

	@Override
	public void modificar(Cajon c) {
		// TODO Auto-generated method stub
		repositorio.actualizar(c);
	}

}
