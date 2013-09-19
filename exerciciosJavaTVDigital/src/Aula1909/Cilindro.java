package Aula1909;

public class Cilindro {
	protected double altura;
	public Circulo circulo;

	// construtor sem argumento
	public Cilindro() {
		circulo = new Circulo();
		// chamada implícita ao construtor de superclasse
		setAltura(0);
	}

	// construtor
	public Cilindro(double h, double r, int a, int b) {
		circulo = new Circulo(r, a, b);
		setAltura(h);
	}

	// atribui valores para a altura do Cilindro
	public void setAltura(double h) {
		if (h >= 0)
			altura = h;
		else
			System.out.println("valor invalido");
	}

	// atribui valores para Cilindro: altura, raio, x, y
	public void setCilindro(double h, double r,
			int a, int b){
		if (h>=0 && r>=0){
			altura = h;   
			circulo.raio = r;   
			circulo.ponto.x = a;  
			circulo.ponto.y = b;
		}
		else
			System.out.println("valor invalido para a altura = " + h + "  ou raio =  "+r);
	}

	// obtém raio do Cilindro
	public double getAltura() {
		return altura;
	}

	// calcula a área do Cilindro
	public double area() {
		return 2*circulo.area() + circulo.circ()*altura;
	}

	// calcula o volume do Cilindro
	public double volume() {
		return circulo.area()*altura;
	}

	// informa os valores dos atributos do Cilindro
	public String getCilindro() {
		return "Altura: " + altura + "\t" + circulo.getCirculo();
	}
}