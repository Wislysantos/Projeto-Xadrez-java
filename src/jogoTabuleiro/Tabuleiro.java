package jogoTabuleiro;


public class Tabuleiro {
	
	private int linhas;
	private int colunas;
	private Peca[][] pecas;
	
	public Tabuleiro(int linhas, int colunas) {
		if( linhas < 1 || colunas < 1) {
			throw new TabuleiroException("erro criar o tabuleiro: é necessario que aja uma linha e uma coluna ");
		}
		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new Peca [linhas] [colunas];
	}

	public int getLinhas() {//tirei o getLinhas para não ser alterado quantidade de linhas
		return linhas;
	}
	
	public int getColunas() {//tirei o getColunas para não ser alterado quantidade de colunas.
		return colunas;
	}

	public Peca peca(int linha, int coluna) {//criei este metodo para retorna peca dada uma linha e uma coluna 
		if(!posicaoExixtem(linha, coluna)) {
			throw new TabuleiroException("A posição não está no Tabuleiro");
		}
		return pecas[linha][coluna];
	}
	
	public Peca peca(Posicao posicao) {//aqui eu fiz uma sobrecarga do método peça para retorna uma posição 
		if(!posicaoExistem(posicao)) {
			throw new TabuleiroException("A posição não está no Tabuleiro");
		}
		return pecas[posicao.getLinha()][posicao.getColuna()];
	}
	
	public void colocarPeca(Peca peca, Posicao posicao) {
		if(temPeca(posicao)) {
			throw new TabuleiroException("Já existe uma peça na posição" + posicao);
		}
		pecas[posicao.getLinha()][posicao.getColuna()] = peca;// pegando esta matriz na posição dada e estou atribuindo a ela peça que eu informei
		peca.posicao = posicao;//aqui eu to falando que a peça não esta mais na posição null, ela esta na posição que eu infomei no metodo 
	}
	
	private boolean posicaoExixtem(int linha, int coluna) {//metodo auxiliar
		 return linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas;
	}
	
	public boolean posicaoExistem(Posicao posicao) {
		return posicaoExixtem(posicao.getLinha(), posicao.getColuna());
	}
	public boolean temPeca(Posicao posicao) {
		if(temPeca(posicao)) {
			throw new TabuleiroException("A posição não está no Tabuleiro");
		}
		return peca(posicao) != null;
	}
	
	
}
