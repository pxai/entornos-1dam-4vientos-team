import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * 
 */

/**
 * implementa el interfaz Saludo
 * en este caso leyendo una línea de un fichero
 * @author pello_altadill
 *
 */
public class SaludoFichero implements Saludo {

	@Override
	public String saludo() {
		String resultado = "";
		try {
			File fichero = new File("prueba.txt");
			BufferedReader lectorFichero = 
					new BufferedReader(new FileReader(fichero));
			
			resultado = lectorFichero.readLine();
			lectorFichero.close();
		} catch (Exception e) {
			System.err.println("APURTU DU: " + e.getMessage());
		}
		return resultado;
	}
	
}
