package Xadrez;

import jogoTabuleiro.Peca;
import jogoTabuleiro.Tabuleiro;

public class PecaXadrez extends Peca{
	
	private Cor cor;
	
	public PecaXadrez(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro);
		this.cor = cor;
	}

	public Cor getCor() {//N�o criei o setCor porque eu nao quero que a cor seja modificada, s� acessada.
		return cor;
	}

	
	
	
	
	
	
}
