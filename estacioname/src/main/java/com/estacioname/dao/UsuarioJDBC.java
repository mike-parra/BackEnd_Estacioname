package com.estacioname.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Service;

import com.estacioname.modelos.Usuario;

@Service
public class UsuarioJDBC implements UsuarioDAO {

	@Autowired
	JdbcTemplate conexion;

	String sql = "";

	@Override
	public int insertar(Usuario usr) {
		// TODO Auto-generated method stub
		SimpleJdbcInsert insert = new SimpleJdbcInsert(conexion);
		List<String> columnas = new ArrayList<>();
		columnas.add("Nombre");
		columnas.add("Correo");
		columnas.add("Contraseña");
		insert.setTableName("usuario");
		insert.setColumnNames(columnas);
		Map<String, Object> datos = new HashMap<>();
		datos.put("Nombre", usr.getNombre());
		datos.put("Correo", usr.getCorreo());
		datos.put("Contraseña", usr.getContraseña());
		insert.setGeneratedKeyName("id");
		Number idNumber = insert.executeAndReturnKey(datos);
		return idNumber.intValue();
	}

	@Override
	public void actualizar(Usuario usr) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		sql = "UPDATE usuario SET Contraseña = ? WHERE id = ?";
		conexion.update(sql, usr.getContraseña());
	}

	@Override
	public void borrar(int id) {
		// TODO Auto-generated method stub
	}

}
