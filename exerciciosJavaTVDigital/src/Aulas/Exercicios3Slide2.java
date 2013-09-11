package Aulas;
import java.util.Scanner;

public class Exercicios3Slide2 {

	private static Scanner entrada;

	public static void main(String[] args) {
		int numero, fatorial;
		entrada = new Scanner(System.in);
		System.out.print("Informe um número: ");
		numero = entrada.nextInt();
		
		fatorial = numero--;
		while (numero > 0) {
			fatorial = fatorial*numero;
			numero = numero-1;
		}
		
		System.out.println("O fatorial de " + numero + " é " + fatorial);
	
	}

}