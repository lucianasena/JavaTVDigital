package Aula1909;

public class Ponto {
	   protected int x, y;  //coordenadas do ponto	
	   //construtor sem argumento
	   public Ponto(){ 
	      setPonto(0,0);
	   }	
	  //construtor
	  public Ponto(int a, int b) { 
	    setPonto(a,b); 
	  }	
	  //atribui valores às coordenadas x e y do Ponto
	  public void setPonto(int a, int b){
	     x = a;    y = b;
	  }
	  //obtém a coordenada x
	   public int getX() { 
	     return x; 
	   }	
	   //obtém a coordenada y
	  public int getY() { 
	     return y; 
	  }	

	  //informa os valores dos atributos do ponto
	  public String getPonto(){
	     return "Centro: [" + x + "," + y + "]";
	  }
	} //fim da classe Ponto

