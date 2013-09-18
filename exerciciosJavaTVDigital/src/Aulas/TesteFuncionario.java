package Aulas;

public class TesteFuncionario {
	
	public static void main(String[] args) {
		Funcionario joao = new Funcionario();
		joao.setId();
			
		System.out.println("ID do João = " + joao.id);
		
		Funcionario carlos = new Funcionario();
		carlos.setId();
		System.out.println("ID do Carlos = " + carlos.id);
		
		System.out.println(Funcionario.testaStatic());
	}
	

}
