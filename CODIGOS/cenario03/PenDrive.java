package cenario03;
public class PenDrive extends Produto {

	public double capacidade;

	public String fabricante;
	
	public String getfabricante() {
		return fabricante;	
	}
	public void setfabricante(String i) {
		fabricante=i;		
	}
	
	public double getcapacidade() {
		return capacidade;	
	}
	public void setcapacidade(double i) {
		capacidade=i;		
	}
	public void imprimiDetalhe() {
		System.out.println("-------------------------------------------------");
		System.out.println("Cód: " +codProduto);
		System.out.println("Tipo: " +tipoProduto);
		System.out.println("Nome: " +nomeProduto);
		System.out.println("Capacidade: " +capacidade);
		System.out.println("Fabricante: " +fabricante);
		System.out.println("-------------------------------------------------");

		
	}
}
