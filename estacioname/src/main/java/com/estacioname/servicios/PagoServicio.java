package com.estacioname.servicios;

import java.util.List;

import org.springframework.stereotype.Service;

import com.estacioname.modelos.Pago;

@Service
public interface PagoServicio {

	public List <Pago> consultar();

	public Pago buscar(int id);

	public Pago crear(Pago p);


}
