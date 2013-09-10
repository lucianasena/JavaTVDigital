package Aulas;

public class retanguloprincipal {

	public static void main(String[] args) {
		retangulo obRetangulo;
		double area, diagonal;
		obRetangulo = new retangulo(); //criação do objeto

		obRetangulo.largura = 5;
		obRetangulo.altura = 4;

		area = obRetangulo.largura * obRetangulo.altura;
		System.out.println("Area do Retangulo: " + area);
	}

}
