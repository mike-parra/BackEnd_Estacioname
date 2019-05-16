package com.estacioname.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.estacioname.modelos.Cajon;

@Repository
public class CajonJDBC implements CajonDAO {
	
	@Autowired
	JdbcTemplate conexion;

	String sql = "";

	@Override
	public List<Cajon> consultar() {
		// TODO Auto-generated method stub
		sql = "SELECT * FROM cajon";
		return conexion.query(sql, new CajonRM());
	}

	@Override
	public Cajon buscar(int id) {
		// TODO Auto-generated method stub
		sql = "SELECT * FROM cajon WHERE idCajon=?";
		return conexion.queryForObject(sql, new CajonRM(), id);
	}

	@Override
	public int insertar(Cajon c) {
		// TODO Auto-generated method stub
		SimpleJdbcInsert insert = new SimpleJdbcInsert(conexion);
		List<String> columnas = new ArrayList<>();
		columnas.add("idCajon");
		columnas.add("estado");
		insert.setTableName("cajon");
		insert.setColumnNames(columnas);
		Map<String, Object> datos = new HashMap<>();
		datos.put("idCajon", c.getId());
		datos.put("estado", c.getEstado());
		insert.setGeneratedKeyName("id");
		Number idNumber = insert.executeAndReturnKey(datos);
		return idNumber.intValue();
	}

	@Override
	public void actualizar(Cajon c) {
		// TODO Auto-generated method stub

	}

}
