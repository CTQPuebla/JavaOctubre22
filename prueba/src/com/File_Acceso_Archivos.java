package com;
import java.io.*;

public class File_Acceso_Archivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*File archivo = new File("bin");
		
		System.out.println(archivo.getAbsolutePath());
		System.out.println(archivo.exists());*/
		
		
		File ruta = new File ("D:\\Escritorio\\GIT\\JavaOctubre22");
		
		System.out.println(ruta.getAbsolutePath());
		
		String[] nombres_archivos = ruta.list();
		
		for (int i = 0; i < nombres_archivos.length; i++) {
			
			System.out.println(nombres_archivos[i]);
			
		}
		

	}

}
