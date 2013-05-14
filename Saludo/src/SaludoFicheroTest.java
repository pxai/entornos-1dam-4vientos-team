import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 */

/**
 * @author pello_altadill
 *
 */
public class SaludoFicheroTest {

	/**
	 * Test method for {@link SaludoFichero#saludo()}.
	 */
	@Test
	public void testSaludo() {
		Saludo miSaludo = new SaludoFichero();
		assertEquals("Recibo el saludo esperado",miSaludo.saludo(),"Esto es un prueba");

	}

}
