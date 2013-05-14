import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 */

/**
 * @author pello_altadill
 *
 */
public class SaludoStringTest {

	/**
	 * Test method for {@link SaludoString#saludo()}.
	 */
	@Test
	public void testSaludo() {
		Saludo miSaludo = new SaludoString();
		assertEquals("Recibo el saludo esperado",
				miSaludo.saludo(),
				"Konnichi Wa");
	}

}
