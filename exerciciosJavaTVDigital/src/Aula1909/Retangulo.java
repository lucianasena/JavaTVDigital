package Aula1909;

class Retangulo extends DuasDimensoes {
	
	Retangulo(int l, int a) {
		super(l, a);
	}

	double area() {
		System.out.println("Área do Retangulo: ");
		return l1*l2;
	}
}