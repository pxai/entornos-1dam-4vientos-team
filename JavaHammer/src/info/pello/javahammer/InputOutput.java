package info.pello.javahammer;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;



/**
 * Class to deal with console I/O
 * @author pello_altadill, Benjamín, Guerrero
 *
 */
public class InputOutput {
	
	private BufferedReader lector =new BufferedReader(new InputStreamReader(System.in));
	
	/**
	 * InputOutput
	 * Constructor por defecto
	 */
	public InputOutput () {
		
	}
	
	/**
	 * msg
	 * displays msg
	 */
	public void msg(String msg) {
		System.out.println(msg);
	}
	
	/**
	 * readInt 
	 * @param msg to show
	 * @return readed value
	 */
	public int readInt (String msg) {
		int result = 0;
		boolean noCorrectData = true;
		String readedLine = "";
		do {
			try {
				System.out.println(msg);
				readedLine = lector.readLine(); 
				result = Integer.parseInt(readedLine);
				noCorrectData = false;
			} catch (Exception e) {
				System.err.println("Incorrect number format");
				noCorrectData = true;
			}
			
		} while(noCorrectData);
		
		return result;
	}
	
	/**
	 * readIntBounds
	 * reads an integer within bounds
	 * @param msg to show
	 * @return readed value
	 */
	public int readIntBounds (String msg, int min, int max) {
		int result = 0;
		boolean noCorrectData = true;
		String readedLine = "";
		do {
			try {
				System.out.println(msg);
				readedLine = lector.readLine(); 
				result = Integer.parseInt(readedLine);
				if (result >= min && result <= max) { noCorrectData = false; }
				else { System.out.println("Must be between " + min + " and " + max);}
			} catch (Exception e) {
				System.err.println("Incorrect number format");
				noCorrectData = true;
			}
			
		} while(noCorrectData);
		
		return result;
	}
	
	/**
	 * readDecimal 
	 * @param msg to show
	 * @return readed value
	 */
	public float readDecimal (String msg) {
		float result = 0;
		boolean noCorrectData = true;
		String readedLine = "";
		do {
			try {
				System.out.println(msg);
				readedLine = lector.readLine(); 
				result = Float.parseFloat(readedLine);
				noCorrectData = false;
			} catch (Exception e) {
				System.err.println("Incorrect number format");
				noCorrectData = true;
			}
			
		} while(noCorrectData);
		
		return result;
	}
	
	/**
	 * read
	 * @param mensaje
	 * @return String
	 */
	public String read (String msg) {
		String lineaLeida = "";
		
		try {
			System.out.println(msg);
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
	public Date readDate (String msg) {
		String lineaLeida = "";
		Date fecha = new Date();
		SimpleDateFormat formatoDeFecha = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			System.out.println(msg);
			lineaLeida = lector.readLine(); 
			fecha = formatoDeFecha.parse(lineaLeida);
			
		} catch (Exception e) {
			System.err.println("Error al leer dato, devuelvo 0");
		}
		
		return fecha;
	}
	

}