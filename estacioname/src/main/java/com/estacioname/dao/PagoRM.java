package com.estacioname.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;

import com.estacioname.modelos.Pago;

public class PagoRM implements RowMapper<Pago> {

	@Override
	public Pago mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Pago c = new Pago();
		c.setId(rs.getInt("idPago"));
		c.setDescripcion(rs.getString("Descripcion"));
		c.setMonto(rs.getInt("Monto"));
		c.setTiempo(rs.getString("Tiempo"));
		c.setIdUsuario(rs.getInt("Usuario_idUsuario"));
		c.setIdPlaza(rs.getInt("Plaza_idPlaza"));
		return c;
	}

}
