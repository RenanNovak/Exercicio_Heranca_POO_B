package cenario04;

public class Esfera extends FiguraGeometrica  {

	public double a;

	public void setRaio(int raio) {
		a=raio;
	}

	public double getRaio() {
		return a;
	}
	public double calculaVol() {
		double pi = 3.1415;
		return (4*pi*(a*a*a))/3;
	}
}
