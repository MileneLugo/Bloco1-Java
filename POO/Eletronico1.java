package Eletronico;

public class Eletronico1 {

	boolean gasto, pilhas, tomada;
	int avalia��o;
	
	public void gasto () {
		if (gasto = true)
			System.out.println("Leia as instru��es para saber quando carregar o produto antes de desligar.");
		else
			System.out.println("Este produto n�o ir� desligar por falta de carga.");
	}
	
	public void pilhas () {
		if (pilhas = true)
			System.out.println("Leia as instru��es para saber que tipo de pilhas usar.");
		else
			System.out.println("Este produto n�o utiliza pilhas.");
	}
	
	public void tomada () {
		if (tomada = true)
			System.out.println("Este produto pode ou deve ser utilizado ligado na tomada.");
		else
			System.out.println("Este produto n�o tem ou n�o pode estar na tomada durante uso.");
	}
	
	public void status () {
		System.out.println("A avalia��o deste produto no aplicativo � de " + this.avalia��o + " estrelas");
		System.out.println("Este produto possue quanto tempo de carga? " + this.gasto);
		System.out.println("Este produto utiliza que tipo de pilha? " + this.pilhas);
		System.out.println("Este produto pode ser usado na tomada? " + this.tomada);
	}
}
