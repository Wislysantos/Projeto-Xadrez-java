package jogoTabuleiro;


public class Tabuleiro {
	
	private int linhas;
	private int colunas;
	private Peca[][] pecas;
	
	public Tabuleiro(int linhas, int colunas) {
		if( linhas < 1 || colunas < 1) {
			throw new TabuleiroException("erro criar o tabuleiro: � necessario que aja uma linha e uma coluna ");
		}
		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new Peca [linhas] [colunas];
	}

	public int getLinhas() {//tirei o getLinhas para n�o ser alterado quantidade de linhas
		return linhas;
	}
	
	public int getColunas() {//tirei o getColunas para n�o ser alterado quantidade de colunas.
		return colunas;
	}

	public Peca peca(int linha, int coluna) {//criei este metodo para retorna peca dada uma linha e uma coluna 
		if(!posicaoExixtem(linha, coluna)) {
			throw new TabuleiroException("A posi��o n�o est� no Tabuleiro");
		}
		return pecas[linha][coluna];
	}
	
	public Peca peca(Posicao posicao) {//aqui eu fiz uma sobrecarga do m�todo pe�a para retorna uma posi��o 
		if(!posicaoExistem(posicao)) {
			throw new TabuleiroException("A posi��o n�o est� no Tabuleiro");
		}
		return pecas[posicao.getLinha()][posicao.getColuna()];
	}
	
	public void colocarPeca(Peca peca, Posicao posicao) {
		if(temPeca(posicao)) {
			throw new TabuleiroException("J� existe uma pe�a na posi��o" + posicao);
		}
		pecas[posicao.getLinha()][posicao.getColuna()] = peca;// pegando esta matriz na posi��o dada e estou atribuindo a ela pe�a que eu informei
		peca.posicao = posicao;//aqui eu to falando que a pe�a n�o esta mais na posi��o null, ela esta na posi��o que eu infomei no metodo 
	}
	
	private boolean posicaoExixtem(int linha, int coluna) {//metodo auxiliar
		 return linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas;
	}
	
	public boolean posicaoExistem(Posicao posicao) {
		return posicaoExixtem(posicao.getLinha(), posicao.getColuna());
	}
	public boolean temPeca(Posicao posicao) {
		if(temPeca(posicao)) {
			throw new TabuleiroException("A posi��o n�o est� no Tabuleiro");
		}
		return peca(posicao) != null;
	}
	
	
}
