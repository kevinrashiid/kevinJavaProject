package _16_numerosSumaWhile;

public class numerosSumaWhile {

	public static void main(String[] args) {

		//Cuantos numeros tenemos que sumar, 
		//empezando por uno hasta alcanzar o superar el numero 1000
		int n=0;
		int suma=0;
		while(suma<1000) {
			n++;
			suma=suma+n;
			
		}
		System.out.println(n);
	}
}
