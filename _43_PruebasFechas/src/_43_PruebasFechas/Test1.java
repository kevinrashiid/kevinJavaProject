package _43_PruebasFechas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {

	public static void main(String[] args) throws ParseException {
		
		Date d1=new Date();//creamos dos fechas 
		Date d2=new Date(3322223495L);
		//Comprobaciones de fechas
		if(d1.before(d2)) {//Comparas fechas .before() se traduce si d1 es mas antigua que d2 
			System.out.println("La fecha mas antigua es: "+d1);
			System.out.println("Fecha mas reciente es: "+d2);
		}else {
			System.out.println("La fecha mas antigua es: "+d2);
			System.out.println("Fecha mas reciente es: "+d1);
		}
		//Formateado de fechas .SimpleDateFormat()
		SimpleDateFormat format= new SimpleDateFormat("dd/MM/yyyy");//creamos un objeto con el formato que queremos aplicara fechas 
		System.out.println(format.format(d1));//te muestra la fecha d1 formateada 
		System.out.println(format.format(d2));//te muestra la fecha d2 formateada
		
		//Parseado de fechas 
		SimpleDateFormat formato2= new SimpleDateFormat("dd-MM-yyyy");//recibimos la fecha con este formato 
		String f="11-08-2021"; //ejemplo para cuando nos metan datos por teclado Scanner
		Date mifecha=formato2.parse(f);//transformamos lo que tenemos en f a formato date
		System.out.println(format.format(mifecha));//lo imprimos con el format en la (linea 22)
		
		

		
		
		
	}
}
