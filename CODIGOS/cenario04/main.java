package cenario04;

public class main {

	public static void main(String[] args) {
		FiguraGeometrica formas = new FiguraGeometrica();
		Cone fig1 = new Cone();
		Cubo fig2 = new Cubo();
		Paralelepipedo fig3 = new Paralelepipedo();
		Esfera fig4 = new Esfera();
		fig1.setalturaH(20);
		fig1.setbaseR(10);
		System.out.println("Volume do cone: "+fig1.calculaVol());
		
		fig2.setlado1(20);
		fig2.setlado2(20);
		fig2.setlado3(20);
		System.out.println("Volume do cubo: "+fig2.calculaVol());
		
		fig3.setlado1(10);
		fig3.setlado2(30);
		fig3.setlado3(150);
		System.out.println("Volume do paralelepipedo: "+fig3.calculaVol());
		
		fig4.setRaio(20);
		System.out.println("Volume do esfera: "+fig4.calculaVol());
	}

}
