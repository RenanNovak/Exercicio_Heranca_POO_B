package cenario04;
public class Cone extends FiguraGeometrica  {

	public double baseR;

	public double alturaH;
	
	
	void setbaseR(int base){
		baseR=base;
	}
	double getbaseR(){
		return baseR;
	}
	void setalturaH(int altura){
		alturaH=altura;
	}
	double getalturaH(){
		return alturaH;
	}
	public double calculaVol() {
		double pi = 3.1415;
		return pi*(baseR*baseR)*(alturaH/3);
	}

}
