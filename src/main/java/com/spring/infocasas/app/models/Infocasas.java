package com.spring.infocasas.app.models;

import java.io.Serializable;

public class Infocasas implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String nombre;
	private String apellido;
	private String email;
	private String telefono;
	private String dni;
	private String horario;
	private String proyecto;
	private String origen;
	private String utm_source;
	private String utm_medium;
	private String industria;
	
	public Infocasas() {
	
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public String getEmail() {
		return email;
	}
	public String getTelefono() {
		return telefono;
	}
	public String getDni() {
		return dni;
	}
	public String getHorario() {
		return horario;
	}
	public String getProyecto() {
		return proyecto;
	}
	public String getOrigen() {
		return origen;
	}
	public String getUtm_source() {
		return utm_source;
	}
	public String getUtm_medium() {
		return utm_medium;
	}
	public String getIndustria() {
		return industria;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public void setProyecto(String proyecto) {
		this.proyecto = proyecto;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public void setUtm_source(String utm_source) {
		this.utm_source = utm_source;
	}
	public void setUtm_medium(String utm_medium) {
		this.utm_medium = utm_medium;
	}
	public void setIndustria(String industria) {
		this.industria = industria;
	}
	@Override
	public String toString() {
		return "SolicitudLead [nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", telefono="
				+ telefono + ", dni=" + dni + ", horario=" + horario + ", proyecto=" + proyecto + ", origen=" + origen
				+ ", utm_source=" + utm_source + ", utm_medium=" + utm_medium + ", industria=" + industria + "]";
	}
	
	
}
