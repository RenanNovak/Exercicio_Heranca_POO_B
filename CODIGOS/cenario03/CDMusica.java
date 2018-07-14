package cenario03;

public class CDMusica extends Produto {

	public int qtdFaixas;

	public String gravadora;
	
	public String getgravadora() {
		return gravadora;	
	}
	public int getqtdFaixas() {
		return qtdFaixas;		
	}
	public void setgravadora(String i) {
		gravadora=i;		
	}
	public void setqtdFaixas(int i) {
		qtdFaixas=i;		
	}
	public void imprimiDetalhe() {
		System.out.println("-------------------------------------------------");
		System.out.println("Cód: " +codProduto);
		System.out.println("Tipo: " +tipoProduto);
		System.out.println("Nome: " +nomeProduto);
		System.out.println("Quantidade de faixas: " +qtdFaixas);
		System.out.println("Gravadora: " +gravadora);
		System.out.println("-------------------------------------------------");

		
	}
	
}
