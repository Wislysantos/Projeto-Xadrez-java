package app;

import Xadrez.PartidaXadrez;

public class Programa {

	public static void main(String[] args) {

		PartidaXadrez partidaXAdrez = new PartidaXadrez();
		UI.imprimirTabuleiro(partidaXAdrez.getPecas());
	}

}
