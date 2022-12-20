package _23_SolicitarUnTexto;

import java.util.Scanner;

public class SoliciteUnTexto {

	public static void main(String[] args) {
		/*Realizar un programa que solicite la introduccion de un texto
		 *que nos diga cuantas veces se repite la letra A
		 *Decir tambien que nos diga cuantas voales tiene*/
		
		/*Esta es otra opcion mas simplifica con el switch case*/
		
		int repetida=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce texto");
		String texto=sc.nextLine();
		int contador=0;
		for(int i=0;i<texto.length();i++) {
			switch(texto.charAt(i)) {
				case 'a','e','i','o','u':
					contador=contador+1;
			}
		}
		System.out.println(contador);
	}
}
		// CON ESTE CODIGO SE ME EJECUTA PERO SIEMPRE ME ENSEÑA 2
		/*Scanner sc=new Scanner(System.in);
		System.out.println("introduce texto");
		String text=sc.nextLine();
		text=text.toLowerCase(); //convertimos todo a minuscula
		
		for(int i=0;i<text.length();i++) {//recoremos el texto
			if(text.charAt(i)=='a') {//preguntamos si i que es el recorido es 'a'
						
				repetida++;//sumamos 1 cada vez que encontramos una letra 'a'
			
			}else if(text.charAt(i)=='e') {
				
				repetida++;
				break;
				
			}else if(text.charAt(i)=='i') {
				
				repetida++;
				break;
	
			
			}else if(text.charAt(i)=='o') {
				
				repetida++;
				break;
			
			}else if(text.charAt(i)=='u');
			 
			repetida++;
			break;
			
		}
		System.out.println(repetida);*/
