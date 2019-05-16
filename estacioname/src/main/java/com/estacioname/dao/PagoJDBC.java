package com.estacioname.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.estacioname.modelos.Pago;


@Repository
public class PagoJDBC implements PagoDAO {
	
	@Autowired
	JdbcTemplate conexion;

	String sql = "";

	@Override
	public List<Pago> consultar() {
		// TODO Auto-generated method stub
		sql = "SELECT * FROM pago";
		return conexion.query(sql, new PagoRM());
	}

	@Override
	public Pago buscar(int id) {
		// TODO Auto-generated method stub
		sql = "SELECT * FROM pago WHERE idPago=?";
		return conexion.queryForObject(sql, new PagoRM(), id);
	}

	@Override
	public int insertar(Pago p) {
		// TODO Auto-generated method stub
		SimpleJdbcInsert insert = new SimpleJdbcInsert(conexion);
		List<String> columnas = new ArrayList<>();
		columnas.add("Descripcion");
		columnas.add("Monto");
		columnas.add("Tiempo");
		columnas.add("Usuario_idUsuario");
		columnas.add("Plaza_idPlaza");
		insert.setTableName("pago");
		insert.setColumnNames(columnas);
		Map<String, Object> datos = new HashMap<>();
		datos.put("Descripcion", p.getDescripcion());
		datos.put("Monto", p.getMonto());
		datos.put("Tiempo", p.getTiempo());
		datos.put("Usuario_idUsuario", p.getIdUsuario());
		datos.put("Plaza_idPlaza", p.getIdPlaza());
		insert.setGeneratedKeyName("id");
		Number idNumber = insert.executeAndReturnKey(datos);
		return idNumber.intValue();
	}

}
