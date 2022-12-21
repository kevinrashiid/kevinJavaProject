package service;
//version con errores gestion de pedidos

import java.util.ArrayList;
import java.util.Date;

import model.gestionPedidosModel;

public class gestionPedidosService {
	
	ArrayList<gestionPedidosModel> pedidos=new ArrayList<>();
	public void	agregarPedido(String producto, Date fechaDePedido, double precio) {
		pedidos.add(new Pedido(producto,fechaDePedido,precio));
	}
	public  gestionPedidosModel pedidoMasReciente() {
		Date f=new Date(0);
		gestionPedidosModel pedido=null;
		
		for(gestionPedidosModel c:pedidos) {
			if(c.getFechaDePedido().after(f)) {//si encontramos una fecha mas reciente
				f=c.getFechaDePedido();
				pedido=c;
			}
		}
		return pedido;
	}
	public Pedido[] mostrarDatosPedidos() {
		Pedido[] resultado=new Pedido[pedidos.size()];
		for(int i=0;i<pedidos.size();i++) {
			resultado[i]=pedidos.get(i);
		}
		return resultado;
	}
	
}