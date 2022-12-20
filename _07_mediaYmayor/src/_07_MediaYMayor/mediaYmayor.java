package _07_MediaYMayor;

public class mediaYmayor {

	public static void main(String[] args) {
		/*Realizar un programa que, dado un array que almacena
		10 números enteros cualquiera, nos muestre la media de
		los valores almacenados y también el valor máximo.
		Realizar un programa que, dado un array que almacena
		10 números enteros cualquiera, nos muestre la media de
		los valores almacenados y también el valor máximo.*/
		
		
		int [] numeros= {2,3,4,7,1,8,5,7,5,3};
		int mayor=0; //variable int para mostrar el mayor 
		double media=0; //variable double para dar la media exacta
		for(int n:numeros) {//recoremos el array 
			media=media+n; //hacemos la suma total del contenido del array 
			if(n>mayor) {//preguntamos que si N es mayor que mayor que es 0
				mayor=numeros[n];//se asiga N a mayor y se vuelve a preguntar por el FOR
			}
		}
		/*Dividimos 45 la suma de todos los numeros del array 
		 entre 10 que es el espacio del array*/
		media=media/numeros.length;
		System.out.println("La media es "+media);
		System.out.println("El mayor es "+mayor);
	}
}
//hola kevin


