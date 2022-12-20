package model;

public class Alumno {
	//atributos
	private String nombre;
	private String curso;
	private double nota;
	private String email;
	//constructor que permite inicializar el objeto con datos de un alumno
	public Alumno(String nombre, String curso, double nota, String email) {
		//con la palabra this. refieres al atributo
		this.nombre=nombre;
		this.curso=curso;
		this.nota=nota;
		this.email=email;
	}
	//setter para añadir valor a los atributos 
	//getter para leer el valor 
	public void setNombre(String nombre) {//se usa para asignar un valor al atributo
		this.nombre=nombre;
	}
	public String getNombre() {//se usa para leer el valor de un atributo
		return nombre;
	}
	public void setCurso(String curso) {
		this.curso=curso;
	}
	public  String getCurso() {
		return curso;
	}
	public void  setNota(double nota) {
		this.nota=nota;
	}
	public double getNota() {
		return nota;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public String getEmail() {
		return email;
	}
	

}
