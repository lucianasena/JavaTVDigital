package Aula1909;

class Triangulo extends DuasDimensoes {
	
	Triangulo(int l, int a) {
		super(l, a);
	}

	double area() {
		System.out.println("Área do Triangulo: ");
		return (l1*l2)/2;
	}
}