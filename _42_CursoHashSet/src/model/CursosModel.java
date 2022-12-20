package model;

public class CursosModel {
	private String nombreCurso;
	private int dMediaCurso;
	private int precio;
	private String tematica;
	public CursosModel(String nombreCurso, int dMediaCurso, int precio, String tematica) {
		
		this.nombreCurso = nombreCurso;
		this.dMediaCurso = dMediaCurso;
		this.precio = precio;
		this.tematica = tematica;
	}
	public String getNombreCurso() {
		return nombreCurso;
	}
	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}
	public int getdMediaCurso() {
		return dMediaCurso;
	}
	public void setdMediaCurso(int dMediaCurso) {
		this.dMediaCurso = dMediaCurso;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String getTematica() {
		return tematica;
	}
	public void setTematica(String tematica) {
		this.tematica = tematica;
	}
}