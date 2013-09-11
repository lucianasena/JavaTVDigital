/*
 * Curso de TV Digital
 * Exercício 4 do slide 3.
 * Aluna: Luciana de Aguiar Sena.
 */

package listaExercicios;

public class Caixa {
	
	public double largura, altura, comprimento;
	
	double area() {
		double area;
		area = 2*((largura*altura) + (largura*comprimento) + (comprimento*altura));
		return area;
	}
	
	double volume() {
		double volume;
		volume = largura*altura*comprimento;
		return volume;
	}
	
	double largura() {
		return largura;
	}
	
	double altura() {
		return altura;
	}
	
	double comprimento() {
		return comprimento;
	}


}
