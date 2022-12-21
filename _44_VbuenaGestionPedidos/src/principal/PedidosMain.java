package principal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.Pedidos;
import service.PedidosService;

public class PedidosMain {


	//ENUNCIADO: Programa para gestión de pedidos

	//1.- Nuevo pedido
	//2.- Pedido más reciente
	//3.- Datos de todos los pedidos
	//4.- Salir

	//Un pedido se caracteriza por: producto, fecha de pedido, total
	static PedidosService pedidosService=new PedidosService();
	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		int opcion;
		do {
			mostrarMenu();
			opcion=sc.nextInt();//lee la opción elegida
			switch(opcion) { //evaluamos
			case 1:
				nuevoPedido();
				break;
			case 2:
				buscarMasReciente();
				break;
			case 3:
				mostrarTodos();
				break;
			case 4:
				System.out.println("---Adios---");
			}
		}while(opcion!=4);
	}
	static void mostrarMenu() {
		System.out.println("1.- Nuevo pedido");
		System.out.println("2.- Pedido más reciente");
		System.out.println("3.- Datos de todos los pedidos");
		System.out.println("4.- Salir");

	}
	static void nuevoPedido() throws ParseException {
		Scanner sc=new Scanner(System.in);
		SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");
		//para el parseado de fechas
		String producto;
		Date fecha;
		int total;
		System.out.println("Introduce producto");
		producto=sc.nextLine();
		System.out.println("Introduce fecha (día/mes/año");
		fecha=format.parse(sc.nextLine());
		System.out.println("Introduce total");
		total=Integer.parseInt(sc.nextLine());

		pedidosService.nuevoPedido(producto, fecha, total);
	}
	static void buscarMasReciente() {
		Pedidos pedidos=pedidosService.masReciente();
		System.out.println("Producto: "+pedidos.getProducto());
		System.out.println("Fecha: "+pedidos.getFecha());
		System.out.println("Total: "+pedidos.getTotal());
	}

	static void mostrarTodos() {
		Pedidos[] todos=pedidosService.todos();
		
		SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");
		
		for(Pedidos p:todos) {
			System.out.println("Producto: "+p.getProducto());
			System.out.println("Fecha: "+format.format(p.getFecha()));
			System.out.println("Total: "+p.getTotal());
		}
	}

}

