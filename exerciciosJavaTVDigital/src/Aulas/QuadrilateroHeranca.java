package Aulas;

public class QuadrilateroHeranca {

	public static void main(String[] args) {
		double area;
		Quadrado obQuadrado = new Quadrado(5.5);
		
		area = obQuadrado.calcAreaQ(obQuadrado.largura());
		System.out.println("Quadrado: " + area);
		
		area = obQuadrado.calcAreaQ(3.2);
		System.out.println("Quadrado 2: " + area);
		
		System.out.println("Altura do quadrado: " + obQuadrado.altura);

	}

}
