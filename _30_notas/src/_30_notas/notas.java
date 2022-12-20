package _30_notas;

public class notas {

	public static void main(String[] args) {
		
		String valores="5,8,2,3,7,1,9,4";
		//¿cuantos aprobados hay?
		//Esta solucion la hice yo solo 
		int aprobados=0;
		
		
		String []notas=valores.split(",");
		int [] enteros=new int[notas.length];
		
		for(int i=0;i<notas.length;i++) {	
			enteros[i]=Integer.parseInt(notas[i]);//.parseInt para pasar de texto a entero
			if(enteros[i]>=5) {
				aprobados++;
			}
			
		}
		System.out.println(aprobados);
		
		//SOLUCION QUE DIO ANTONIO CORTA
		/*String[] datos=valores.split(",");
		for(int i=0;i<datos.length;i++) {
			if(Integer.parseInt(datos[i])>=5) {
				aprobados++;
			}
		}*/
	}
	

}
