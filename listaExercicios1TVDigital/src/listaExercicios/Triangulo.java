package listaExercicios;
import java.util.Scanner;

public class Triangulo {
	
	private static Scanner entrada;

	public static void main(String[] args) {
		
		double ladoA, ladoB, ladoC;
		
		entrada = new Scanner(System.in);
		System.out.print("Digite um valor para o lado A do triângulo: ");
		ladoA = entrada.nextDouble();
		System.out.print("Digite um valor para o lado B do triângulo: ");
		ladoB = entrada.nextDouble();
		System.out.print("Digite um valor para o lado C do triângulo: ");
		ladoC = entrada.nextDouble();
		
		if (ladoA < ladoB+ladoC && ladoB < ladoA+ladoC && ladoC < ladoB+ladoA) {
			if (ladoA == ladoB && ladoB == ladoC) {
				System.out.println("É um triângulo equilátero.");
			}							
				else {
					if (ladoA == ladoB || ladoB == ladoC || ladoA == ladoC) {
						System.out.println("É um triângulo isósceles.");
					} else {
						System.out.println("É um triângulo escaleno.");					
					}
					
				}
			} else {
				System.out.println("Não é um triângulo.");
			}

		
		} 


	}
