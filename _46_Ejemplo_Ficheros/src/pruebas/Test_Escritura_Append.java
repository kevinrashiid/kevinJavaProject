package pruebas;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Test_Escritura_Append {

	public static void main(String[] args) {
		//todo esto para sobreEscribir lo dado/recibido
		String ruta="c:\\ficheros\\productos.txt";//creamos el .txt en esa dirrecion
		PrintStream out=null;
		FileOutputStream fos=null;
		try {
		fos=new FileOutputStream(ruta,true);//Para sobreEscribir en el txt es decir no eliminas/sustituyes ya lo escrito
		out=new PrintStream(fos);
		out.println("leche");
		out.println("arroz");
		out.println("azucar");
		out.close();
		}
		catch(FileNotFoundException ex) {
			ex.printStackTrace();
		}
		finally {
			if(out!=null) {
				out.close();
			}
			if(fos!=null) {
				try {
					fos.close();
				}
				catch(IOException ex) {
					ex.printStackTrace();
					
				}
			}
		}
	}
}
