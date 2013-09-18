package Aulas;
import java.util.Scanner;

public class Figuras2DPrincipal {
	private static Scanner entrada;

	public static void main(String[] args) {
		double largura, altura, raio;
		entrada = new Scanner(System.in);
		
		System.out.print("Digite a largura do retângulo: ");
		largura = entrada.nextDouble();
		
		System.out.print("Digite a altura do retângulo: ");
		altura = entrada.nextDouble();
		
		System.out.print("Digite o raio do círculo: ");
		raio = entrada.nextDouble();
		
		System.out.println("\nÁrea do retângulo = " + Figuras2D.areaRetangulo(largura, altura));
		System.out.println("Área do círculo = " + Figuras2D.areaCirculo(raio));
	}

}
