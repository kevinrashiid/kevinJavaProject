package view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.gestionPedidosModel;
import service.gestionPedidosService;

public class PedidosView {
	
	static gestionPedidosService gestionPedidos= new gestionPedidosService();
	
	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		int opcion;
		do {
			mostrarMenu();
			opcion=sc.nextInt();//lee la opción elegida
			switch(opcion) { //evaluamos
			case 1:
				meterPedido();
				break;
			case 2:
				elMasReciente();
				break;
			case 3:
				datosPedidos();

			case 4:
				System.out.println("---Adios---");
			}
		}while(opcion!=4);
	}
	static void mostrarMenu() {
		System.out.println("1.- Nuevo pedido");
		System.out.println("2.- Pedido más reciente");
		System.out.println("3.- Datos de todos los pedidos");
		System.out.println("4.-	Salir");
	}
	static void meterPedido() throws ParseException {
		
		SimpleDateFormat formato= new SimpleDateFormat("dd/MM/yyyy");//para transformar de texto recibido a fecha 
		Scanner sc=new Scanner(System.in);
		String  producto;
		Date fechaDePedido;
		double precio;
		System.out.println("Introduce el producto: ");
		producto=sc.nextLine();
		System.out.println("Introduce la fecha dia/mes/año ");
		fechaDePedido=formato.parse(sc.nextLine());
		System.out.println("Introduce precio: ");
		precio=Double.parseDouble(sc.nextLine());
		
	}
	static void elMasReciente() {
		Pedido pedido=gestionPedidosService.pedidoMasReciente();
		System.out.println("Producto: "+pedido.getProducto());
		System.out.println("Fecha: "+pedido.getFechaDeProducto());
		System.out.println("Precio: "+pedido.getPrecio());
		
		
		
	}
	static void datosPedidos() {
		Pedido[] todo=gestionPedidosService.todos();
		for(gestionPedidosModel p:todos) {
			System.out.println("Producto: "+p.getProducto());
			System.out.println("Fecha: "+p.getFechaDePedido());
			System.out.println("Precio: "+p.getPrecio());
		}
		
	}
}
