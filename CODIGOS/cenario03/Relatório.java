package cenario03;


public class Relatório {

	public void gerarRelatorio(Produto[] colecao) {
		for (int i=0; i<5; i++){
			colecao[i].imprimiDetalhe();
		}
	}

}
