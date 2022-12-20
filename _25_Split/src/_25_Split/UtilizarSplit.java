package _25_Split;

public class UtilizarSplit {

	public static void main(String[] args) {
		String texto="Juan,Elena,Marta,Kevin,Mario,Lucas,Elena";
		String nombre="Elena";
		//Indicar cuantas veces aparece el nombre en el texto 
		String[] datos=texto.split(",");/*declaramos un array con lo 
										que hay dentro de texto
										y decimos el caracter separador ","*/
		int contador=0;
		for (int i=0;i<datos.length;i++) {//recoremos el texto que se asigno a DATOS
			if(nombre.equals(datos[i])) {//esto es para comparar TEXTO!
				contador++;//SUMAMOS +1 AL CONTADOR
			}
		}
		System.out.println(contador);

	}

}
