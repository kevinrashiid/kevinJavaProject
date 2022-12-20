package _32_ColeccionDeNotas;

import java.util.ArrayList;
import java.util.Scanner;

public class NotasModular {
		//Realizar un programa que solicite al usuario la introducción de una nota,
		//si la nota es positiva
		//la guarda y le pide la introducción de una nueva nota, 
		//si es negativa, no la guarda, 
		 
		// no pide mas notas
		
		//Y ahora esto es lo diferente a la primera version de coleccion de notas
		//Finalmente mostrara los siguiente datos 
		//-Nota media
		//-Numeros de aprobados
		//-Nota mas alta
		//-Nota mas baja

	public static void main(String[] args) {
		//el metodo main se encargar de la lectura de datos con el Scanner
		
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> notas =new ArrayList<>();
		int nota;
		do {
			System.out.println("Introduce una nota: ");
			nota=sc.nextInt();
			if(nota>=0&&nota<=10) {//Solo se guarda si la nota esta entre 0 y 10
				notas.add(nota);
			}
		}while(nota>=0);
		System.out.println("La media es: "+calcularMedia(notas));//Llamamos al metodo que hemos creado fuera del main
		System.out.println("Han aprobado: "+aprobados(notas));
		System.out.println("La nota minima es: " +calcularminima(notas));
		System.out.println("La nota maxima es: "+calcularminima(notas));
	}
	//hacer un METODO que recibe una lista de numeros y devulve la media 
	static int calcularMedia(ArrayList<Integer> lista) { //ponemos static para que pueda 
 		int media=0;
		for(int i=0;i<lista.size();i++) {
			media=media+lista.get(i);
			
		}
		media=media/lista.size();
		return media; 
	}
	//metodo que reciber una lista de numeros y devulve el numero de aprobados
	static int aprobados(ArrayList<Integer> lista) {
		int contador=0;
		for(int i=0;i<lista.size();i++)
		if (lista.get(i)>=5) {
			contador++;
		}
		return contador;
	}

	static int calcularminima(ArrayList<Integer> lista) {
		int notaminima=lista.get(0);
		for(int i=0;i<lista.size();i++) {
			notaminima=Math.min(notaminima, lista.get(i));
		}
		return notaminima;
	}
	static int calcularmaxima(ArrayList<Integer> lista) {
		int notamaxima=lista.get(0);
		for(int i=0;i<lista.size();i++) {
			notamaxima=Math.max(notamaxima, lista.get(i));
		}
		return notamaxima;
	
	}

}


