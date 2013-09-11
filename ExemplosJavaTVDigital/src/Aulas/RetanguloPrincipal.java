package Aulas;

public class RetanguloPrincipal {

	public static void main(String[] args) {
		
		Retangulo obRetangulo;
		
		double area;
		obRetangulo = new Retangulo(); //criação do objeto

		obRetangulo.largura = 5;
		obRetangulo.altura = 4;

		area = obRetangulo.largura * obRetangulo.altura;
		System.out.println("Area do Retangulo: " + area);
	}

}
