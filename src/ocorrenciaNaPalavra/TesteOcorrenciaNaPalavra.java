package ocorrenciaNaPalavra;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TesteOcorrenciaNaPalavra {

	@Test
	public void testeOcorrencia() {

		OcorrenciaNaPalavra palavra = new OcorrenciaNaPalavra();

		assertEquals(2, palavra.ocorrencia("Programador Programacao", "ama"));

	}

	@Test
	public void testeOcorrenciaSeguida() {
		OcorrenciaNaPalavra palavra = new OcorrenciaNaPalavra();

		assertEquals(2, palavra.ocorrencia("testeteste", "teste"));

	}

	@Test
	public void testeSemOcorrencia() {
		OcorrenciaNaPalavra palavra = new OcorrenciaNaPalavra();
		assertEquals(0, palavra.ocorrencia("testando", "banana"));

	}

}
