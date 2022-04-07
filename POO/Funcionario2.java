package Funcionario;

public class Funcionario2 {

	public static void main(String[] args) {
		Funcionario1 fun = new Funcionario1 ();
		
		fun.nome = "Yago Gomes";
		fun.anos = 2;
		fun.função = "Recepcionista"; 
		fun.qualidade = 8;
		fun.promoção = true;
		
		fun.status ();
		fun.promoção ();
		
	}
}
