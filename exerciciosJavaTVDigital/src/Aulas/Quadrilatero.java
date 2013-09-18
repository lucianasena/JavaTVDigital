package Aulas;

public class Quadrilatero {
	double largura, altura;
	
	void inicia(double l, double a) {
		largura = l;
		altura = a;
	}
	
	double calcArea(double l, double a) {
		return l*a;
	}
	
	double largura() {
		return largura;
	}

}
