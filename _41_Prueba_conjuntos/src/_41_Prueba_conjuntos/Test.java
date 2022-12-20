package _41_Prueba_conjuntos;

import java.util.HashSet;

public class Test {

	public static void main(String[] args) {
		//HashSet no tiene indice/posiciones el elemento estan sueltos
		//Comodos para crear 
		HashSet<String> datos=new HashSet<>();
		datos.add("elemento 1");
		datos.add("elemento 2");
		datos.add("elemento 3");
		datos.add("elemento 1");//sustituye a el primer "elemento 1"
		System.out.println(datos.size());//para mostrar el tañano que tiene de datos
		
		//Para mostrar todo el contenido de datos
		for(String s:datos) {
			System.out.println(s);
		}
	}
}
