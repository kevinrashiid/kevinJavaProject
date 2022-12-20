package principal;

public class CalculosEdades {

	public static void main(String[] args) {
		
		/*Sacar la media del Array*/
		
		int[] edades= {34,29,19,22,23,18};
	
		int media=0;//creamos la variable Media
		for(int i=0;i<edades.length;i++) { //recorremos el array para saber su contenido
			media=media+edades[i]; //Sumamos todo lo que tiene EDADES en MEDIA 
		}
		media=media/edades.length;//Dividimos todo lo que guardamos en media (145) entre el tamaño que tiene edades (6)
		System.out.println("La media es "+media);//Imprimimos MEDIA 
	}

}
