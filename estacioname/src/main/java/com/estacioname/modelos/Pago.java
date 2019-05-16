package com.estacioname.modelos;

public class Pago {

	private int id, idUsuario, idPlaza;
	private String Descripcion;
	private int Monto;
	private String Tiempo;

	public Pago() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pago(int id, int idUsuario, int idPlaza, String descripcion, int monto, String tiempo) {
		super();
		this.id = id;
		this.idUsuario = idUsuario;
		this.idPlaza = idPlaza;
		Descripcion = descripcion;
		Monto = monto;
		Tiempo = tiempo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public int getIdPlaza() {
		return idPlaza;
	}

	public void setIdPlaza(int idPlaza) {
		this.idPlaza = idPlaza;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public int getMonto() {
		return Monto;
	}

	public void setMonto(int monto) {
		Monto = monto;
	}

	public String getTiempo() {
		return Tiempo;
	}

	public void setTiempo(String tiempo) {
		Tiempo = tiempo;
	}

}
