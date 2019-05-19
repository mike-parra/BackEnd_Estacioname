package com.estacioname.modelos;

public class Pago {

	private int id, idUsuario, idPlaza;
	private String descripcion;
	private int monto;
	private String tiempo;

	public Pago() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pago(int id, int idUsuario, int idPlaza, String descripcion, int monto, String tiempo) {
		super();
		this.id = id;
		this.idUsuario = idUsuario;
		this.idPlaza = idPlaza;
		this.descripcion = descripcion;
		this.monto = monto;
		this.tiempo = tiempo;
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
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		descripcion = descripcion;
	}

	public int getMonto() {
		return monto;
	}

	public void setMonto(int monto) {
		monto = monto;
	}

	public String getTiempo() {
		return tiempo;
	}

	public void setTiempo(String tiempo) {
		tiempo = tiempo;
	}

}
