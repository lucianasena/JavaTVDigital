package listaExercicios2;

public class ContaCorrente {
	String correntista;
	int noConta;
	double saldoConta;
	double valor;
	
	void inicia(String nome, int nConta) {
		correntista = nome;
		noConta = nConta;
	}
	
	public ContaCorrente(String nome, int conta) {
		inicia(nome, conta);
	}
	
	public double getValor(double valor) {
		return valor;
	}
	
	public void setValor(double v) {
		this.valor = v;
	}
	
	public double deposita(double valor) {
		return valor;
	}
	
	public boolean retira(double valor) {
		if (valor > 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public double mostraSaldo(double saldo) {
		return saldo;
	}

}
