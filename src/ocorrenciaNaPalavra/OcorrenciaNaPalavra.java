package ocorrenciaNaPalavra;

public class OcorrenciaNaPalavra {

	public int ocorrencia(String palavra, String encontrar) {

		int encontrou;
		int ultimoIndiceSubString = 0;
		int quantidade = 0;

		if (!palavra.isEmpty()) {
			do {
				encontrou = palavra.indexOf(encontrar, ultimoIndiceSubString);
				if (encontrou != -1)
					quantidade++;
				ultimoIndiceSubString = encontrou + encontrar.length();
			} while (encontrou != -1);
		}
		System.out.println(quantidade);
		return quantidade;
	}

}
