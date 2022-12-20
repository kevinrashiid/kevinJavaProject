package _34_Prueba_Tablas;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class PruebaTablas {

	public static void main(String[] args) {
		//Asi se crea un Array HashMap
		
		HashMap<Integer,String> tabla= new HashMap<>();
		
		//Añadimos a tabla los dias de la semana 
		tabla.put(100, "Lunes");
		tabla.put(200, "martes");
		tabla.put(300, "miercoles");
		tabla.put(400, "jueves");
		tabla.put(100, "neptuno");//neptuno pisa a lunes, lo sustituye

		//Eliminamos y mostramos lo que hemos eliminado
		System.out.println(tabla.remove(300));
		
		//Recorrer los valores de un HashMap 
		Collection<String> col=tabla.values();
		
		//Con este for no se puede recorer por que el HashMap no tiene posiciones
		for(int i=0;i<tabla.size();i++);
		
		//Pero si se puede recorrer con este for
		for (String s:col) {//String por que lo que hay dentro del HashMap son letras
			System.out.println(s);
		}
		
		//recorer KEYS/CLAVES de un HashMap:
		Set<Integer> claves=tabla.keySet();
		for(Integer c:claves) {
			System.out.println(c);
		}

	}

}
