package Aula1909;

class Triangulo extends Figuras2D {
	Triangulo(double l, double a) {
		super(l, a); // invoca o construtor da superclasse
	}

	double area() {
		System.out.println("Calculando a area do Triangulo.");
		return (largura * altura) / 2;
	}
}