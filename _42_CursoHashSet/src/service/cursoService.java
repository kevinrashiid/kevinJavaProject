package service;
/*ENUNCIADO DE EJERCICIO:

1.- Añadir curso
2.- Buscar curso
3.- Duración media de cursos
4.- Cursos por temática
5.- Eliminar cursos por precio
6.- Salir

Un curso se caracteriza por nombre, duracion, precio y temática.
Opción 1: se solicitan los datos del curso y se añade (opcional, no debería permitir cursos con el mismo nombre)
Opción 2: Se pide el nombre del curso y se muestran todos los datos del mismo
Opción 3: Muestra la duración media de todos los cursos registrados
Opción 4: Se pìde una temática y se muestran  datos de todos los cursos que tengan esa temática
Opción 5: Se pide un precio y se eliminarán todos los cursos cuyo precio sea igual o superior a dicho valor

Utilizamos HashSet para guardar los cursos*/

import java.util.ArrayList;
import java.util.HashSet;

import model.CursosModel;

public class cursoService {
	
	HashSet<CursosModel> Cursos=new HashSet<>();
	
	public void guardarCurso(String nombreCurso, double dMediaCurso, int precio, String tematica) {
		for(CursosModel n:Cursos) {
			if(!Cursos.equals(n.getNombreCurso())){//no se si esta bien
				Cursos.add(new Cs(nombreCurso,dMediaCurso,precio,tematica));
			}
		}
	}
	public ArrayList<CursosModel> buscarCurso() {//2.- Buscar curso //Metodo creado para buscar 
		ArrayList<CursosModel> c=new ArrayList<>();
		for(CursosModel k:Cursos) {
			c.add(k);
		}
		return c;
	}
	public double duracionMediaCursos() {//3.- Duración media de cursos// Metodo creado para mostrar la duracion media de todos los cursos registrados
		double media=0;
		for(CursosModel c: Cursos) {
			media=media+c.getdMediaCurso();
		}
		return media;
	}
	public ArrayList<String> tematicaCurso(String tematica) {
		ArrayList<String> res=new ArrayList<>();
		for(CursosModel c:Cursos) {
			if(c.getTematica().equalsIgnoreCase(tematica)) {
				res.add(c.getNombreCurso());
			}
		}
		return res;
	}
	public int eliminarCurso(int precio){
	int cont=0;
	for(CursosModel s:Cursos) {
		if(s.getPrecio()>precio) {
			Cursos.remove(s); 
			cont++;
			
			}
		}	
	return cont;
	}
}	
