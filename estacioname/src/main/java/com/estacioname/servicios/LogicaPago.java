package com.estacioname.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estacioname.dao.PagoDAO;
import com.estacioname.modelos.Pago;

@Service
public class LogicaPago implements PagoServicio {

	@Autowired
	PagoDAO repositorio;

	@Override
	public List<Pago> consultar() {
		// TODO Auto-generated method stub
		return repositorio.consultar();
	}

	@Override
	public Pago buscar(int id) {
		// TODO Auto-generated method stub
		return repositorio.buscar(id);
	}

	@Override
	public Pago crear(Pago p) {
		// TODO Auto-generated method stub
		int id = repositorio.insertar(p);
		p.setId(id);
		return p;
	}

}
