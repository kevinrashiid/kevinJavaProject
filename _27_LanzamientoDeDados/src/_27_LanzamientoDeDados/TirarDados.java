package _27_LanzamientoDeDados;

public class TirarDados {

	public static void main(String[] args) {
		/*un dado tiene en 1 y 6 nuemeros
		que nos de un numero random entre 1 y 6
		tirar el dado 10000 veces y 
		mostrar el % optenido de cada numero*/
		int [] contador= new int[6];//contadores de tiradas de cada numero
		for(int i=1;i<=10000;i++) {
			int dado=(int)(Math.random()*6+1);//el segundo int te convierte
											//el numero que te de el random 
											//entre uno y 6
			/*se lanza el dado y se incrementa
			el cantador que corresponde al numero obtenido*/
			
			contador[dado-1]++;
			
			/*Esta es una forma de hacerlo pero MENOS eficiente*/
			
			/*switch(dado) {
			case 1:
				
				contador[0]++;
				
				break;
			case 2:
				contador[1]++;
				
				break;
			case 3:
				contador[2]++;
				break;
			case 4:
				contador[3]++;
				
				break;
			case 5:
				contador[4]++;
				
				break;
			case 6:
				contador[5]++;
				
				break;
			}*/
		}//Finalizado el for Sacamos el % de cada uno
		
		for(int i=0;i<contador.length;i++) {/*recoremos el array de contador*/
			System.out.println(contador[i]*100/1000.0);
			/*Imprimimos el porcentaje de cada posicion del array*/
		}
		
	}
}
