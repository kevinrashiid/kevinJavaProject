package view;

import java.util.Scanner;

import service.GestionNotasService;

public class PrincipalNotasMain {

					//INCOMPLETO//	
	
	public static void main(String[] args) {
		
		//creamos un objeto de la clase que contiene las operaciones
		//de logica de programacion 
		GestionNotasService gnotas=new GestionNotasService();
		Scanner sc=new Scanner (System.in);
		int op;//opcion elegida
		do{
		    System.out.println("). Agregar nota");
		    System.out.println("2. - Ver nota media");
		    System.out.println("3.- Ver aprobados");
		    System.out.println("4.- Salir");

		}while();
			
		
	} 
}

