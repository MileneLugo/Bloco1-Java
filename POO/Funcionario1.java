package Funcionario;

public class Funcionario1 {

	boolean promo��o;
	String nome, fun��o;
	int qualidade, anos;
	
	public void promo��o () {
		if (qualidade > 7 && anos > 1)
			System.out.println("O funcion�rio ganhar� uma promo��o!");
		else
			System.out.println("O funcion�rio precisa se dedicar mais!");
		
	}
	
	public void status () {
		
		System.out.println("O nome do funcion�rio �: " + this.nome);
		System.out.println("H� quanto tempo ele est� na empresa? " + this.anos + " anos");
		System.out.println("De 1 a 10, a qualidade de seu servi�o �: " + this.qualidade);
		System.out.println("Ele pode receber uma promo��o? " + this.promo��o);
		
	}
}
