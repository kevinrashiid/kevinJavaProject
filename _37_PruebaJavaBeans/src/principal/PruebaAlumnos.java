package principal;

import model.Alumno;
import model.Empleado;

public class PruebaAlumnos {

	public static void main(String[] args) {
		
		Alumno al=new Alumno("alumno 1","java",8,"alumno@gmail.com");
		System.out.println("Nombre del alumno: "+al.getNombre());
		System.out.println("Curso del alumno: "+al.getCurso());
	
		//array de empleados
		Empleado[] empleados=new Empleado[10];
		empleados[0]= new Empleado("a","aa5",100);
	}

}
