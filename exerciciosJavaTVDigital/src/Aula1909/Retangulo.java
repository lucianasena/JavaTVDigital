package Aula1909;

class Retangulo extends Figuras2D {
	Retangulo(double l, double a) {
		super(l, a); // invoca o construtor da superclasse
	}

	double area() {
		System.out.println("Calculando a area do Retangulo.");
		return largura * altura;
	}
}