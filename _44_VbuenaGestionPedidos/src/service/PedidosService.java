package service;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import model.Pedidos;
/*ENUNCIADO: Programa para gestión de pedidos
Version corregida

1.- Nuevo pedido
2.- Pedido más reciente
3.- Datos de todos los pedidos
4.- Salir

Un pedido se caracteriza por: producto, fecha de pedido, total*/
public class PedidosService {
	
	String ruta="c:\\ficheros\\pedidos.txt";
	
	public void nuevoPedido (String producto, Date fecha, int total) {//metodo para agregar pedido
		SimpleDateFormat fm=new SimpleDateFormat("dd-MM-yyyy");//creamos el formato de fecha que vamos a usar
		String datos=producto+"|"+fm.format(fecha) +"|"+total;//dentro del documento .txt 
		try(FileOutputStream fos=new FileOutputStream(ruta,true);
			PrintStream out=new PrintStream(fos);){
			out.println(datos);
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	public Pedidos masReciente() { //metodo para mostrar el producto mas reciente
		Pedidos pedido=null;
		Date fechaReciente=new Date(0);
		SimpleDateFormat fm = new SimpleDateFormat ("dd-MM-yyyy");
		try(FileReader fr=new FileReader(ruta);
			BufferedReader bf=new BufferedReader(fr)){
			String fila;
			//recorremos el fichero linea a línea, y convertimos cada línea en un Pedido
			//después, comprobamos si ese pedido es posterior al auxiliar
			while((fila=bf.readLine())!=null) {
				//convierto line a array
				String[] linea=fila.split("[|]");
				//creo objeto pedido con datos de la línea
				Pedidos p=new Pedido(linea[0],fm.parse(linea[1]),Double.parseDouble(linea[2]));
				//comprobamos si se trata de un pedido más reciente
				if(p.getFecha().after(fechaReciente)) {
					//si es así, actualizo variables
					fechaReciente=p.getFecha();
					pedido=p;
				}
			}			
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		catch(ParseException ex) {
			ex.printStackTrace();
		}
		return pedido; //devuelvo pedido encontrado
	}		
	public ArrayList<Pedidos> todos() {//metodo para mostrar los datos de todos los pedidos
		ArrayList<Pedidos> resultado=new ArrayList<>();
		SimpleDateFormat fm = new SimpleDateFormat ("dd-MM-yyyy");
		try(FileReader fr=new FileReader(ruta);
			BufferedReader bf=new BufferedReader(fr)){
			String fila;
			//recorremos el fichero linea a línea, y convertimos cada línea en un Pedido
			//después, comprobamos si ese pedido es posterior al auxiliar
			while((fila=bf.readLine())!=null) {
				//convierto line a array
				String[] linea=fila.split("[|]");
				//creo objeto pedido con datos de la línea
				Pedidos p=new Pedido(linea[0],fm.parse(linea[1]),Double.parseDouble(linea[2]));
				//añadimos pedido a la lista de resultados
				resultado.add(p);
			}			
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		catch(ParseException ex) {
			ex.printStackTrace();
		}
		return resultado;
	}
}