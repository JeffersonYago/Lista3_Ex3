package controller;

public class InverterController {

	public InverterController() {
		super();
	}
	public String Inverter(String palavra, int tamanho) {
		if (tamanho == 0) {
// quando tamanho chega a zero, significa que toda a String já foi percorrida
			return palavra.substring(tamanho, tamanho + 1);
		} else {
			return palavra.substring(tamanho, tamanho + 1) + Inverter(palavra, tamanho - 1);
// a posição 0 se torna a última posição, já devolvendo a String invertida
	}
}
}