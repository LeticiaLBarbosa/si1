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
		
		assertEquals("zero", c.converteParaExtenso("0"));
		assertEquals("um", c.converteParaExtenso("1"));
		assertEquals("dois", c.converteParaExtenso("2"));
		assertEquals("tres", c.converteParaExtenso("3"));
		assertEquals("quatro", c.converteParaExtenso("4"));
		assertEquals("cinco", c.converteParaExtenso("5"));
		assertEquals("seis", c.converteParaExtenso("6"));
		assertEquals("sete", c.converteParaExtenso("7"));
		assertEquals("oito", c.converteParaExtenso("8"));
		assertEquals("nove", c.converteParaExtenso("9"));
		assertEquals("dez", c.converteParaExtenso("10"));
	}
	
	public void testaConverterComUmaPalavra(){
		
	}

}
