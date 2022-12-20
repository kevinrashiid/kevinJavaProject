package _20_Pedir5Nuemeros;

import java.util.Scanner;

public class NumeroPar {

	public static void main(String[] args) {
		int media=0;//para calcular la media
		/*Pedir 5 numeros pares por teclado 
		 * si no es par pedir otra vez
		 * hasta conseguir 5
		 * luego mostrar la media de los 5 */
		Scanner sc= new Scanner(System.in);
		int [] pares=new int [5];/*hacemos un array sin contenido
		* pero limitando su contenido*/
		
		int num;// aqui guardamos numero leido 
		/*for(int i=0;i<pares.length;i++) {
			System.out.println("Introduce un par");
			num=sc.nextInt();
			//si es par se guarda 
			if(num%2==0) {
				pares[i]=num;
			}else {
				
			}
		}*/
		int validos=0;//esta variable lleva la cuenta de los pares leidos 
		while(validos<pares.length) {
			System.out.println("Introduce un par");
			num=sc.nextInt();
			/*si es par se guarda y como hay un nuevo par,
			*se incrementa la variable*/ 
			if(num%2==0) {
				pares[validos]=num;
				validos++;
			}
		}
		/*media de los numeros*/
		for(int i=0;i<pares.length;i++) {
			media=media+pares[i];
		}
		media=media/pares.length;
		System.out.println("la media de numeros es "+media);
	}
}
