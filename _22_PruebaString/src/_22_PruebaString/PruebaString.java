package _22_PruebaString;

public class PruebaString {

	public static void main(String[] args) {

		String cad1="hola";
		String cad2=" adios";
		//puedes concatenar clases int con string 
		int n1=7;		
		String cad=cad1+cad2+n1;
		System.out.println(cad);
		System.out.println(cad.length()); // te muestra el numero de caracteres
		System.out.println(cad.toLowerCase()); //te muestra todo en minusculas
		System.out.println(cad.toUpperCase()); //te muestra todo en mayuscula
		System.out.println(cad.charAt(3)); //Te muestra la posicion que pongas
											//Puedes poner variables dentro
		System.out.println(cad.substring(1));
	}

}

