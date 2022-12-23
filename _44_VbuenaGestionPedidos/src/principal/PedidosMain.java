package principal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
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
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int opcion;

			do {
				mostrarMenu();
				try {
				opcion=Integer.parseInt(sc.nextLine());//conviertes lo que te meten por teclado(en este caso numeros) a nextLine
				switch(opcion) { //evaluamos
				case 1:
					nuevoPedido();//creamos menu para mostrar menu
					break;
				case 2:
					buscarMasReciente();//metodo para buscar el mas reciente
					break;
				case 3:
					mostrarTodos();//metodo para mostrar todos los datos
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
	static void mostrarMenu() {//creamos todo lo que tiene que tener dentro el metodo mostrarMenu()
		System.out.println("1.- Nuevo pedido");
		System.out.println("2.- Pedido más reciente");
		System.out.println("3.- Datos de todos los pedidos");
		System.out.println("4.- Salir");
	}
	static void nuevoPedido()  {//creamos todo lo que tiene que tener dentro el metodo nuevoPedido
		Scanner sc=new Scanner(System.in);
		SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");
		//para el parseado de fechas
		String producto;
		Date fecha;
		int total;
		System.out.println("Introduce producto");
		producto=sc.nextLine();
		System.out.println("Introduce fecha (día/mes/año");
		//La siguiente linea hacemos capturar de excepciones
		try {//para cuando te metan por teclado algo que no es una fecha te avise con un mensaje
			fecha=format.parse(sc.nextLine());
			System.out.println("Introduce total");
			total=Integer.parseInt(sc.nextLine());
			pedidosService.nuevoPedido(producto, fecha, total);
		}
		catch(ParseException ex) {
			System.out.println("La fecha no es valida y el pedido no se guardara");
		}
			
		}
	static void buscarMasReciente() {//creamos todo lo que tiene que tener dentro el metodo buscarMasReciente()
		Pedidos pedidos=pedidosService.masReciente();
		System.out.println("Producto: "+pedidos.getProducto());
		System.out.println("Fecha: "+pedidos.getFecha());
		System.out.println("Total: "+pedidos.getTotal());
	}
	static void mostrarTodos() {////creamos todo lo que tiene que tener dentro el metodo mostrarTodo()
		ArrayList<Pedidos>todos=pedidosService.todos();
		
		SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");
		
		for(Pedidos p:todos) {
			System.out.println("Producto: "+p.getProducto());
			System.out.println("Fecha: "+format.format(p.getFecha()));
			System.out.println("Total: "+p.getTotal());
		}
	}
}