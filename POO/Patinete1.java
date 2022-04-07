package Patinete;

public class Patinete1 {

	boolean manutenção;
	String novodono, antigodono;
	int ano;
	
	public void manutenção () {
		if (manutenção == true)
			System.out.println("O patinete é velho, melhor restaurar.");
		else
			System.out.println("Está em ótimas condições, apesar da idade!");
	}
	
	public void status () {
		System.out.println("Este patinete é de " + this.ano);
		System.out.println("O antigo dono era: " + this.antigodono);
		System.out.println("O novo dono é: " + this.novodono);
		System.out.println("Ele precisa de manutenção? " + this.manutenção);
	}
	
}
