package services;

import java.util.ArrayList;

import src.model.Ciudad;

public class PaisesServices {
	ArrayList <Ciudad> ciudades=new ArrayList<>();
	public void añadirCiudad(String nombre, int habitantes, String pais) {//metodo para añadir Ciudad
		ciudades.add(new Ciudad(nombre,habitantes,pais));
	}
	public Ciudad  ciudadMasPoblada() {//metodo para saber la ciudad mas poblada
		int citymax=0;
		Ciudad ciudad=null;//Se guarda la ciudad con mayor numero de habitantes
		//si encontramos un numero maximo de habitantes, actulizaremos la varibale citymax
		//y tambien la que guarda la ciudad con maximo de habitantes
		for(Ciudad c:ciudades) {//recoremos el ArrayList ciudades
			if(c.getHabitantes()>citymax) {
				citymax=c.getHabitantes();
				ciudad=c;
			}
		}
		return ciudad;
	}
	public ArrayList<Ciudad> cidadesPorPais(String pais) {
		ArrayList<Ciudad> aux=new ArrayList<>();
		for(Ciudad n:ciudades) {//recoremos ciudades 
			if(pais.equals(n.getPais())) {//si la ciudad es del pais buscado, la añadimos a la nueva lista
				aux.add((n));//añadimos n a AUX 
			}
		}
		return aux;
	}
}