package _43_PruebasFechas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class test2 {

	public static void main(String[] args) {
		LocalDate f1=LocalDate.of(2010, 1, 17);//creamos fechas
		LocalDate f2=LocalDate.of(2000, 05, 17);
		//Comparacion de fechas cual es mas antigua/reciente
		if(f1.isBefore(f2)) {
			System.out.println("La fecha mas antigua es: "+f1);
			System.out.println("La fecha mas reciente es: "+f2);
		}else {
			System.out.println("La fecha mas antigua es: "+f2);
			System.out.println("La fecha mas reciente es: "+f1);
		}
		System.out.println(f1.plusMonths(8));//mostrar f1 8 meses despues
		System.out.println(f1.plusDays(3));//mostrar f1 3 dias despues
		System.out.println(f2.plusYears(5));//mostras f2 5 años despues 
		System.out.println(f1.minusMonths(3));//mostrar f1 3 meses antes
		DateTimeFormatter format1=DateTimeFormatter.ofPattern("dd/MM/yyyy");//creamos variable con el formato con el que queremos tener la fecha 
		System.out.println(f1.format(format1));//
		String mf="20/3/2018";//dado una fecha ya sea por variable o Scanner
		LocalDate nuevaFecha=LocalDate.parse(mf,format1);//para convertir mf en dato fecha y meterlo dentro de nuevaFecha
	}
}
