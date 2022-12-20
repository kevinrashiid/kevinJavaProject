package _13_temperaturas;

public class temperaturas {

	public static void main(String[] args) {

		double []temps= {23.7,11.3,18.4,30.1,28.5,16.2};
		
		//Cuantas ciudades tienen una temperatura superior a la media?
		
		//1.calcular la temperautura media
		double media=0;
		for(int i=0;i<temps.length;i++) {
			media=media+temps[i];	
		}
		media=media/temps.length;
		System.out.println("La media es "+media);
		
		//2.contar cuantas ciudades tienen una temperatura supeior a la media 
		int contador=0;//creamos la variable contador
		for(int i=0;i<temps.length;i++) {//recorremos el array 
			if(temps[i]>media) {//preguntamos si temp[i] es mayor que la media 
				contador++;//incrementar contador +1 por cada vez que una temperatura sea mayor que la media 
			}
		}
		System.out.println(contador);//imprimimos contador
	}
}