package model;

import java.util.Date;

public class Cita {
	
	private String nombre;
	private String activado;
	private Date diaCita;

	public Cita() {
		super();
	}
	
	public Cita(String nombre, String activado, Date diaCita) {
		super();
		this.nombre = nombre;
		this.activado = activado;
		this.diaCita = diaCita;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getActivado() {
		return activado;
	}

	public void setActivado(String activado) {
		this.activado = activado;
	}

	public Date getDiaCita() {
		return diaCita;
	}

	public void setDiaCita(Date diaCita) {
		this.diaCita = diaCita;
	}

}
