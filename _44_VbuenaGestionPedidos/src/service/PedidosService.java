package service;

import java.util.ArrayList;

import java.util.Date;

import model.Pedidos;
//ENUNCIADO: Programa para gestión de pedidos
//Version corregida

//1.- Nuevo pedido
//2.- Pedido más reciente
//3.- Datos de todos los pedidos
//4.- Salir

//Un pedido se caracteriza por: producto, fecha de pedido, total
public class PedidosService {
	
	ArrayList<Pedidos> pedido= new ArrayList<>();
	
	public void nuevoPedido (String producto, Date fecha, int total) {//metodo para agregar pedido
		pedido.add(new Pedidos(producto,fecha,total)); //añadimos a pedido nuevo objeto Pedidos 
	}
	public Pedidos masReciente() { //metodo para mostrar el producto mas reciente
		Pedidos pedidos=null; //declaramos la variable con null/nada
		Date fechaReciente=new Date(0);//la variable con formato fecha con la posicion 0
		for(Pedidos p: pedido) { //recoremos el ArrayList 
			if(p.getFecha().after(fechaReciente)) {//Preguntamos si el valor del atributo getFecha es mas reciente que fechaReciente
				fechaReciente=p.getFecha();//añadimos a fechaReciente p.getFecha
				pedidos=p;//por donde paso p en el ArrayList lo añadimos a pedidos
			}
		}
		return pedidos; //devolvemos pedidos
	}		
	public Pedidos[] todos() {//metodo para mostrar los datos de todos los pedidos
		Pedidos[] resultado=new Pedidos[pedido.size()];//creamos la variable resultado con el tamaño que tiene pedido
		for(int i=0;i<pedido.size();i++) {//Recoremos Array que no sea mayor que pedido
			resultado[i]=pedido.get(i);//en cada posicion de resultado que se creo metemos lo que encontro al recorrer (i)
		}
		return resultado;//devolvemos resultado 
	}
}
