package com.estacioname.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.estacioname.modelos.Pago;

@Repository
public interface PagoDAO {

	List<Pago> consultar();

	Pago buscar(int id);

	int insertar(Pago p);

}
