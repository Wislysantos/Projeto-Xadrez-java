package app;

import Xadrez.PartidaXadrez;
import Xadrez.PecaXadrez;

public class UI {
		
	public static void imprimirTabuleiro(PecaXadrez[][] pecaXadrezs) {
		for (int i = 0; i < pecaXadrezs.length; i++) {
			System.out.print((8 - i) +" ");
			for(int j = 0; j < pecaXadrezs.length; j++) {
				imprimirPeca(pecaXadrezs[i][j]);
			}
			System.out.println();
		}
		System.out.println("  A B C D E F G H");
	}
	
	private static void imprimirPeca(PecaXadrez peca) {//criei este m�todo para imprimir uma �nica pe�a
		if(peca == null) {//este peca for igual null ent�o n�o tinha nesta posi��o do tabuleiro 
			System.out.println("-");
		}else {
			System.out.println(peca);
		}
		System.out.println(" ");
	}

}
