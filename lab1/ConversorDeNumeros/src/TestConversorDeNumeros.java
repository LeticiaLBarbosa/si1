import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class TestConversorDeNumeros {

	@Before
	public void setUP() {

	}

	@Test
	public void testaConverterDeZeroAdez() {
		Conversor c = new Conversor();

		assertEquals("zero", c.converteZeroAdez(0));
		assertEquals("um", c.converteZeroAdez(1));
		assertEquals("dois", c.converteZeroAdez(2));
		assertEquals("tres", c.converteZeroAdez(3));
		assertEquals("quatro", c.converteZeroAdez(4));
		assertEquals("cinco", c.converteZeroAdez(5));
		assertEquals("seis", c.converteZeroAdez(6));
		assertEquals("sete", c.converteZeroAdez(7));
		assertEquals("oito", c.converteZeroAdez(8));
		assertEquals("nove", c.converteZeroAdez(9));
		assertEquals("dez", c.converteZeroAdez(10));
	}

}
