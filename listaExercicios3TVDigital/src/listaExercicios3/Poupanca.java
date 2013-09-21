package listaExercicios3;

public class Poupanca extends Conta{
	
	public Poupanca(String correntista, String noConta) {
		super(correntista, noConta);
	}
	
	private double perCorrecao;
	private int diaAniversario;
	
	public double getPerCorrecao() {
		return perCorrecao;
	}
	public void setPerCorrecao(double perCorrecao) {
		this.perCorrecao = perCorrecao;
	}
	public int getDiaAniversario() {
		return diaAniversario;
	}
	public void setDiaAniversario(int diaAniversario) {
		this.diaAniversario = diaAniversario;
	}
	
	public boolean calcCorrecao(){
		return true;
	}
	
	
	

}
