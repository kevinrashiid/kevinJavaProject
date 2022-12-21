package model;

import java.util.Date;

/*ENUNCIADO: Programa para gestión de pedidos

1.- Nuevo pedido
2.- Pedido más reciente
3.- Datos de todos los pedidos
4.- Salir

Un pedido se caracteriza por: producto, fecha de pedido, total*/
public class gestionPedidosModel {
	private String producto;
	private Date fechaDePedido;
	private double precio;
	public gestionPedidosModel(String producto, Date fechaDePedido, double precio) {
		this.producto = producto;
		this.fechaDePedido = fechaDePedido;
		this.precio = precio;
	}
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public Date getFechaDePedido() {
		return fechaDePedido;
	}
	public void setFechaDePedido(Date fechaDePedido) {
		this.fechaDePedido = fechaDePedido;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
}
