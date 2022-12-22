package pruebas;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Test_Escritura {

	public static void main(String[] args) {
		String dir="c:\\ficheros\\dias.txt";//las dirreciones si tienen que poner con \\ si no da error
		//PrintStream out=null;//creo el out fuera para que se pueda utilizar fuera del try
		/*try {
		out=new PrintStream(dir);//creo el objeto
		out.println("lunes");
		out.println("martes");//lo uso 
		out.println("miercoles");
		return;//es para salir, es como break; pero mas a lo bestia 
		
		}
		catch(FileNotFoundException ex){
			ex.printStackTrace();
		}
		finally {//el bloque finally sirve para que se ejecute lo que tiene dentro SI o SI 
			if(out!=null){//que sea distinto a null(nada)para que se cierra en la siguiente linea
				out.close();//y se cierra el canal
			}
		}*/
		try(PrintStream out=new PrintStream(dir);){
			out.println("jueves");
			out.println("viernes");
			out.println("sábado");
			return;
		}
		catch(FileNotFoundException ex) {
			ex.printStackTrace();
		}
	}
	

}
