package removerDaLista;

import java.util.List;

public class RemoverDaLista {

	public void removerDaLista(List<Integer> lista, int valor) {
		if (lista.contains(valor) && lista.size() > 0) {
			for (int percorrido = 0; percorrido <= lista.size() - 1; percorrido++) {
				if (lista.get(percorrido) == valor) {
					lista.remove(percorrido);
					percorrido--;

				}
			}
		} else {
			System.out.println("Valor nao encontrado ou lista vazia");

		}
	}
}
