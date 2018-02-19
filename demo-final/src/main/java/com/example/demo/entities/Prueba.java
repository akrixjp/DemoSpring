package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tabla_prueba")
public class Prueba {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Integer Id;
	private String nombre;
	private String detalle;
	
	public Prueba() {
		
	}

	public Prueba(String nombre, String detalle) {
		this.nombre = nombre;
		this.detalle = detalle;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	@Override
	public String toString() {
		return "Prueba [Id=" + Id + ", nombre=" + nombre + ", detalle=" + detalle + "]";
	}
}
