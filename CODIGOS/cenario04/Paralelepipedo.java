package cenario04;
public class Paralelepipedo extends FiguraGeometrica  {

	public double ladoA;

	public double ladoB;

	public double ladoC;
	
	public void setlado1(double i) {
		ladoA=i;
	}
	public void setlado2(double i) {
		ladoB=i;		
	}
	public void setlado3(double i) {
		ladoC=i;		
	}
	public double getlado3() {
		return ladoC;		
	}
	public double getlado2() {
		return ladoB;		
	}
	public double getlado1() {
		return ladoA;		
	}
	public double calculaVol() {
		return ladoA*ladoB*ladoC;
	}
}
