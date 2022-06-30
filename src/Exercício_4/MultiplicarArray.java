package Exercício_4;

import java.util.ArrayList;
import java.util.List;

public class MultiplicarArray {

	public static List<Integer> multiply(List<Integer> a1, List<Integer> a2) {
		List<Integer> finalLista = new ArrayList<>();
		boolean isMesmoTamanho = a1.size() == a2.size();
		if (!isMesmoTamanho)
		

		for (int i = 0; i < a1.size(); i++) {
			Integer novoNumero = a1.get(i) * a2.get(i);
			finalLista.add(novoNumero);
		}
		return finalLista;
	}
}
