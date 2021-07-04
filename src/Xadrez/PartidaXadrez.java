package Xadrez;

import jogoTabuleiro.Tabuleiro;

public class PartidaXadrez {
	
	private Tabuleiro tabuleiro; 
	
	public PartidaXadrez() {
		tabuleiro = new Tabuleiro(8, 8);//quem tem saber a dimens�o de um tabuleiro � partida de xadrez, nesta classe que eu vou dizer que ele � 8 por 8 

	}
	
	public PecaXadrez[][] getPecas(){//este m�todo vai ter que retorna uma matriz de pe�as de xadrez correspondente a PartidaXadrez
		PecaXadrez[][] mat = new PecaXadrez [tabuleiro.getLinhas()][tabuleiro.getColunas()];//eu tenho que fazer esta matriz tempor�ria para acessar s� na camada de xadrez e n�o ter acesso nas camada jogo Tabuleiro 
		for(int i = 0; i < tabuleiro.getLinhas(); i++) {
			for (int j = 0; j < tabuleiro.getColunas(); j++) {
				mat[i][j] = (PecaXadrez) tabuleiro.peca(i, j);// aqui fiz o downcast para saber que � uma pe�a Xadrez en�o como uma pe�a comun 
			}
		}
		return mat;
	}

}
