package jogoTabuleiro;

public class Tabuleiro {
	
	private int linhas;
	private int colunas;
	private Peca[][] pecas;
	
	public Tabuleiro(int linhas, int colunas) {
		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new Peca [linhas] [colunas];
	}

	public int getLinhas() {
		return linhas;
	}

	public void setLinhas(int linhas) {
		this.linhas = linhas;
	}

	public int getColunas() {
		return colunas;
	}

	public void setColunas(int colunas) {
		this.colunas = colunas;
	}

	public Peca peca(int linha, int coluna) {//criei este metodo para retorna peca dada uma linha e uma coluna 
		return pecas[linha][coluna];
	}
	
	public Peca peca(Posicao posicao) {//aqui eu fiz uma sobrecarga do m�todo pe�a para retorna uma posi��o 
		return pecas[posicao.getLinha()][posicao.getColuna()];
	}
	
	public void colocarPeca(Peca peca, Posicao posicao) {
		pecas[posicao.getLinha()][posicao.getColuna()] = peca;// pegando esta matriz na posi��o dada e estou atribuindo a ela pe�a que eu informei
		peca.posicao = posicao;//aqui eu to falando que a pe�a n�o esta mais na posi��o null, ela esta na posi��o que eu infomei no metodo 
	}
	
}
