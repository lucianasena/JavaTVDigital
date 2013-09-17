package listaExercicios2;

public class Caixa {
	double largura, altura, comprimento;
	
	void inicia(double l, double a, double c) {
		largura = l;
		altura = a;
		comprimento = c;
	}
	
	Caixa(){
		inicia(0, 0, 0);
	}
	
	Caixa(double l) {
		inicia(l, l, l);
	}
	
	Caixa(double larg, double alt, double comp) {
		inicia(larg, alt, comp);
	}
	
	double volume() {
		return largura*altura*comprimento;
	}
	
	double volume(double l) {
		return l*l*l;
	}
	
	double volume(double l, double a, double c) {
		double volume;
		volume = l*a*c;
		return volume;
	}
}
