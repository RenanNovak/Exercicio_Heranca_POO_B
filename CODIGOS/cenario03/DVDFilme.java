package cenario03;
public class DVDFilme extends Produto {

	public double duracao;

	public String gravadora;
	
	public String getgravadora() {
		return gravadora;	
	}
	public void setgravadora(String i) {
		gravadora=i;		
	}
	
	public double getduracao() {
		return duracao;		
	}
	public void setduracao(int i) {
		duracao=i;		
	}
	public void imprimiDetalhe() {
		System.out.println("-------------------------------------------------");
		System.out.println("C�d: " +codProduto);
		System.out.println("Tipo: " +tipoProduto);
		System.out.println("Nome: " +nomeProduto);
		System.out.println("Dura��o: " +duracao);
		System.out.println("Gravadora: " +gravadora);
		System.out.println("-------------------------------------------------");

	}
}
