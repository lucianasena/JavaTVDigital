package listaExercicios2;

public class CaixaPrincipal {

	public static void main(String[] args) {
		
		double mArea;
		
		Caixa c1 = new Caixa();
		Caixa c2 = new Caixa(5);
		Caixa c3 = new Caixa(10, 3, 5);
		
		mArea = c2.volume();
		System.out.println("Volume da Caixa 2: " + mArea);

		mArea = c2.volume(5);
		System.out.println("Volume da Caixa 2: " + mArea);

		mArea = c2.volume(10, 3, 5);		
		System.out.println("Volume da Caixa 2: " + mArea);		
	}

}
