package Aula1909;

public abstract class DuasDimensoes extends Formas {
	public int l1, l2;
	
	public DuasDimensoes(int l, int a) {
		super();
		this.l1 = l;
		this.l2 = a;
	}

	abstract double area();

}
