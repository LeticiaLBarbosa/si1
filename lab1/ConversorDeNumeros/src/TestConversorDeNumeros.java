import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestConversorDeNumeros {
	 Conversor c;
	@Before
	public void setUP() {
		c = new Conversor();
	}

	@Test
	public void testaConverterDeZeroAdez() throws Exception{
		String[] extenso = { "zero", "um", "dois", "tres", "quatro", "cinco",
				"seis", "sete", "oito", "nove", "dez"};

		for (int numero = 0; numero < 11; numero++) {
			assertEquals(extenso[numero], c.converteParaExtenso(Integer.toString(numero)));
		}
	}
	
	@Test
	public void testaConverterComUmaPalavra() throws Exception{
		
		String[] extenso = { "zero", "um", "dois", "tres", "quatro", "cinco",
				"seis", "sete", "oito", "nove", "dez", "onze", "doze", "treze",
				"catorze", "quinze", "dezesseis", "dezessete", "dezoito",
				"dezenove", "vinte", "trinta", "quarenta", "cinquenta",
				"sessenta", "setenta", "oitenta", "noventa", "cem", "duzentos",
				"trezentos", "quatrocentos", "quinhentos", "seiscentos",
				"setecentos", "oitocentos", "novecentos", "mil" };

		for (int numero = 0; numero < 21; numero++) {
			assertEquals(extenso[numero], c.converteParaExtenso(Integer.toString(numero)));
		}
		int contador = 30;
		for (int numero = 21; numero < 29; numero++) {
			assertEquals(extenso[numero], c.converteParaExtenso(Integer.toString(contador)));
			contador += 10;
		}
		contador = 200;
		for (int numero = 29; numero < 38; numero++) {
			assertEquals(extenso[numero], c.converteParaExtenso(Integer.toString(contador)));
			contador += 100;
		}
	}
	
	@Test
	public void testaEntradaVazia(){
		try{
			c.converteParaExtenso("");
			fail();
		}catch(Exception e){
			assertEquals(e.getMessage(), "Entrada vazia");
		}
	}
	
	@Test
	public void testaEntradaInvalida(){
		try{
			System.out.println(c.converteParaExtenso("ola"));
			fail();
		}catch(Exception e){
			assertEquals(e.getMessage(), "Entrada invalida");
		}
	}

}
