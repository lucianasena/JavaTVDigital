package Aulas;
import java.util.Scanner;

public class Exercicios2Slide2 {
	
	private static Scanner entrada;

	public static void main(String args[]) {
		int salario;
		entrada = new Scanner(System.in);
		System.out.print("Informe o seu salário: ");
		salario = entrada.nextInt();
		
		if (salario <= 1050) {
			System.out.println("Funcionário isento de imposto de renda.");
			
		} 		
		else {
				if (salario > 1050 && salario <= 2500) {
				System.out.println("Funcionário pagará 15%."); }
				
				else {
					if (salario > 2500 && salario < 7500) {
						System.out.println("Funcionário pagará 25%.");}
					
						else System.out.println("Bunda.");
						
					}
			}
		}
	
		
	}

