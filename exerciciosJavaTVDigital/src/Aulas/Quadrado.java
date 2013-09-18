package Aulas;

public class Quadrado extends Quadrilatero{
	double area;
	
	Quadrado(double l) {
		inicia(l, l);
	}
	
	double calcAreaQ(double l) {
		area = calcArea(l, l);
		return area;
	}
	
	void iniciaQ(double l) {
		inicia(l, l);
	}
	
}
