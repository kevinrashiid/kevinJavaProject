package service;
//realizar un programa que muestre el siguiuente menu:
/*1.-Agregar nota
  2.-Ver nota media
  3.-Ver aprobados
  4.-Salir
  
  Al elegir 1, se le pedira al usuario la introduccion de una nota.
  Hay que tener en cuenta que el programa almacena un maximo de 10 notas
  por lo que si ha llegado ya a ese maximo se le mostrara un mensaje de aviso*/

public class GestionNotasService {
	private double[] notas;
	private int total;

	public GestionNotasService() {
		notas = new double[10];
		total = 0;
	}
	public boolean agregarNota (double d){//metodo recibo como para un doble y nos devuelve un boolean
		//si hay espacio, la agrega, sino devuelve false
		if (total<10) {//Si es menor de 10 hay espacio para agregar nota
			notas [total]=d;
			total++;
			return true;
		}else {
			return false;

		}
	}
	public double media(){//metodo para ver nota media 
	    double m=0;
	    for (int i=0;i<total;i++) {
	        m+=notas[i];
	    }
	    return m/total;
	 }
	public int aprobados(){
	     int ap=0;
	     for (int i=0;i<total;i++){//Recoremos el Array 	
	         if(notas [i]<=5){//Preguntamos si notas[i] es mayor que 5 
	             ap++;//contador de aprobados 
	         	}
	         }
	     return ap;
	     }
	}



