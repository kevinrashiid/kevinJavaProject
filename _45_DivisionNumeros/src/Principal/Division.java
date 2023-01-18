package Principal;

import java.util.InputMismatchException;
import java.util.Scanner;

//Realizar un programa que solicite la introduccion de dos numeros
//y muestre el resultado  de dividir uno entre otros
public class Division {
	
	

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n1,n2,div;		
		System.out.println("Introduce un numero:");		
		try {//el codigo que esta dentro del try es donde se supone que esta el error
			n1=sc.nextInt();	
			System.out.println("Introduce otro numero");
			n2=sc.nextInt();
			div=n1/n2;
			System.out.println("La division es "+div);
			
		}
		catch(ArithmeticException ex) {//al dar este error te aparece este mensaje 
			System.out.println("NO se permiten division por 0");
		}
		catch(InputMismatchException ex) {
			System.out.println("Debes introducir solo caracteres numericos");
			
		}		
	}

}
