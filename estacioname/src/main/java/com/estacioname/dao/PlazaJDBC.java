package com.estacioname.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.estacioname.modelos.Plaza;

@Repository
public class PlazaJDBC implements PlazaDAO{
	
	@Autowired
	JdbcTemplate conexion;

	String sql = "";

	@Override
	public Plaza buscar(int id) {
		// TODO Auto-generated method stub
		sql = "SELECT * FROM plaza WHERE idPlaza=?";
		return conexion.queryForObject(sql, new PlazaRM(), id);
	}

	@Override
	public int insertar(Plaza plz) {
		// TODO Auto-generated method stub
		SimpleJdbcInsert insert = new SimpleJdbcInsert(conexion);
		List<String> columnas = new ArrayList<>();
		columnas.add("Nombre");
		columnas.add("Direccion");
		columnas.add("Cajones");
		columnas.add("Coordenada_X");
		columnas.add("Coordenada_Y");
		insert.setTableName("plaza");
		insert.setColumnNames(columnas);
		Map<String, Object> datos = new HashMap<>();
		datos.put("Nombre", plz.getNombre());
		datos.put("Direccion", plz.getDireccion());
		datos.put("Cajones", plz.getCajones());
		datos.put("Coordenada_X", plz.getCoordenadaX());
		datos.put("Coordenada_Y", plz.getCoordenadaY());
		insert.setGeneratedKeyName("id");
		Number idNumber = insert.executeAndReturnKey(datos);
		return idNumber.intValue();
	}

	@Override
	public void actualizar(Plaza plz) {
		// TODO Auto-generated method stub
		sql = "UPDATE plaza SET cajones = ? WHERE id = ?";
		conexion.update(sql, plz.getCajones(), plz.getId());
	}

	@Override
	public void borrar(int id) {
		// TODO Auto-generated method stub
		
	}

}
