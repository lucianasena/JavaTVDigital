/*
 * Curso de TV Digital
 * Exercício 3 do slide 3.
 * Aluna: Luciana de Aguiar Sena.
 */

package listaExercicios;
import java.util.Scanner;

public class RetanguloPrincipal {

	private static Scanner entrada;

	public static void main(String[] args) {
		
		double larg, alt, largura, altura;
		entrada = new Scanner(System.in);
		
		System.out.print("Digite a largura do retângulo: ");
		larg = entrada.nextDouble();
		System.out.print("Digite a altura do retângulo: ");
		alt = entrada.nextDouble();
		
		Retangulo obRetangulo;
		
		double area, diagonal;
		obRetangulo = new Retangulo();

		obRetangulo.largura = larg;
		obRetangulo.altura = alt;

		area = obRetangulo.area();
		diagonal = obRetangulo.diagonal();
		largura = obRetangulo.largura();
		altura = obRetangulo.altura();
		
		System.out.println("\nLargura digitada: " + largura);
		System.out.println("Altura digitada: " + altura);
		System.out.println("Área do Retangulo: " + area);
		System.out.println("Diagonal do Retangulo: " + diagonal);
	}

}
