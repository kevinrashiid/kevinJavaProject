package Service;

import java.util.Collection;
import java.util.HashMap;

public class AgentaContactosService {
	
HashMap<Integer,String> contactos=new HashMap<>(); //creamos un HashMap contactos 
	
	public void guardarContacto(Integer numero, String nombre) {//creamos metodo 
		//if(contactos.get(numero)==null)
		//si la clave está libre, el contacto se puede añadir
		if(!contactos.containsKey(numero)) {//esa pregunta equivale a if(contactos.containsKey(numero)==false)
			contactos.put(numero, nombre);//añadimos a HashMap la clave que es (numero) y el dato que es (nombre)
		}
		
	}
	
	public String buscarContacto(Integer numero) {//Creamos metodo para buscar numero de contacto
		String nombre= contactos.get(numero);//En nombre agregamos lo que hay en contactos con numero 
		return nombre;//devolvemos nombre 
	}
	
	public void eliminarContacto(Integer numero) {//Creamos metodo para eliminar Contacto
		contactos.remove(numero);//Eliminamos de contactos el numero 
	}
	public String[] nombres() {//Creamos metodo para mostrar nombres
		String[] res=new String[contactos.size()];//array res que contiene el tamaño de contactos
		Collection<String> col=contactos.values();//Metemos en col lo que hay en contactos 
		int i=0;//Variable 
		for(String n:col) {//recoremos col con N
			res[i]=n;//
			i++;
		}
		return res; }
}