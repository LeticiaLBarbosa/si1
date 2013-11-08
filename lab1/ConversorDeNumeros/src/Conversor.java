import java.util.HashMap;

public class Conversor {

	public Object converteParaExtenso(String inteiro) {
		HashMap<String, String> numeros = new HashMap<>();
		String[] extenso = { "zero", "um", "dois", "tres", "quatro", "cinco",
				"seis", "sete", "oito", "nove", "dez", "onze", "doze", "treze",
				"catorze", "quinze", "dezesseis", "dezessete", "dezoito",
				"dezenove", "vinte", "trinta", "quarenta", "cinquenta",
				"sessenta", "setenta", "oitenta", "noventa", "cem", "duzentos",
				"trezentos", "quatrocentos", "quinhentos", "seiscentos",
				"setecentos", "oitocentos", "novecentos", "mil" };

		for (int numero = 0; numero < 21; numero++) {
			numeros.put(Integer.toString(numero), extenso[numero]);
		}
		int contador = 30;
		for (int numero = 21; numero < 29; numero++) {
			numeros.put(Integer.toString(contador), extenso[numero]);
			contador += 10;
		}
		contador = 200;
		for (int numero = 29; numero < 38; numero++) {
			numeros.put(Integer.toString(contador), extenso[numero]);
			contador += 100;
		}
		return numeros.get(inteiro);
	}
}
