package test_comparacion_texto;

public class testcomparacion {

	public static void main(String[] args) {
		
		String s1="hola";
		String s2="hola";
		System.out.println(s1==s2.toLowerCase());
		System.out.println(s1==s2);//nunca para comparar texto
		/*Java te va decir que es true por que tiene dos variables distintas 
		apuntando al mismo String ("hola") es decir no dos hola si no uno unido a dos variables
		*/
		
		
		
		
		
	}

}
