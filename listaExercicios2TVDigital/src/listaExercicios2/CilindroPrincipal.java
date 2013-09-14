package listaExercicios2;

public class CilindroPrincipal {

	public static void main(String[] args) {
		Cilindro obCilindro;
		double area, vol;
		
		obCilindro = new Cilindro(20, 2);
		
		area = obCilindro.area();
		System.out.println("Área do Cilindro: " + area);
		vol = obCilindro.volume();
		System.out.println("Volume do Cilindro: " + vol);

		
	}

}
