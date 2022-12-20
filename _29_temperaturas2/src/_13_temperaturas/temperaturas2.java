package _13_temperaturas;



public class temperaturas2 {

	public static void main(String[] args) {

		//double []temps= {23.7,11.3,18.4,30.1,28.5,16.2};
		//En este ejercio crear un array de enteros
		String valores="23.7,11.3,18.4,30.1,28.5,16.2";//texto que contiene numeros
		
		String[] datos=valores.split(",");//transformar texto en array de textos
		double[] temps=new double[datos.length];//creamos la varible con el tamaño que tiene datos
		for(int i=0;i<datos.length;i++) {//RECOREMOS EL ARRAY
			
			 temps[i]=Double.parseDouble(datos[i]);//llevar los textos con formato numerico  aun array de numeros
		
		}
		
		
		
		//Cuantas ciudades tienen una temperatura superior a la media?
		
		//1.calcular la temperautura media
		double media=0;
		for(int i=0;i<temps.length;i++) {
			media=media+temps[i];
		
			//2.contar cuantas ciudades tienen una temperatura supeior a la media 
	
		}
		media=media/temps.length;
		System.out.println(media);
		int contador=0;
		for(int i=0;i<temps.length;i++) {
			if(temps[i]>media) {
				contador=contador+1;//incrementar contador mas sencillo contador++;
			}
		}
		System.out.println(contador);
	}
}