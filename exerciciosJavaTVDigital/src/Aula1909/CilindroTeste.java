package Aula1909;

import java.text.DecimalFormat;

public class CilindroTeste {
	
	public static void main(String args[]) {
		
		Cilindro c = new Cilindro(5, 3.5, 43, 70);
		DecimalFormat p = new DecimalFormat("0.00");
		System.out.println(c.getCilindro());
		c.setAltura(10);
		System.out.println(c.getCilindro());
		c.setCilindro(2, -10, 20, 20);
		System.out.println(c.getCilindro());
		System.out.println("Area do circulo:  " + c.area());
		System.out.println("Area do circulo:  " + p.format(c.area()));
		System.out.println("Volume do circulo:  " + c.volume());
		System.out.println("Volume do circulo:  " + p.format(c.volume()));
	}
}