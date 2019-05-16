package com.estacioname.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.estacioname.modelos.Plaza;

public class PlazaRM implements RowMapper<Plaza> {

	@Override
	public Plaza mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Plaza c = new Plaza();
		c.setId(rs.getInt("idPlaza"));
		c.setNombre(rs.getString("Nombre"));
		c.setDireccion(rs.getString("Direccion"));
		c.setCajones(rs.getInt("Cajones"));
		c.setCoordenadaX(rs.getDouble("Coordenada_X"));
		c.setCoordenadaY(rs.getDouble("Coordenada_Y"));
		return c;
	}

}
