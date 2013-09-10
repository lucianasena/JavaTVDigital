package Aulas;
import java.util.Scanner;

public class exercicios {

	private static Scanner entrada;

	public static void main(String[] args) {
		int opcao;
		double t, S0, v, S, v0, a, v2, V2;

		entrada = new Scanner(System.in);
		System.out.print("Informe o número desejado dos exercícios: ");
		opcao = entrada.nextInt();

		switch(opcao) {
			case 1:
				System.out.println("Exercício sobre Movimento Uniforme.\n");
				System.out.print("Informe t: ");
				t = entrada.nextDouble();
				System.out.print("Informe v: ");
				v = entrada.nextDouble();
				System.out.print("Informe S0: ");
				S0 = entrada.nextDouble();

				S = S0 + v*t;
				System.out.println("S é igual a: " + S);
			break;
			
			case 2:
				System.out.println("Exercício sobre Movimento Uniformemente Variado.\n");
				System.out.print("Informe t: ");
				t = entrada.nextDouble();
				System.out.print("Informe v0: ");
				v0 = entrada.nextDouble();
				System.out.print("Informe a: ");
				a = entrada.nextDouble();
				System.out.print("Informe S0: ");
				S0 = entrada.nextDouble();
				
				v = v0 + a*t;
				S = S0 + v0*t + (a*Math.pow(t, 2))/2;
				v2 = Math.pow(v0, 2) + 2*a*(S-S0);
				V2 = Math.sqrt(v2);

				System.out.println("\nEquação Horária da Velocidade: v = " + v + "\n");
				System.out.println("Equação Horária do Espaço:  S = " + S + "\n");
				System.out.println("Equação de Torricelli: v = " + V2 + "\n");
			break;

			default:
				System.out.println("Essa não é uma opção válida.");

		}

	}
}
