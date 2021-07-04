package Xadrez;

import jogoTabuleiro.Tabuleiro;

public class PartidaXadrez {
	
	private Tabuleiro tabuleiro; 
	
	public PartidaXadrez() {
		tabuleiro = new Tabuleiro(8, 8);//quem tem saber a dimensão de um tabuleiro é partida de xadrez, nesta classe que eu vou dizer que ele é 8 por 8 

	}
	
	public PecaXadrez[][] getPecas(){//este método vai ter que retorna uma matriz de peças de xadrez correspondente a PartidaXadrez
		PecaXadrez[][] mat = new PecaXadrez [tabuleiro.getLinhas()][tabuleiro.getColunas()];//eu tenho que fazer esta matriz temporária para acessar sú na camada de xadrez e não ter acesso nas camada jogo Tabuleiro 
		for(int i = 0; i < tabuleiro.getLinhas(); i++) {
			for (int j = 0; j < tabuleiro.getColunas(); j++) {
				mat[i][j] = (PecaXadrez) tabuleiro.peca(i, j);// aqui fiz o downcast para saber que é uma peça Xadrez enão como uma peça comun 
			}
		}
		return mat;
	}

}
