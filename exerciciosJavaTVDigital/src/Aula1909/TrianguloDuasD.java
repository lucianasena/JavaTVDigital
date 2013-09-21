package Aula1909;

class TrianguloDuasD extends DuasDimensoes {
	
	TrianguloDuasD(int l, int a) {
		super(l, a);
	}

	public double area() {
		System.out.println("Área do TrianguloDuasD: " + this.toString());
		return (l1*l2)/2;
	}
	
	public String toString() {
		return "O " + this.nomeFig + "tem a seguinte área: " + this.area();
	}
}