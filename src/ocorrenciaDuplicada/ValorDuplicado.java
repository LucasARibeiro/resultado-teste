package ocorrenciaDuplicada;

import java.util.List;

public class ValorDuplicado {

	public int valorRepetido(List<Integer> lista) {

		int tamanhoLista = lista.size();
		int valorRepetido = -1;

		for (int percorrido = 0; percorrido <= tamanhoLista - 1; percorrido++) {
			for (int percorridoProximo = percorrido + 1; percorridoProximo <= tamanhoLista - 1; percorridoProximo++) {
				if (lista.get(percorrido) == lista.get(percorridoProximo)) {

					valorRepetido = lista.get(percorrido);
					return valorRepetido;
				}
			}

		}
		return valorRepetido;
	}
}
