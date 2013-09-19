package Aula1909;

public class ThisTeste {

	public static void main(String[] args) {
		TempoSimples t1 = new TempoSimples(12, 3, 9); 
        TempoSimples t2 = new TempoSimples(10, 1, 1); 
  
        System.out.println(t1.getTempo()); 
        System.out.println(t2.getTempo()); 
  
        // chamada de métodos em cascata 
        t1.setHora(5).setMinuto(25).setSegundo(5); 
        System.out.println(t1.getTempo());
	}

}
