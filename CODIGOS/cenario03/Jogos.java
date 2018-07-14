package cenario03;
public class Jogos extends Produto {

	public String genero;

	public String plataforma;
	
	public String getgenero() {
		return genero;	
	}
	public void setgenero(String i) {
		genero=i;		
	}
	
	public String getplataforma() {
		return plataforma;	
	}
	public void setplataforma(String i) {
		plataforma=i;		
	}
	public void imprimiDetalhe() {
		System.out.println("-------------------------------------------------");
		System.out.println("Cód: " +codProduto);
		System.out.println("Tipo: " +tipoProduto);
		System.out.println("Nome: " +nomeProduto);
		System.out.println("Genero: " +genero);
		System.out.println("Plataforma: " +plataforma);
		System.out.println("-------------------------------------------------");

		
	}

}
