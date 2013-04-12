import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 */

/**
 * @author DAM1
 *
 */
public class CadenaTest {

	/**
	 * Test method for {@link Cadena#longitud(java.lang.String)}.
	 */
	@Test
	public void testLongitud() {
		Cadena cadena= new Cadena();
		assertEquals(cadena.longitud("Mikel"),5);
		assertEquals(cadena.longitud(""),0);
		
	}

	/**
	 * Test method for {@link Cadena#vocales(java.lang.String)}.
	 */
	@Test
	public void testVocales() {
		Cadena cadena= new Cadena();
		assertEquals(cadena.vocales("Patata"),3);
		assertEquals(cadena.longitud(""),0);
	}

	/**
	 * Test method for {@link Cadena#invertir(java.lang.String)}.
	 */
	@Test
	public void testInvertir() {
		Cadena cadena= new Cadena();
		assertEquals(cadena.invertir("Patata"),"atataP");
		assertEquals(cadena.invertir(""),"");
	}

	/**
	 * Test method for {@link Cadena#contarLetra(java.lang.String, char)}.
	 */
	@Test
	public void testContarLetra() {
		Cadena cadena= new Cadena();
		assertEquals(cadena.contarLetra("Patata", 't'),2);
		assertEquals(cadena.contarLetra("",'a'),0);
	}

}
