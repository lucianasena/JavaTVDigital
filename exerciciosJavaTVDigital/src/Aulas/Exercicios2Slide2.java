package Aulas;
import java.util.Scanner;

public class Exercicios2Slide2 {
	
	private static Scanner entrada;

	public static void main(String args[]) {
		double salario, valor = 0;
		entrada = new Scanner(System.in);
		System.out.print("Informe o seu salário: ");
		salario = entrada.nextInt();
		
		if (salario <= 1050) {
			System.out.println("Funcionário isento de imposto de renda.");
			
		} 		
		else {
				if (salario > 1050 && salario <= 2500) {
					valor = (salario*15)/100;}
				
				else {
					if (salario > 2500 && salario <= 7500) {
						valor = (salario*25)/100;}
					
						else valor = (salario*35)/100;
						
					}
			}
		
		System.out.println("O valor a ser pago é: " + valor);
		}
	
		
	}
