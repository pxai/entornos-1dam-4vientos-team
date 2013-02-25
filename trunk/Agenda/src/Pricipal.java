import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Date;

/**
 * 
 */

/**
 * @author pello_altadill
 *
 */
public class Pricipal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String entrada = "";
		int opcion = 0;
		Date fecha = new Date();
		String descripcion = "";
		EntradaSalida es = new EntradaSalida();
		Agenda agenda = new Agenda();
		do {
			
			System.out.println("Seleccione una opción:");
			System.out.println("1. Introducir");
			System.out.println("2. Eliminar");
			System.out.println("3. Buscar cita");
			System.out.println("4. Listar citas");
			System.out.println("5. Salir");
			
			opcion = es.leerEntero("Seleccione una opción");
			
			switch (opcion) {
			
			case  1 : // hago esto
				descripcion = es.leerCadena("Producto a introducir:");
				fecha = es.leerFecha("Introduce una cantidad");
				//cita  = new Cita(fecha, descripcion);
				//lista.introducirProducto(producto);
						break;
			case  2 : // hago esto
				break;
			case  3 : //System.out.println(lista.mostrarPendientes());

				break;
			case  4 : // hago esto
				System.out.println("Graciar por usarme");
				break;
			default :
				System.out.println("Incorrecta");
				break;
			}
			
		} while (opcion != 4);
	}

}
