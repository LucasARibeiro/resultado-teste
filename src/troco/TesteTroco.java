package troco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TesteTroco {

	@Test
	public void test() {
		Troco troco = new Troco();
		troco.calcularTroco(187);
		assertEquals(1, troco.getNota100());
		assertEquals(1, troco.getNota50());
		assertEquals(1, troco.getNota20());
		assertEquals(1, troco.getNota10());
		assertEquals(1, troco.getNota5());
		assertEquals(1, troco.getNota2());

	}

	@Test
	public void TesteTrocoNota100() {
		Troco troco = new Troco();
		troco.calcularTroco(500);
		assertEquals(5, troco.getNota100());

	}

	@Test
	public void TesteTrocoNota50() {
		Troco troco = new Troco();
		troco.calcularTroco(50);
		assertEquals(1, troco.getNota50());
	}

	@Test
	public void TestarTrocoNota20() {
		Troco troco = new Troco();
		troco.calcularTroco(20);
		assertEquals(1, troco.getNota20());

	}

	@Test
	public void TestarTrocoNota10() {
		Troco troco = new Troco();
		troco.calcularTroco(10);
		assertEquals(1, troco.getNota10());

	}

	@Test
	public void TestarTrocoNota5() {
		Troco troco = new Troco();
		troco.calcularTroco(5);
		assertEquals(1, troco.getNota5());

	}

	@Test
	public void TestarTrocoNota2() {
		Troco troco = new Troco();
		troco.calcularTroco(2);
		assertEquals(1, troco.getNota2());

	}

}
