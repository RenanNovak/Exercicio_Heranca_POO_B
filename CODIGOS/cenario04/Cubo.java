package cenario04;
public class Cubo extends FiguraGeometrica  {

	public double lado1;

	public double lado2;

	public double lado3;

	public void setlado1(double i) {
		lado1=i;
	}
	public void setlado2(double i) {
		lado2=i;		
	}
	public void setlado3(double i) {
		lado3=i;		
	}
	public double getlado3() {
		return lado3;		
	}
	public double getlado2() {
		return lado2;		
	}
	public double getlado1() {
		return lado1;		
	}
	public double calculaVol() {
		return lado1*lado2*lado3;
	}

}
