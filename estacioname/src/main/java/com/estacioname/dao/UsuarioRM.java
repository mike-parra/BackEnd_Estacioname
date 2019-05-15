package com.estacioname.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.estacioname.modelos.Usuario;

public class UsuarioRM implements RowMapper<Usuario>{

	@Override
	public Usuario mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Usuario c = new Usuario();
		c.setId(rs.getInt("idUsuario"));
		c.setNombre(rs.getString("Nombre"));
		c.setCorreo(rs.getString("Correo"));
		c.setContraseña(rs.getString("Contraseña"));
		return c;
	}

}
