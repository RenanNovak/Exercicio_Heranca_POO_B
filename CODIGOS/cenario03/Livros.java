package cenario03;
public class Livros extends Produto {

	public String escritor;

	public String editora;

	public String getescritor() {
		return escritor;	
	}
	public void setescritor(String i) {
		escritor=i;		
	}
	
	public String geteditora() {
		return editora;	
	}
	public void seteditora(String i) {
		editora=i;		
	}
	public void imprimiDetalhe() {
		System.out.println("-------------------------------------------------");
		System.out.println("Cód: " +codProduto);
		System.out.println("Tipo: " +tipoProduto);
		System.out.println("Nome: " +nomeProduto);
		System.out.println("Escritor: " +escritor);
		System.out.println("Editora: " +editora);
		System.out.println("-------------------------------------------------");

		
	}
}
