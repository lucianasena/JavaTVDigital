/*
 * Curso de TV Digital
 * Exercício 4 do slide 3.
 * Aluna: Luciana de Aguiar Sena.
 */

package Aulas;

public class Retangulo {
	
	public double largura, altura;

	double area() {
		double area;
		area = largura*altura;
		return area;
	}
	
	double diagonal() {
		double diagonal;
		diagonal = Math.pow(largura, 2) + Math.pow(altura, 2);
		diagonal = Math.sqrt(diagonal);
		return diagonal;
		
	}
	
	double largura() {
		return largura;
	}
	
	double altura() {
		return altura;
	}
	

}
