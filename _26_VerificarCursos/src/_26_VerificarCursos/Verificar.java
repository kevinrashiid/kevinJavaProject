package _26_VerificarCursos;

public class Verificar {

	public static void main(String[] args) {

		String cadena="Java basico,Python,JavaEE,JasaScript,Angular 10,Big Data";
		//Cuantos cursos comienzan por Java?
		String[] verificados=cadena.split(",");
		int cont=0;
		for(int i=0;i<verificados.length;i++) {
			if(verificados[i].startsWith("Java")){
				cont++;
			}
		}
		System.out.println(cont);
		
		
		
		
	}

}
