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
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import model.CursosModel;

public class cursoServiceFicheros {
	//empezamos el codigo haciendo la estructura de todos los metodos por ahora vacios
	String ruta="c:\\temp\\cursos.txt";
	//en el constructor comprobamos si existe el fichero utilizando file
	//y si no existe lo creamos
	//la clase file para saber cosas de ficheros(creacion, eliminacion, si existe?)
	public cursoServiceFicheros() {//CONSTRUCTOR//SE LLAMA IGUAL QUE LA CLASE
		File file=new File(ruta);
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public boolean guardarCurso(CursosModel cur) {//solicitan los datos del curso y se añade (opcional, no debería permitir cursos con el mismo nombre)
		try(FileReader fr=new FileReader(ruta);
				BufferedReader bf=new BufferedReader(fr);){
				String s;
				while((s=bf.readLine())!=null) {
					//si encontramos curso con dicho nombre, salimos
					if(s.split("[|]")[0].equals(cur.getNombreCurso())) {
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
				out.println(cur.getNombreCurso()+"|"+cur.getPrecio()+"|"+cur.getDMediaCurso()+"|"+cur.getTematica());
			}catch(IOException ex) {
				ex.printStackTrace();
			}
			return true;
		}
	public CursosModel buscarCurso(String nombreCurso) {//2.- Buscar curso //Metodo creado para buscar 
		CursosModel curso=null;
		try(FileReader fr=new FileReader(ruta);
				BufferedReader bf=new BufferedReader(fr);){
			String s;
			while((s=bf.readLine())!=null) {
				//si encontramos curso con dicho nombre, salimos
				String[] datos=s.split("[|]");
				if(datos[0].equals(nombreCurso)) {
					//crear objeto curso con todos los datos del mismo
					curso=new CursosModel(datos[0], 
							Double.parseDouble(datos[1]),
							Integer.parseInt(datos[2]), 
							datos[3]);
				}
			}
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		return curso;
	}
	public double duracionMediaCursos() {//3.- Duración media de cursos// Metodo creado para mostrar la duracion media de todos los cursos registrados
		double media=0;
		int total=0;
		try(FileReader fr=new FileReader(ruta);
				BufferedReader bf=new BufferedReader(fr);){
			String s;
			while((s=bf.readLine())!=null) {
				total++;//variable que cuenta
				String[] datos=s.split("[|]");
				media=media+Integer.parseInt(datos[3]);
			}
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		return media/total;
	}
	public List<CursosModel> tematicaCurso(String tematica) {//Se pìde una temática y se muestran  datos de todos los cursos que tengan esa temática
		List<CursosModel> aux=new ArrayList<>();
		try(FileReader fr=new FileReader(ruta);
				BufferedReader bf=new BufferedReader(fr);){
			String s;
			while((s=bf.readLine())!=null) {
				//si encontramos curso con dicho nombre, salimos
				String[] datos=s.split("[|]");
				if(datos[3].equalsIgnoreCase(tematica)) {
					//crear objeto curso con todos los datos del mismo
					CursosModel curso2=new CursosModel(datos[0], 
							Double.parseDouble(datos[1]),
							Integer.parseInt(datos[2]), 
							datos[3]);
					//agregamos el nuevo curso auxiliar 
					//que devolveremos como resultado
					aux.add(curso2);
				}
			}
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		return aux;
	}
	public void eliminarCurso(double precio){//5.- Eliminar cursos por precio
//Se pide un precio y se eliminarán todos los cursos cuyo precio sea igual o superior a dicho valor
		List<CursosModel> auX= new ArrayList<>();
		try(FileReader fr=new FileReader(ruta);
				BufferedReader bf=new BufferedReader(fr);){
			String s;
			while((s=bf.readLine())!=null) {
				//si encontramos curso con dicho nombre, salimos
				String[] datos=s.split("[|]");
					//crear objeto curso con todos los datos del mismo
					CursosModel curso2=new CursosModel(datos[0], 
							Double.parseDouble(datos[1]),
							Integer.parseInt(datos[2]), 
							datos[3]);
					//agregamos el nuevo curso auxiliar 
					//que devolveremos como resultado
					auX.add(curso2);
			}
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		//elimina de la lista los que cumplan la condicion
		auX.removeIf(t->t.getPrecio()>precio);
		//volcar la lista en el FICHERO
		//recorremos la lista y vamos escribiendo cada curso en una linea del fichero
		try(FileOutputStream fos=new FileOutputStream(ruta,true);
				PrintStream out=new PrintStream(fos);){
			for(CursosModel curso:auX) {
			out.println(curso.getNombreCurso()+"|"+curso.getPrecio()+"|"+curso.getNombreCurso()+"|"+curso.getTematica());
			}
		}catch(IOException ex) {
			ex.printStackTrace();
		}
	}
}