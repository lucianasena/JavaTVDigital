package Aulas;

public class Figuras2D {
	static final float PI = 3.1415f;

	static double areaRetangulo(double largura, double altura) {
		return largura*altura;
	}
	
	static double areaCirculo(double raio) {
		return PI*Math.pow(raio, 2);
	}

}
