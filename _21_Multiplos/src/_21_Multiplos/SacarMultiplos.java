package _21_Multiplos;

import java.util.Scanner;

public class SacarMultiplos {

	public static void main(String[] args) {
		/*Realizar un programa que lea 5 numeros
		 * El programa analizar cada numero y 
		 * nos dira si es multiplo de 2,3,5
		 * o de ninguno de ellos*/
		
		Scanner sc=new Scanner(System.in);
		int [] numeros= new int [5];//creamos el array vacio pero limitandolo a 5
		
		int leidos;
		for(int i=1;i<numeros.length;i++) {
			//lee el numero y lo guarda en la variable
			System.out.println("Introduce un numero");
			leidos=sc.nextInt();
			if(leidos%2==0) {//pregunta si es multiplo de 2
				numeros[i]=leidos;
				System.out.println("Multiplo de dos");
				continue; //Leemos el siguiente numero
				
			}else if(leidos%3==0) {//pregunta si es multiplo de 3
				numeros[i]=leidos;
				System.out.println("Multiplo de tres");
				continue; //Leemos el siguiente numero
				
			}else if(leidos%5==0){//pregunta si es multiplo de 5
				numeros[i]=leidos;
				System.out.println("Multiplo de cinco");
				continue;//Leemos el siguiente numero
			}
			System.out.println("No es Multiplo de ninguno");
			
			
		}
		System.out.println("Hemos terminado");
	}

}

/*ESTA SERIA UNA FORMA DE HACERLO SIN EL ARRAY
 * 
 * Scanner sc=new Scanner(System.in);
		int num;
		for(int i=1;i<=5;i++) {
			//lee el número y lo guarda en la variable
			System.out.println("Introduce número");
			num=sc.nextInt();
			if(num%2==0) {//si multiplo de 2
				System.out.println("múltiplo de 2");
				continue; //leemos siguiente
			}
			if(num%3==0) {//si multiplo de 3
				System.out.println("múltiplo de 3");
				continue;
			}
			if(num%5==0) {//si multiplo de 5
				System.out.println("múltiplo de 5");
				continue;
			}
			System.out.println("No es múltiplo de ninguno");
		}
		System.out.println("Hemos terminado"); */
