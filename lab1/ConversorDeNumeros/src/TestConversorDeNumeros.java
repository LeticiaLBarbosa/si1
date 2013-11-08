import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestConversorDeNumeros {
	Conversor c;
	String[] extenso = { "zero", "um", "dois", "tres", "quatro", "cinco",
			"seis", "sete", "oito", "nove", "dez", "onze", "doze", "treze",
			"catorze", "quinze", "dezesseis", "dezessete", "dezoito",
			"dezenove", "vinte", "trinta", "quarenta", "cinquenta", "sessenta",
			"setenta", "oitenta", "noventa", "cem", "duzentos", "trezentos",
			"quatrocentos", "quinhentos", "seiscentos", "setecentos",
			"oitocentos", "novecentos", "mil" };
	String[] unidades = { "zero","um", "dois", "tres", "quatro", "cinco",
			"seis", "sete", "oito", "nove"};
	String[] dezenas = {"dez", "vinte", "trinta", "quarenta", "cinquenta",
			"sessenta", "setenta", "oitenta", "noventa" };

	@Before
	public void setUP() {
		c = new Conversor();
	}

	@Test
	public void testaConverterDeZeroAdez() throws Exception {
		for (int numero = 0; numero < 11; numero++) {
			assertEquals(extenso[numero],
					c.converteParaExtenso(Integer.toString(numero)));
		}
	}

	@Test
	public void testaConverterComUmaPalavra() throws Exception {

		for (int i = 0; i < 21; i++) {
			assertEquals(extenso[i],
					c.converteParaExtenso(Integer.toString(i)));
		}
		int contador = 30;
		for (int i = 21; i < 28; i++) {
			assertEquals(extenso[i],
					c.converteParaExtenso(Integer.toString(contador)));
			contador += 10;
		}
		assertEquals("cem", c.converteParaExtenso("100"));
		contador = 200;
		for (int i = 29; i < 38; i++) {
			assertEquals(extenso[i],
					c.converteParaExtenso(Integer.toString(contador)));
			contador += 100;
		}
	}

	@Test
	public void testaEntradaVazia() {
		try {
			c.converteParaExtenso("            ");
			fail();
		} catch (Exception e) {
			assertEquals(e.getMessage(), "Entrada vazia");
		}
	}

	@Test
	public void testaEntradaInvalida() {
		try {
			c.converteParaExtenso("ola");
			fail();
		} catch (Exception e) {
			assertEquals(e.getMessage(), "Entrada invalida");
		}
	}

	@Test
	public void testaDe21a99() throws Exception {
		for (int i = 1; i < dezenas.length; i++) {
			for (int j = 1; j < unidades.length; j++) {
				assertEquals(dezenas[i] + " e " + unidades[j],
						c.converteParaExtenso(((1+i)*10)+j+""));
			}
		}
	}
	
	@Test
	public void testaDe101a999() throws Exception{
		assertEquals("cento e um", c.converteParaExtenso("101"));
		assertEquals("trezentos e noventa e tres", c.converteParaExtenso("393"));
		assertEquals("quinhentos e sete", c.converteParaExtenso("507"));
		assertEquals("setecentos e vinte e dois", c.converteParaExtenso("722"));
		assertEquals("novecentos e dois", c.converteParaExtenso("902"));
		assertEquals("novecentos e noventa e nove", c.converteParaExtenso("999"));
	}
	
	@Test
	public void testaDe1001a1099() throws Exception{
		assertEquals("mil e um", c.converteParaExtenso("1001"));
		assertEquals("mil e trinta e cinco", c.converteParaExtenso("1035"));
		assertEquals("mil e setenta", c.converteParaExtenso("1070"));
		assertEquals("mil e noventa e nove", c.converteParaExtenso("1099"));
	}

}
