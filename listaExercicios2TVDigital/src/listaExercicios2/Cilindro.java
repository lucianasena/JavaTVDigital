package listaExercicios2;

public class Cilindro {
	double raio, altura;
	static final float PI = 3.1415f;
	
	void inicia(double larg, double alt) {
		raio = larg;
		altura = alt;
	}
	
	public Cilindro(double l, double a) {
		inicia(l, a);
	}

	double area() {
		double areaLateral, areaBase, areaTotal;
		
		areaBase = PI*Math.pow(raio, 2);
		areaLateral = 2*PI*raio*altura;
		areaTotal = 2*areaBase + areaLateral;
		
		return areaTotal;
	}
	
	double volume() {
		double volume;
		
		volume = PI*Math.pow(raio, 2)*altura;
		
		return volume;
	}
	
	public double getRaio(){
		return raio;
	}
	
	public void setRaio(double r) {
		this.raio = r;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double alt) {
		this.altura = alt;
	}

}
