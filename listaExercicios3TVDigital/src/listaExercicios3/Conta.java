package listaExercicios3;

public class Conta {
	private String correntista;
	private String noConta;
	protected double saldo;
	
	public Conta(String correntista, String noConta) {
		super();
		this.correntista = correntista;
		this.noConta = noConta;
	}

	public String getNoConta() {
		return noConta;
	}
	public void setNoConta(String noConta) {
		this.noConta = noConta;
	}
	public String getCorrentista() {
		return correntista;
	}
	public void setCorrentista(String correntista) {
		this.correntista = correntista;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void deposito(double valor) {
	}
	
	public boolean saque(double valor){
		if (valor > 0) {
			return true;
		} else {
			return false;
		}
	}

	

}
