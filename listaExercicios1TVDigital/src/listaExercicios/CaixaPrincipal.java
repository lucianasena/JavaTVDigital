/*
 * Curso de TV Digital
 * Exercício 4 do slide 3.
 * Aluna: Luciana de Aguiar Sena.
 */

package listaExercicios;

import java.util.Scanner;

public class CaixaPrincipal {
	
	private static Scanner entrada;

	public static void main(String[] args) {

		double larg, alt, comp, largura, altura, comprimento, area, volume;
		entrada = new Scanner(System.in);
		
		System.out.print("Digite a largura da caixa: ");
		larg = entrada.nextDouble();
		System.out.print("Digite a altura da caixa: ");
		alt = entrada.nextDouble();
		System.out.print("Digite o comprimento da caixa: ");
		comp = entrada.nextDouble();
		
		Caixa obCaixa;
		
		obCaixa = new Caixa();

		obCaixa.largura = larg;
		obCaixa.altura = alt;
		obCaixa.comprimento = comp;
		
		area = obCaixa.area();
		volume = obCaixa.volume();		
		largura = obCaixa.largura();
		altura = obCaixa.altura();
		comprimento = obCaixa.comprimento();
		
		System.out.println("\nLargura digitada: " + largura);
		System.out.println("Altura digitada: " + altura);
		System.out.println("Comprimento digitado: " + comprimento);
		System.out.println("Área da caixa: " + area);
		System.out.println("Volume da caixa: " + volume);

	}

}
