package Aula1909;

class TrianguloDuasD extends DuasDimensoes {
	
	TrianguloDuasD(int l, int a) {
		super(l, a);
	}

	public double area() {
		return (l1*l2)/2;
	}
}