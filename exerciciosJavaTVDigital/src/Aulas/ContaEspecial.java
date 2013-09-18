package Aulas;

public class ContaEspecial extends Conta{
	private double limiteCredito;

	public double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}
	
	public boolean saque(double valor){
		return true;
	}

	public ContaEspecial(String correntista, String noConta, double valorLimite) {
		super(correntista, noConta);
		setLimiteCredito(valorLimite);
	
	}
	
	
	
	

}
