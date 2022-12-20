package _24_CorreoElectronico;

import java.util.Scanner;

public class DirreccionEmails {

	public static void main(String[] args) {
		/*Realizar un programa que solicite la introduccionde 
		 * una dirección de correo electrónico, y nos indique 
		 * si es o no válida (tiene que tener @ y .)*/
		
		Scanner sc=new Scanner(System.in);//pedimos algo 
		String email;//creamos la varible String email
		System.out.println("Introduce un email");
		email=sc.nextLine();//lo que pedimos se nos guarda email
		if(email.indexOf("@")!=-1 && email.indexOf(".")!=-1) {
			/*Con esto decimos si tiene "@" y "."
			*para comfirma que es un correo
			*si pos !=-1=significa 
			*que contiene ese caracter
			*&& es el "y" logico
			*|| es el "o" logico */
			System.out.println("Email valido");
			
		}else {
			System.out.println("Email no valido");
		}
	}

}
