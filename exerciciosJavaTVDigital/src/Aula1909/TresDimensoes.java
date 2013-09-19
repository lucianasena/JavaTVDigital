package Aula1909;

public abstract class TresDimensoes extends DuasDimensoes {
	int l3;
	
	public TresDimensoes(int l, int a, int raio) {
		super(l, a);
		this.l3 = raio;
	}	
	
	abstract double volume();

}
