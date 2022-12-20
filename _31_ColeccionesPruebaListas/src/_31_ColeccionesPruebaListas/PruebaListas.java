package _31_ColeccionesPruebaListas;

import java.util.ArrayList;

public class PruebaListas {

	public static void main(String[] args) {

		ArrayList<Integer> numeros=new ArrayList<>();//Para crear un ArrayList de numero
		ArrayList<String> texto=new ArrayList<>();//Para crear un ArrayList de texto
		
		texto.add("lunes");//añadimos lunes martes miercoles al array texto
		texto.add("marte");
		texto.add("miercoles");
		System.out.println(texto.get(1));//mostramos lo que hay en la posicion 1
		texto.add(1,"jueves");//añdimos en la posicion 1 "jueves"
		System.out.println(texto.get(3));//mostramos lo que hay en la posicion 3
		texto.remove(0);//Eliminamos lo que tenga en la posicion 0
		System.out.println(texto.get(0));//mostramos lo que hay en la posicion 0
		
		//recorer el ArrayList con el BUCLE FOR
		for(int i=0;i<texto.size();i++) {
			System.out.println(texto.get(i));
		}
		
		//lista de integer
		numeros.add(20);//añadimos un numero a el ArraysList
		numeros.add(1,3);//añadimos el numero 3 en la posicoon 1 en el 0 esta el 20 
		
		
		
	}

}
