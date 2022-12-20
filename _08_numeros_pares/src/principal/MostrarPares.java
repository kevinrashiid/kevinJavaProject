package principal;

public class MostrarPares {

	public static void main(String[] args) {
		//hacer un programa que muestre los numeros pares entre 1 y 10
		
		for(int k=1;k<=10;k++) { //Recoremos del 1 al 10 con el indice K 
			if(k%2==0) { //Preguntamos que k/2 el resto da 0 es decir es par
				System.out.println(k);//imprimimos K
			}
		}	
	}
}


