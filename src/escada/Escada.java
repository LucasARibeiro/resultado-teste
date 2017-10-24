package escada;

public class Escada {
	public int estrelaLinha = 0;
	public int estrelaColuna = 0;

	public void criarEscada(int tamanho) {
		if (tamanho >= 2) {
			for (int linha = 0; linha <= tamanho; linha++) {
				for (int coluna = 0; coluna <= tamanho; coluna++) {
					if ((linha + coluna) > tamanho) {
						System.out.print("#");
					} else {
						System.out.print(" ");
					}
				}

				System.out.println();
			}
		} else {
			System.out.println("tamanho precisa ser maior que 2 ");
		}
	}
}