package _12_contar_mayores_array;

public class contarmayores {

	public static void main(String[] args) {

		int [] numeros= {16,8,15,21,26};
		int dato=15;
		int contador=0;
		//contar cuantos numeros hay en el array que sean mayores que dato
		
		for(int n:numeros) { 	//Recorremos el array con for each
			if(numeros[n]>dato) {//al recorrer el array decimos si los del array son mayores que la VARIABLE dato
				contador++;//incrementamos +1 cada ves que se cumpla el if
			}
			
		}
		System.out.println(contador);//imprimimos el numero que tiene contador 
	}

}
