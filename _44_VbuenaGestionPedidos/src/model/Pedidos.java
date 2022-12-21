package model;

import java.util.Date;

//ENUNCIADO: Programa para gestión de pedidos

//1.- Nuevo pedido
//2.- Pedido más reciente
//3.- Datos de todos los pedidos
//4.- Salir

//Un pedido se caracteriza por: producto, fecha de pedido, total

public class Pedidos {
	private String producto;
	private Date fecha;
	private int total;
	public Pedidos(String producto, Date fecha, int total) {
		super();
		this.producto = producto;
		this.fecha = fecha;
		this.total = total;
	}
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	

}