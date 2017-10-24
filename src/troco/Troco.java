package troco;

public class Troco {
	int nota100 = 0;
	int nota50 = 0;
	int nota20 = 0;
	int nota10 = 0;
	int nota5 = 0;
	int nota2 = 0;
	int resto = 0;

	public void calcularTroco(int troco) {
		if (troco > 0) {
			if (troco >= 100) {
				pagarComNotaDe100(troco);
			} else if (troco >= 50 && troco < 100) {
				pagarComNotaDe50(troco);
			} else if (troco >= 20 && troco < 50) {
				pagarComNotaDe20(troco);
			} else if (troco >= 10 && troco < 20) {
				pagarComNotaDe10(troco);
			} else if (troco >= 5 && troco < 10) {
				pagarComNotaDe5(troco);
			} else if (troco >= 2 && troco < 5) {
				pagarComNotaDe2(troco);
			}
		}
	}

	public int pagarComNotaDe100(int troco) {
		if (troco - 100 >= 0) {
			resto = troco - 100;
			nota100++;
			if (resto >= 100) {

				return pagarComNotaDe100(resto);
			}
		}
		return pagarComNotaDe50(resto);

	}

	private int pagarComNotaDe50(int troco) {
		if (troco - 50 >= 0) {
			resto = troco - 50;
			nota50++;
			if (resto >= 50) {
				return pagarComNotaDe50(resto);
			}
		}
		return pagarComNotaDe20(resto);
	}

	private int pagarComNotaDe20(int troco) {
		if (troco - 20 >= 0) {
			resto = troco - 20;
			nota20++;
			if (resto >= 20) {
				return pagarComNotaDe20(resto);
			}
		}
		return pagarComNotaDe10(resto);
	}

	private int pagarComNotaDe10(int troco) {
		if (troco - 10 >= 0) {
			resto = troco - 10;
			nota10++;
			if (resto >= 10) {

				return pagarComNotaDe10(resto);
			}
		}
		return pagarComNotaDe5(resto);
	}

	private int pagarComNotaDe5(int troco) {
		if (troco - 5 >= 0) {
			resto = troco - 5;
			nota5++;
			if (resto >= 5) {

				return pagarComNotaDe5(resto);
			}
		}
		return pagarComNotaDe2(resto);
	}

	private int pagarComNotaDe2(int troco) {
		if (troco - 2 >= 0) {
			resto = troco - 2;
			nota2++;
			if (resto >= 2) {
				return pagarComNotaDe2(resto);
			}
		}
		return (resto);
	}

	public int getNota100() {
		return nota100;
	}

	public int getNota50() {
		return nota50;
	}

	public int getNota20() {
		return nota20;
	}

	public int getNota10() {
		return nota10;
	}

	public int getNota5() {
		return nota5;
	}

	public int getNota2() {
		return nota2;
	}
}
