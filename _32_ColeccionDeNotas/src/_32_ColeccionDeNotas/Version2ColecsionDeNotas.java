package _32_ColeccionDeNotas;

import java.util.ArrayList;
import java.util.Scanner;

public class Version2ColecsionDeNotas {
	//Realizar un programa que solicite al usuario la introducción de una nota, si la nota el positiva
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
		Scanner sc=new Scanner(System.in); 
		ArrayList<Integer> notas=new ArrayList<>();
		
		int nota;
		int media=0;
		int aprobados=0;
		int notamaxima=0;
		int notaminima=0;
		//Lee una nota y la guardas en el ArrayList
		do {
			System.out.println("Introduce una nota: ");
			nota=sc.nextInt();
			if(nota>=0&&nota<=10) {//Solo se guarda si la nota esta entre 0 y 10
				notas.add(nota);
			}
		}while(nota>=0);
		//Sacar la media de las notas metidas
		
		for(int i=0;i<notas.size();i++) {
			//Para calcular la media
			media=media+notas.get(i);
			//Para contar los aprobados
			if(notas.get(i)>=5) {
				aprobados++;
			}
			//Para calcular la maxima nota
			notamaxima=Math.max(notamaxima, notas.get(i));
			//para calcula la minima nota
			notaminima=Math.min(notaminima, notas.get(i));
		}
		media=media/notas.size();//calculamos la media
		System.out.println("la media es"+media);//imprimimos la media	
		System.out.println("El numero de aprobado es: "+aprobados);
		System.out.println("El maximo es: "+notamaxima);
		System.out.println("El minimo es:" +notaminima);	
	}
}
