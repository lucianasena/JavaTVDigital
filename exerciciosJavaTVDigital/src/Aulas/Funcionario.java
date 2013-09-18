package Aulas;

public class Funcionario {
	int id;
	static int proximoId = 1;
	String nome;
	
	void setId() {
		id = proximoId;
		proximoId++;
	}
	
	static String testaStatic() {
		return "testando";
	}
	

}
