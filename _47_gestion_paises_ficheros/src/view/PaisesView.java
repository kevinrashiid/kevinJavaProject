package view;
/*
1.- Añadir ciudad
2.- Ciudad más poblada
3.- Ciudades por pais
4.- Salir

Cada ciudad contiene nombre, habitantes y pais
-La opción 3, te pide el nombre del pais y te muestra 
los datos de todas la ciudades que pertenecen a ese pais*/

import java.util.InputMismatchException;
import java.util.Scanner;

import services.PaisesServices;

public class PaisesView {

	static PaisesServices paises=new PaisesServices();

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int opcion;

		do {
			mostrarMenu();
			try {
				opcion=Integer.parseInt(sc.nextLine());//conviertes lo que te meten por teclado(en este caso numeros) a nextLine
				switch(opcion) { //evaluamos
				case 1:
					meterCiudad();//creamos menu para mostrar menu
					break;
				case 2:
					ciudadMasPoblada();//metodo para buscar el mas reciente
					break;
				case 3:
					ciudadPorPais();//metodo para mostrar todos los datos 
					break;
				case 4:
					System.out.println("---Adios---");
				}
			}
			catch(InputMismatchException ex) {
				System.out.println("Hey solo pon numeros");
				opcion=0;
			}
		}while(opcion!=4);
	}
	static void mostrarMenu() {
		
	}
}
