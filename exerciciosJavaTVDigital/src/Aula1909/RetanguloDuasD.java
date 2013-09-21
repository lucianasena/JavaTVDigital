package Aula1909;

class RetanguloDuasD extends DuasDimensoes {
	
	RetanguloDuasD(int l, int a) {
		super(l, a);
	}

	public double area() {
		System.out.println("Área do RetanguloDuasD: ");
		return l1*l2;
	}
}