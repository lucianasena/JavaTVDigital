package Aula1909;

abstract class Figuras2D {
	double largura, altura;

	Figuras2D(double l, double a) {
		largura = l;
		altura = a;
	}

	abstract double area();
}

