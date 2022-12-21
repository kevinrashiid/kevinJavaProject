package service;
//ENUNCIADO: Programa para gestión de pedidos
//Version corregida

import java.util.ArrayList;
import java.util.Date;

import model.Pedidos;

//1.- Nuevo pedido
//2.- Pedido más reciente
//3.- Datos de todos los pedidos
//4.- Salir

//Un pedido se caracteriza por: producto, fecha de pedido, total
public class PedidosService {
	
	ArrayList<Pedidos> pedido= new ArrayList<>();
	
	public void nuevoPedido (String producto, Date fecha, int total) {
		pedido.add(new Pedidos(producto,fecha,total));
	}
	public Pedidos masReciente() { 
		Pedidos pedidos=null;
		Date fechaReciente=new Date(0);
		for(Pedidos p: pedido) {
			if(p.getFecha().after(fechaReciente)) {
				fechaReciente=p.getFecha();
				pedidos=p;
			}
		}
		return pedidos;
	}		
	public Pedidos [] todos() {
		Pedidos[] resultado=new Pedidos[pedido.size()];
		for(int i=0;i<pedido.size();i++) {
			resultado[i]=pedido.get(i);
		}
		return resultado;
	}
}
