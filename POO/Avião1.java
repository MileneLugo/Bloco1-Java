package Avião;

public class Avião1 {
	
	boolean ativo, manutenção;
	String empresa;
	int idade;
	
	public void ativo() {
		if (ativo = true)
			System.out.println("Este avião ainda é ativo.");
		else
			System.out.println("Este avião foi desativado");
	}
	
	public void manutenção() {
		if (manutenção = true)
			System.out.println("Então chamem os tecnicos!");
		else
			System.out.println("Está liberado para decolar!");
	}

	public void status () {
		System.out.println("Este avião é de que empresa? " + this.empresa);
		System.out.println("Qual a idade dele? " + this.idade);
		System.out.println("Ele está ativo? " + this.ativo);
		System.out.println("Precisa de manutenção? " + manutenção);
		
	}
}
