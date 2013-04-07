/**
 * No olvides añadir al proyecto la librería
 * jUnit4
 * Sobre el proycto, botón derecho del ratón, Properties,
 * Java Build Path > Libraries > add Library.
 */

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

/**
 * Clase de testeo para la clase Saludo
 * @author Pello Altadill
 *
 */
public class SaludoTest {
	Saludo saludo;

	/**
	 * testea el método saludoCastellano
	 * de la clase Saludo
	 */
	@Test
	public void testSaludoCastellano() {
		// creamos una instancia para probarla
		saludo = new Saludo();
		// llamamos al método y comprobamos que devuelve
		// lo que debe.
		assertEquals("El metodo saludoCastellano es correcto.", saludo.saludoCastellano(), "holas");
	}
	
	
}
