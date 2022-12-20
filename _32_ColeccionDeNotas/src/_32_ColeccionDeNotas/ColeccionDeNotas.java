package _32_ColeccionDeNotas;

import java.util.ArrayList;
import java.util.Scanner;

public class ColeccionDeNotas {
		//Realizar un programa que solicite al usuario la introduccion de una nota
		//Si la nota es positiva 
		//La guarda
		//Pregunta si desea introducir otra nota

		//si es negativa no la guarda
		//y no pide mas notas 
		//y muestra las notas guardadas hasta el momento
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in); 
		ArrayList<Integer> notas=new ArrayList<>();
		
		int nota;
		//Lee una nota y la guardas en el ArrayList
		do {
			System.out.println("Introduce una nota: ");
			nota=sc.nextInt();
			if(nota>=0&&nota<=10) {//Solo se guarda si la nota esta entre 0 y 10
				notas.add(nota);
			}
		}while(nota>=0);
		//mostrar todas las notas
		for(int i=0;i<notas.size();i++) {//recoremos el ArrayList 
			System.out.println(notas.get(i));//Mostramos la i que a pasado por todod el array
		}

	}
}


