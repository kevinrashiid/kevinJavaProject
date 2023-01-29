package services;
/*
1.- Añadir ciudad
2.- Ciudad más poblada
3.- Ciudades por pais
3.- Salir

Cada ciudad contiene nombre, habitantes y pais
La opción 3, te pide el nombre del pais y te muestra 
los datos de todas la ciudades que pertenecen a ese pais*/

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import model.Ciudad;

public class PaisesServices {
	
	String ruta="c:\\Ficheros\\Paises.txt";
	
	public void añadirCiudad(String nombre, int habitantes, String pais) {//metodo para añadir Ciudad
		String datos=nombre+"|"+habitantes +"|"+pais;//dentro del documento .txt 
		try(FileOutputStream fos=new FileOutputStream(ruta,true);
				PrintStream out=new PrintStream(fos);){
				out.println(datos);
			}
			catch(IOException ex) {
				ex.printStackTrace();
			}
	}
	
	public Ciudad  ciudadMasPoblada() {//metodo para saber la ciudad mas poblada
		Ciudad ciudad=null;
		int habitantesMax=0;
		try(FileReader fr=new FileReader(ruta);
				BufferedReader bf=new BufferedReader(fr)){
				String fila;
				//recorremos el fichero linea a línea, y convertimos cada línea en un Pedido
				//después, comprobamos si ese pedido es posterior al auxiliar
				while((fila=bf.readLine())!=null) {
					//convierto line a array
					String[] linea=fila.split("[|]");
					//creo objeto pedido con datos de la línea
					Ciudad c=new Ciudad(linea[0],Integer.parseInt(linea[1]),linea[2]);
					//comprobamos si se trata de un pedido más reciente
					if(c.getHabitantes()>habitantesMax) {
						//si es así, actualizo variables
						habitantesMax=c.getHabitantes();
						ciudad=c;
					}
				}			
			}
			catch(IOException ex) {
				ex.printStackTrace();
			}
			return ciudad; //devuelvo pedido encontrado
	}
	
	public ArrayList<Ciudad> cidadesPorPais(String pais) {
		ArrayList<Ciudad> resultado=new ArrayList<>();
		SimpleDateFormat fm = new SimpleDateFormat ("dd-MM-yyyy");
		try(FileReader fr=new FileReader(ruta);
			BufferedReader bf=new BufferedReader(fr)){
			String fila;
			//recorremos el fichero linea a línea, y convertimos cada línea en un Pedido
			//después, comprobamos si ese pedido es posterior al auxiliar
			while((fila=bf.readLine())!=null) {
				//convierto line a array
				String[] linea=fila.split("[|]");
				//creo objeto pedido con datos de la línea
				Ciudad c=new Ciudad(linea[0],Integer.parseInt(linea[1]),linea[2]);
				if(c.getPais().equals(pais)) {
					//añadimos pedido a la lista de resultados
					resultado.add(c);	
				}	
			}			
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		return resultado;
	}
}