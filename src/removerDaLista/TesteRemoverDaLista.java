package removerDaLista;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class TesteRemoverDaLista {

	@Test
	void testeRemovendo() {
		RemoverDaLista remover = new RemoverDaLista();
		List<Integer> lista = new ArrayList<Integer>();

		lista.add(9);
		lista.add(2);
		lista.add(9);
		lista.add(7);
		lista.add(3);
		lista.add(9);
		lista.add(59);
		lista.add(89);
		lista.add(9);

		remover.removerDaLista(lista, 9);

		assertEquals(5, lista.size());
	}

	@Test
	void testeSemRemover() {
		RemoverDaLista remover = new RemoverDaLista();
		List<Integer> lista = new ArrayList<Integer>();

		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(7);
		lista.add(3);
		lista.add(3);
		lista.add(59);
		lista.add(89);
		lista.add(3);

		remover.removerDaLista(lista, 99);

		assertEquals(9, lista.size());
	}

	@Test
	void testeRemovendoEmSequencia() {

		RemoverDaLista remover = new RemoverDaLista();
		List<Integer> lista = new ArrayList<Integer>();

		lista.add(7);
		lista.add(7);
		lista.add(7);
		lista.add(7);
		lista.add(3);
		lista.add(3);
		lista.add(59);
		lista.add(89);
		lista.add(3);

		remover.removerDaLista(lista, 7);

		assertEquals(5, lista.size());
	}

	@Test
	void TesteListaVazia() {

		RemoverDaLista remover = new RemoverDaLista();
		List<Integer> lista = new ArrayList<Integer>();

		lista.add(7);

		remover.removerDaLista(lista, 7);

		assertTrue(lista.isEmpty());
	}

}
