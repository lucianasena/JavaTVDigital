package Aulas;
import java.util.Scanner;

public class exercicios3 {

	public static void main(String[] args) {
		int numero, fatorial, n = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe um número: ");
		numero = entrada.nextInt();
		
		fatorial = numero--;
		while (numero > 0) {
			fatorial = fatorial*numero;
			numero = numero-1;
		}
		
		System.out.println("O fatorial é " + fatorial);
	
	}

}
