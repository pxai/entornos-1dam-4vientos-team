package org.cuatrovientos.JuMaBUS;
import java.util.Scanner;
import java.util.Vector;


/**
 * Gestiona un autobus y los pasajeros que van en él.
 * @author Programador Bajeril
 *
 */
public class jumabus {

	public static void main (String args[]) {
		String op = "";
		String dat = "";
		Scanner l = new Scanner(System.in);
		Vector<String> pas = new Vector<String>();
		
		do {
			System.out.println("Elige una opción: ");
			System.out.println("1. Introducir pasajero");
			System.out.println("2. Eliminar pasajero");
			System.out.println("3. Ver pasajeros");
			System.out.println("4. Salir");
			op = l.nextLine();
			
			switch (op) {
				case "1":	
						System.out.println("Introduzca nombre");
						dat = l.nextLine();
						pas.add(dat);
						break;
				case "2":
							System.out.println("Introduzca asiento");
							dat = l.nextLine();
							int tmp = Integer.parseInt(dat);
							if (pas.size()>0 && (tmp>=0 && tmp<pas.size())) {
								pas.remove(tmp);
							} else {
								System.out.println("No se puede eliminar");
							}
						break;
				case "3":	
						System.out.println("Listado de pasajeros");
						for (int i=0;i<pas.size();i++)
							System.out.println(i + ".- " + pas.get(i));
						break;
				case "4":	
						System.out.println("Ok, gracias por utilizar este programa");
						break;
				default:
						System.out.println("Opción incorrecta");
						break;
			}
		} while (!op.equals("4"));
	}
}
