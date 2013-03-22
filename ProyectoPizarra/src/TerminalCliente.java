/**
 * @(#)TerminalCliente.java
 *
 * TerminalCliente
 *
 * @author Pello Altadill
 * @version 1.00 2012/2/7
 */

import java.io.*;
import java.util.Scanner;

/**
 * Programa principal de la gestión de pizarra
 * @author Pello Altadill
 *
 */
public class TerminalCliente {
    
    public static void main(String[] args) {
    	
    	GrupoAlumnos grupoAlumnos = new GrupoAlumnos();
		Scanner miConsola = new Scanner(System.in);
		int opcion = 0;
		String nombre = "";
		String expediente = "";
		String mensajeResultado = "";
		
		do {
			System.out.println("\n\n1.Introducir Alumno");
			System.out.println("2.Eliminar Alumno");
			System.out.println("3.Mostrar Alumnos");
			System.out.println("4.Sacar Promedio");
			System.out.println("5.Sacar aleatorio");
			System.out.println("6. Salir");
			System.out.print("Seleccione opción: ");
			opcion = miConsola.nextInt();
			Alumno alumno = null;
			
			switch (opcion) {
				case 1:	
						System.out.println("Introduce nombre");
						nombre = miConsola.next();
						System.out.println("Introduce expediente");
						expediente = miConsola.next();
						alumno = new Alumno(nombre, expediente);
						mensajeResultado = grupoAlumnos.insertarAlumno(alumno);
						System.out.println(mensajeResultado + "\n");
				
						break;
				case 2:	
						System.out.println("Introduce expediente");
						expediente = miConsola.next();
						mensajeResultado = grupoAlumnos.eliminarAlumno(expediente);
						System.out.println(mensajeResultado + "\n");
						break;
				case 3:			
						System.out.println("Lista de alumnos\n" + grupoAlumnos.mostrarAlumnos());
						break;
				case 4:	
						System.out.println("Media de veces que han salido:\n" + grupoAlumnos.mostrarMedia());
						break;
				case 5:	
						System.out.println("Alumno aleatorio:\n" + grupoAlumnos.sacarAleatorio());
						break;
				case 6:
						System.out.println("Gracias por usar el programa");
						break;
				default: 
						break;
			}
				
		} while (opcion != 6);
    	

    	System.out.println("(c) 2013 Instituto Cuatrovientos");
    }
}
