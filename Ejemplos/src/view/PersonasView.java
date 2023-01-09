
package view;

import java.util.ArrayList;

import model.Persona;

public class PersonasView {

	public static void main(String[] args) {
		
		Persona p=new Persona("Jose","Jose@gmail.es",623-234-422);
		System.out.println("Te llamas "+p.getNombre());
		
		//Almacenado en un Array
		Persona[] pers=new Persona[5];
		pers[0]=p;
		//Almacenado en una coleccione
		ArrayList<Persona> personas=new ArrayList<>();
		personas.add(p);
		

	
		
	}
}