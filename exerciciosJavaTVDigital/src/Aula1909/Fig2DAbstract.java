package Aula1909;

class Fig2DAbstract {
	  public static void main(String args[ ]){
	   Figuras2D r = new Retangulo (4.5, 10); 
	   Figuras2D t = new Triangulo(5.5, 20); 
	        
	   //invocando o método para retornar a area
	    System.out.println("Area:" + r.area());
	    System.out.println("Area:" + t.area());
	  }
	}
