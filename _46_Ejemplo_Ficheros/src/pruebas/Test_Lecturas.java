package pruebas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test_Lecturas {

	public static void main(String[] args) {
		
		String ruta="c:\\ficheros\\productos.txt";
		FileReader fr=null;
		BufferedReader bf=null;
		try {
			fr=new FileReader(ruta);
			bf=new BufferedReader(fr);
			System.out.println(bf.readLine()); //primera línea
			System.out.println(bf.readLine()); //segunda línea
			String s;
			while((s=bf.readLine())!=null){//manera CLASICA DE LEER UN FICHERO //NULL al recorrer un fichero se refiere al final del fichero 
				
				System.out.println(s);
			}
		}
		catch(FileNotFoundException ex) {
			ex.printStackTrace();
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		finally {
			if(bf!=null) {
				try {
					bf.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fr!=null) {
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}		
	
	

