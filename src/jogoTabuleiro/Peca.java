package jogoTabuleiro;

public class Peca {
	
	protected Posicao posicao;
	private Tabuleiro tabuleiro;
	
	public Peca(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
		posicao = null;		
	}

		
	protected Tabuleiro getTabuleiro() {//não quero que o tabuleiro seja acessivo pela camada de xadrez "somente classe do mesmo pacote e a sub classe "
		return tabuleiro;
	}
	
	
}
