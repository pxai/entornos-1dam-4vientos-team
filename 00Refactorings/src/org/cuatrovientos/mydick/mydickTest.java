package org.cuatrovientos.mydick;
import static org.junit.Assert.*;

import org.junit.Test;


/**
 * @author Bad Taste 
 * test class for mydick haha, you got it?
 * you're testing mydick. It's brilliant
 */
public class mydickTest {

	@Test
	public void testGreetMethod() {
		mydick myDick = new mydick();

		String expected = "hola";
		String target = myDick.greet_method(0, 1);
		assertEquals("Testing spanish greet once", expected, target);

		expected = "hellohello";
		target = myDick.greet_method(1, 2);
		assertEquals("Testing english greet twice", expected, target);

		expected = "kaixokaixokaixokaixo";
		target = myDick.greet_method(2, 4);
		assertEquals("Testing basque greet four times", expected, target);

	}

}
