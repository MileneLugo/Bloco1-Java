package Funcionario;

public class Funcionario1 {

	boolean promoção;
	String nome, função;
	int qualidade, anos;
	
	public void promoção () {
		if (qualidade > 7 && anos > 1)
			System.out.println("O funcionário ganhará uma promoção!");
		else
			System.out.println("O funcionário precisa se dedicar mais!");
		
	}
	
	public void status () {
		
		System.out.println("O nome do funcionário é: " + this.nome);
		System.out.println("Há quanto tempo ele está na empresa? " + this.anos + " anos");
		System.out.println("De 1 a 10, a qualidade de seu serviço é: " + this.qualidade);
		System.out.println("Ele pode receber uma promoção? " + this.promoção);
		
	}
}
