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
import java.util.List;

import model.CursosModel;

public class cursoService {
	//empezamos el codigo haciendo la estructura de todos los metodos por ahora vacios
	
	HashSet<CursosModel> Cursos=new HashSet<>();
	
	public boolean guardarCurso(CursosModel cur) {
		for(CursosModel n:Cursos) {
			//si encontramos un curso con el mismo nombre salimos y devolvemos false
			if(n.getNombreCurso().equalsIgnoreCase(n.getNombreCurso())){//no se si esta bien
				return false;
			}
		}
		//si llegamos aqui es por que no hay un curso con el mismo nombre
		Cursos.add(cur);
		return true;
	}
	public CursosModel buscarCurso(String nombreCurso) {//2.- Buscar curso //Metodo creado para buscar 
		/*ArrayList<CursosModel> c=new ArrayList<>();
		for(CursosModel k:Cursos) {
			c.add(k); 
		}
		return c;*/ 
		CursosModel c=null;
		for(CursosModel cr:Cursos) {
			if(cr.getNombreCurso().equalsIgnoreCase(nombreCurso)) {//encontrado
				c=cr;
				break;
			}
		}
		return c;
	}
	public double duracionMediaCursos() {//3.- Duración media de cursos// Metodo creado para mostrar la duracion media de todos los cursos registrados
		double media=0;
		for(CursosModel c: Cursos) {
			media=media+c.getdMediaCurso();
		}
		return media/Cursos.size();
	}
	public List<String> tematicaCurso(String tematica) {
		List<String> res=new ArrayList<>(); //creamos un ArrayList de tipo List // Arraylist es una sublista de List 
		for(CursosModel c:Cursos) {
			//si la tematica del curso que recorremos es igual a la temática recibida, lo añadimos a la lista auxiliar
			if(c.getTematica().equalsIgnoreCase(tematica)) {
				res.add(c.getNombreCurso());
			}
		}
		return res; 
	}
	public void eliminarCurso(int precio){
	/*int cont=0;
	for(CursosModel s:Cursos) {
		if(s.getPrecio()>precio) {
			Cursos.remove(s); 
			cont++;
			}
		}*/
		Cursos.removeIf(t->t.getPrecio()>precio);
	}
}	
