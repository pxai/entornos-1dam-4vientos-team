import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 
 */

/**
 * @author pello_altadill, Benjamín, Guerrero
 *
 */
public class EntradaSalida {
	
	private BufferedReader lector =new BufferedReader(new InputStreamReader(System.in));
	
	/**
	 * EntradaSalida
	 * Constructor por defecto
	 */
	public EntradaSalida () {
		
	}
	
	/**
	 * leerEntero 
	 * @param mensaje a moostrar
	 * @return el valor entero que hemos leido
	 */
	public int leerEntero (String mensaje) {
		int resultado = 0;
		String lineaLeida = "";
		
		try {
			System.out.println(mensaje);
			lineaLeida = lector.readLine(); 
			resultado = Integer.parseInt(lineaLeida);
		} catch (Exception e) {
			System.err.println("Error al leer dato, devuelvo 0");
			resultado = 0;
		}
		
		return resultado;
	}
	/**
	 * lee decimal introducido y devuelve decimal
	 * @param mensaje
	 * @return float
	 */
	public float leerDecimal (String mensaje) {
		float resultado = 0;
		String lineaLeida = "";
		
		try {
			System.out.println(mensaje);
			lineaLeida = lector.readLine(); 
			resultado = Float.parseFloat(lineaLeida);
		} catch (Exception e) {
			System.err.println("Error al leer dato, devuelvo 0");
			resultado = 0;
		}
		
		return resultado;
	}
	/**
	 * leercadena
	 * @param mensaje
	 * @return String
	 */
	public String leerCadena (String mensaje) {
		String lineaLeida = "";
		
		try {
			System.out.println(mensaje);
			lineaLeida = lector.readLine(); 
			
		} catch (Exception e) {
			System.err.println("Error al leer dato, devuelvo 0");
		}
		
		return lineaLeida;
	}
	
	/**
	 * leerFecha
	 * @param mensaje
	 * @return Date
	 */
	public Date leerFecha (String mensaje) {
		String lineaLeida = "";
		Date fecha = new Date();
		SimpleDateFormat formatoDeFecha = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			System.out.println(mensaje);
			lineaLeida = lector.readLine(); 
			fecha = formatoDeFecha.parse(lineaLeida);
			
		} catch (Exception e) {
			System.err.println("Error al leer dato, devuelvo 0");
		}
		
		return fecha;
	}
	

}
