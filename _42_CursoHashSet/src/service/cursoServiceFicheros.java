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

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.List;

import model.CursosModel;

public class cursoServiceFicheros {
	//empezamos el codigo haciendo la estructura de todos los metodos por ahora vacios
	String ruta="c:\\temp\\cursos.txt";
	
	
	public boolean guardarCurso(CursosModel cur) {
		try(FileReader fr=new FileReader(ruta);
				BufferedReader bf=new BufferedReader(fr);){
				String s;
				while((s=bf.readLine())!=null) {
					//si encontramos curso con dicho nombre, salimos
					if(s.split("[|]")[0].equals(CursosModel.getNombreCurso())) {
						return false;
					}
				}
			}catch(IOException ex) {
				ex.printStackTrace();
			}
			//aqui llega si no encuentra curso, y entonces lo tiene
			//que grabar en el fichero
			try(FileOutputStream fos=new FileOutputStream(ruta,true);
				PrintStream out=new PrintStream(fos);){
				out.println(CursosModel.getNombreCurso()+"|"+CursosModel.getPrecio()+"|"+CursosModel.getdMediaCurso()+"|"+CursosModel.getTematica());
			}catch(IOException ex) {
				ex.printStackTrace();
			}
			return true;
		}
	public CursosModel buscarCurso(String nombreCurso) {//2.- Buscar curso //Metodo creado para buscar
		
	}
	public double duracionMediaCursos() {//3.- Duración media de cursos// Metodo creado para mostrar la duracion media de todos los cursos registrados
		
	}
	public List<String> tematicaCurso(String tematica) {
	
	}
	public void eliminarCurso(int precio){//5.- Eliminar cursos por precio

	}
}


