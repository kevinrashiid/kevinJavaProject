
package Service;
//realizar un programa  para la gestion de notas, 
	//al iniciarse el programa se presentara en pantalla el siguiente menu.
	//1.-Grabar nota
	//2.-Calcula media
	//3.-Numeros de Aprobados
	//4.-Notas extremas
	//5.-Mostrar todas
	//6.-Eliminar suspensos
	//7.-Salir

import java.util.ArrayList;

public class NotasService {
	
	ArrayList <Double> notas= new ArrayList<>();
	
	//creamos metodos 
	public void guardarNota(double nota) {
		
		notas.add(nota);
		
	}
	
	public double media(){
		double media=0;
		for(int i=0;i<notas.size();i++) {
			media=media+notas.get(i);
		}
		media=media+notas.size();
		return media;
	}
	
	public int aprobados(){
		int aprobados=0; 
		for(int i=0;i<notas.size();i++) {
			if(notas.get(i)>=5) {
				aprobados++;
			}
		}
		return aprobados;
	}
	
	public double notaMax() {
		double notamaxima=notas.get(0);
		for(int i=0;i<notas.size();i++) {
			notamaxima=Math.max(notamaxima, notas.get(i));
		}
		return notamaxima;
	}
	
	public double notaMin() {
		double notaMin=notas.get(0);
		for(int i=0;i<notas.size();i++) {
			notaMin=Math.min(notaMin, notas.get(i));
		}
		return notaMin;	
		
	}
	
	public double[] notas() {//Forma para convertir un ArrayList a un Array 

		double [] res=new double[notas.size()];
		for(int i=0;i<notas.size();i++) {
			res[i]=notas.get(i);
		}
		return res;
		
	}
	public void  eliminar() {
		for(int i=0;i<notas.size();i++) {
			//si suspenso la borramos
			if(notas.get(i)<5) {
				notas.remove(i);//la eliminamos 
			}
		}
	}
	public void subirNotas() {//sube +1 a todas las notas menor a 9
		for(int i=0;i<notas.size();i++) {
			if(notas.get(i)<=9) {
				notas.set(i, notas.get(i)+1);
			}
		}
	}
	
}


