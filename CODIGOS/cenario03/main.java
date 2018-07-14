package cenario03;

public class main {

	public static void main(String[] args) {
		CDMusica music= new CDMusica();
		DVDFilme movie = new DVDFilme();
		Jogos  game = new Jogos();
		Livros book  = new Livros();
		PenDrive usb  = new PenDrive();
		Relatório relatorio = new Relatório();
		
		music.setcodProduto(1);
		music.setnomeProduto("Waka Waka");
		music.setgravadora("Xing ling");
		music.setqtdFaixas(5);
		music.settipoProduto("musical");
		
		movie.setcodProduto(2);
		movie.setnomeProduto("Spider Man");
		movie.settipoProduto("Pelicula");
		movie.setgravadora("Marvel");
		movie.setduracao(120);
		
		game.setcodProduto(3);
		game.setnomeProduto("Need for Speed");
		game.settipoProduto("Game");
		game.setgenero("Corrida");
		game.setplataforma("XBOX");
		
		book.setcodProduto(4);
		book.setnomeProduto("A Culpa é das estrelas");
		book.settipoProduto("Livro");
		book.setescritor("John Green");
		book.seteditora("Abril");
		
		usb.setcodProduto(5);
		usb.setnomeProduto("Skandisc");
		usb.settipoProduto("Pendrive");
		usb.setfabricante("Sony");
		usb.setcapacidade(128);
		
		Produto colecao[] = new Produto[5];
		
		
		colecao[0]=music;
		colecao[1]=movie;
		colecao[2]=game;
		colecao[3]=book;
		colecao[4]=usb;
		
		
		
		
		relatorio.gerarRelatorio(colecao);
		

		}

}
