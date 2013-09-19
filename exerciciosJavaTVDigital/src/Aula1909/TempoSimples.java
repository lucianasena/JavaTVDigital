package Aula1909;
import java.text.DecimalFormat; 

public class TempoSimples {
	private int hora, minuto, segundo; 
    
	   public TempoSimples(int hora, int minuto, int segundo){ 
	      this.hora = hora; 
	      this.minuto = minuto; 
	      this.segundo = segundo; 
	   } 
	     
	   public String getTempo(){ 
	     return "this.toString(): " + this.toString() + 
	            "\ntoString(): " + toString() +  
	            "\nthis (com chamada implícita de toString()): " + this; 
	   }      
	     
	   public TempoSimples setHora(int h){ 
	       this.hora = ((h>=0 && h<24)?h:0); 
	       return this; 
	   } 
	  
	  public TempoSimples setMinuto(int m){ 
	      this.minuto = ((m>=0 && m<60)?m:0); 
	      return this; 
	   } 
	    
	  public TempoSimples setSegundo(int s){ 
	      this.segundo = ((s>=0 && s<60)?s:0); 
	      return this; 
	   } 
	     
	   public String toString(){ 
	     DecimalFormat doisDigitos = new DecimalFormat("00"); 
	     return doisDigitos.format(this.hora) + ":" + 
	            doisDigitos.format(this.minuto) + ":" + 
	            doisDigitos.format(this.segundo); 
	   }  

}
