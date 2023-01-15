package _13_temperaturas;

public class TemperaturasModular {

	public static void main(String[] args) {
		
String valores="23.7,11.3,18.4,30.1,28.5,16.2";//texto que contiene numeros
		
		String[] datos=valores.split(",");//transformar texto en array de textos
		double[] temps=new double[datos.length];//creamos la varible con el tamaño que tiene datos
		for(int i=0;i<datos.length;i++) {//RECOREMOS EL ARRAY
			
			 temps[i]=Double.parseDouble(datos[i]);//llevar los textos con formato numerico  aun array de numeros
		}	
		System.out.println("Temperaturas superiores a la media: "+calcularSuperiores(calcularMedia(temps),temps));
		
	}
	static double calcularMedia(double[] temperaturas ) {
		double media=0;
		for(int i=0;i<temperaturas.length;i++) {
			media=media+temperaturas[i];
		}
		media=media/temperaturas.length;
		return media;
		}
	static int calcularSuperiores(double media, double[] temperaturas) {
		int contador=0;
		for(int i=0;i<temperaturas.length;i++) {
			if(temperaturas[i]>media) {
				contador++;
			}
			
		}
		return contador;

	}
}

