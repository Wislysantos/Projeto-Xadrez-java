package pecas.Xadrez;

import Xadrez.Cor;
import Xadrez.PecaXadrez;
import jogoTabuleiro.Tabuleiro;

public class Torre extends PecaXadrez {

	public Torre(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro, cor);
	}
	
	@Override
	public String toString() {
		return "T";
	}

}
