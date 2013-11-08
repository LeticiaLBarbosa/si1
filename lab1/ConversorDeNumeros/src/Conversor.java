import java.util.HashMap;

public class Conversor {

	public String converteParaExtenso(String inteiro) throws Exception {
		String result = "";
		if (!inteiro.trim().equals("")) {
			try {
				Integer.parseInt(inteiro);
				HashMap<String, String> numeros = new HashMap<>();
				String[] extenso = { "zero", "um", "dois", "tres", "quatro",
						"cinco", "seis", "sete", "oito", "nove", "dez", "onze",
						"doze", "treze", "catorze", "quinze", "dezesseis",
						"dezessete", "dezoito", "dezenove", "vinte", "trinta",
						"quarenta", "cinquenta", "sessenta", "setenta",
						"oitenta", "noventa", "cem", "duzentos", "trezentos",
						"quatrocentos", "quinhentos", "seiscentos",
						"setecentos", "oitocentos", "novecentos", "mil" };

				for (int i = 0; i < 21; i++) {
					numeros.put(Integer.toString(i), extenso[i]);
				}
				int contador = 30;
				for (int i = 21; i < 29; i++) {
					numeros.put(Integer.toString(contador), extenso[i]);
					contador += 10;
				}
				contador = 200;
				for (int i = 29; i < 38; i++) {
					numeros.put(Integer.toString(contador), extenso[i]);
					contador += 100;
				}

				if (numeros.get(inteiro) != null){
					result = numeros.get(inteiro);
				}
				else {
					if (inteiro.length() == 2){
						result = numeros.get(inteiro.charAt(0)+"0") + " e " + numeros.get(inteiro.charAt(1)+"");
					}
				}
			} catch (Exception e) {
				throw new Exception("Entrada invalida");
			}
		} else {
			throw new Exception("Entrada vazia");
		}
		return result;
	}
}
