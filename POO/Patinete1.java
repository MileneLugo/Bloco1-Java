package Patinete;

public class Patinete1 {

	boolean manuten��o;
	String novodono, antigodono;
	int ano;
	
	public void manuten��o () {
		if (manuten��o == true)
			System.out.println("O patinete � velho, melhor restaurar.");
		else
			System.out.println("Est� em �timas condi��es, apesar da idade!");
	}
	
	public void status () {
		System.out.println("Este patinete � de " + this.ano);
		System.out.println("O antigo dono era: " + this.antigodono);
		System.out.println("O novo dono �: " + this.novodono);
		System.out.println("Ele precisa de manuten��o? " + this.manuten��o);
	}
	
}
