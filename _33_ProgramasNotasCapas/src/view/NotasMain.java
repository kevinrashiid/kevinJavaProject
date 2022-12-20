package view;

import java.util.Scanner;

import Service.NotasService;

public class NotasMain {
	static NotasService notasService=new NotasService();
	

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int opcion;
		do {
			mostrarMenu();
			opcion=sc.nextInt(); //lee la opcion elegida
			switch(opcion) {//evaluamos
			case 1:
				pedirNotas();
				break;
			case 2:
				mostrarMedia();
				break;
			case 3:
				mostrarAprobados();
				break;
			case 4:
				mostrarExtrema();
				break;
			case 5: 
				mostrarTodas();
				break;
			case 6:
				eliminarSuspensos();
				break;
			case 7:
				subirNotas();
			}
			
		}while(opcion!=8);
		
	}
	static void mostrarMenu() {
		System.out.println("1.-Grabar nota");
		System.out.println("2.-Calcula media");
		System.out.println("3.-Numeros de Aprobados");
		System.out.println("4.-Notas extremas");
		System.out.println("5.-Mostrar todas");
		System.out.println("6.-Eliminar suspensos");
		System.out.println("7.- Subir Notas");
		System.out.println("8.- Salir");
		
	}
	static void pedirNotas() {
		Scanner sc=new Scanner(System.in);
		double nota;
		System.out.println("Introduce nota");
		nota=sc.nextDouble();
		notasService.guardarNota(nota);	
	}
	static void mostrarMedia() {
		System.out.println("La media es: "+notasService.media());
	}
	static void mostrarAprobados() {
		System.out.println("Aprobados : "+notasService.aprobados());
	}
	static void mostrarExtrema() {
		System.out.println("Notas maxima: "+notasService.notaMax());
		System.out.println("Notas minima: "+notasService.notaMin());
	}
	static void mostrarTodas() {
		double [] notas=notasService.notas();
		for(int i=0;i<notas.length;i++) {
			System.out.println(notas[i]);
		}
	}
	static void eliminarSuspensos() {
		notasService.eliminar();
		
	}
	static void subirNotas() {
		notasService.subirNotas();
	}
}
