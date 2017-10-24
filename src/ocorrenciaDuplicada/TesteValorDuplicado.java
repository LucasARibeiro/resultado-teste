package ocorrenciaDuplicada;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class TesteValorDuplicado {

	@Test
	public void testeSemRepeticao() {

		List<Integer> valores = new ArrayList<Integer>();
		ValorDuplicado valor = new ValorDuplicado();
		valores.add(1);
		valores.add(2);
		valores.add(3);
		valores.add(4);

		assertEquals(-1, valor.valorRepetido(valores));

	}

	@Test
	public void testeComRepeticao() {
		List<Integer> valores = new ArrayList<Integer>();
		ValorDuplicado valor = new ValorDuplicado();

		valores.add(1);
		valores.add(2);
		valores.add(3);
		valores.add(2);

		assertEquals(2, valor.valorRepetido(valores));

	}

	@Test
	public void testeComRepeticaoEmSequencia() {

		List<Integer> valores = new ArrayList<Integer>();
		ValorDuplicado valor = new ValorDuplicado();
		valores.add(1);
		valores.add(2);
		valores.add(3);
		valores.add(3);

		assertEquals(3, valor.valorRepetido(valores));
	}

}
