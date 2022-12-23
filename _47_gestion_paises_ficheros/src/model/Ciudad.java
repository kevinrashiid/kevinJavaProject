package model;
/*
1.- Añadir ciudad
2.- Ciudad más poblada
3.- Ciudades por pais
3.- Salir

Cada ciudad contiene nombre, habitantes y pais
La opción 3, te pide el nombre del pais y te muestra 
los datos de todas la ciudades que pertenecen a ese pais*/

public class Ciudad {
	
	private String nombre;
	private int habitantes;
	private String pais;
	public Ciudad(String nombre, int habitantes, String pais) {
		this.nombre=nombre;
		this.habitantes = habitantes;
		this.pais=pais;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public int getHabitantes() {
		return habitantes;
	}
	public void setHabitantes(int habitantes) {
		this.habitantes=habitantes;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais=pais;
	}
}