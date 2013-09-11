package listaExercicios;
import java.util.Scanner;

public class Fibonacci {
	
	static int fibon(int n) {
		int valorAtual = 0;
		int valorAnterior = 0;
		
		for (int i = 1; i <= n; i++) {
			if (i == 1) {
				valorAtual = 1;
				valorAnterior = 0;
			}
			else {
				valorAtual += valorAnterior;
				valorAnterior = valorAtual - valorAnterior;
			}
		}
		
		return valorAtual;
	}
	
	private static Scanner entrada;

	public static void main(String[] args) {
		
		int qtd, i;		
		entrada = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de número da série desejada: ");
		qtd = entrada.nextInt();

		for (i = 0; i < qtd; i++){
			System.out.println("Sequência Fibonacci: " + Fibonacci.fibon(i));
		}
		
	}

}
