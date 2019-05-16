package com.estacioname.modelos;

public class Plaza {

	private int id, cajones;
	private String Nombre, Direccion;
	private double CoordenadaX, CoordenadaY;

	public Plaza() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Plaza(int id, int cajones, String nombre, String direccion, double coordenadaX, double coordenadaY) {
		super();
		this.id = id;
		this.cajones = cajones;
		Nombre = nombre;
		Direccion = direccion;
		CoordenadaX = coordenadaX;
		CoordenadaY = coordenadaY;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCajones() {
		return cajones;
	}

	public void setCajones(int cajones) {
		this.cajones = cajones;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public double getCoordenadaX() {
		return CoordenadaX;
	}

	public void setCoordenadaX(double coordenadaX) {
		CoordenadaX = coordenadaX;
	}

	public double getCoordenadaY() {
		return CoordenadaY;
	}

	public void setCoordenadaY(double coordenadaY) {
		CoordenadaY = coordenadaY;
	}
	
	

}
