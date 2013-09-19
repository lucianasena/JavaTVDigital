package Aula1909;

public class Circulo {
	public Ponto ponto;
	protected double raio;

	public Circulo() {
		ponto = new Ponto();
		setRaio(0);
	}

	public Circulo(double r, int a, int b) {
		ponto = new Ponto(a, b);
		setRaio(r);
	}

	public void setRaio(double r) {
		if (r >= 0)
			raio = r;
		else
			System.out.print("valor invalido");
	}

	public void setCirculo(double r, int a, int b) {
		if (r >= 0) {
			raio = r;
			ponto.x = a;
			ponto.y = b;
		} else
			System.out.println("valor invalido do raio:" + r);
	}

	public double getRaio() {
		return raio;
	}

	public double area() {
		return Math.PI * raio * raio;
	}

	public double circ() {
		return 2 * Math.PI * raio;
	}

	public String getCirculo() {
		return "Raio: " + raio + "\t" + ponto.getPonto();
	}
}