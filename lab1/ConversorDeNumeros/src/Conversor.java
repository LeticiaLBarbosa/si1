import java.util.HashMap;

public class Conversor {

	public Object converteParaExtenso(String inteiro) {
		HashMap<String, String> numeros = new HashMap<>();
		String[] extenso = { "zero", "um", "dois", "tres", "quatro", "cinco",
				"seis", "sete", "oito", "nove", "dez" };

		for (int numero = 0; numero < extenso.length; numero++) {
			numeros.put(Integer.toString(numero), extenso[numero]);
		}
		return numeros.get(inteiro);
	}

}
