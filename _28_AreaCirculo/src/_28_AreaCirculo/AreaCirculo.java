package _28_AreaCirculo;

import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[] args) {
		
		//Solicitar el area del circulo y mostrar su area
		Scanner sc= new Scanner(System.in);/*pedimos numeros*/
		int radio;//creamos el radio
		double area;//creamos el area
		System.out.println("dime el radio: ");
		radio=sc.nextInt();//lo que nos pidio por scanner se mete en radio
		area=Math.PI*Math.pow(radio, 2);//
		System.out.println("El area es: "+area);
		/*System.out.printf("El are es: %1.2f "+area);*/ //para sacar el numero double con solo dos decimales 
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
