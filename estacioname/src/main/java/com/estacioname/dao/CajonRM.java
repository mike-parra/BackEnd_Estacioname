package com.estacioname.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.estacioname.modelos.Cajon;

public class CajonRM implements RowMapper<Cajon> {

	@Override
	public Cajon mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Cajon c = new Cajon();
		c.setId(rs.getInt("idCajon"));
		c.setEstado(rs.getInt("estado"));
		return c;
	}
}
