package Avi�o;

public class Avi�o1 {
	
	boolean ativo, manuten��o;
	String empresa;
	int idade;
	
	public void ativo() {
		if (ativo = true)
			System.out.println("Este avi�o ainda � ativo.");
		else
			System.out.println("Este avi�o foi desativado");
	}
	
	public void manuten��o() {
		if (manuten��o = true)
			System.out.println("Ent�o chamem os tecnicos!");
		else
			System.out.println("Est� liberado para decolar!");
	}

	public void status () {
		System.out.println("Este avi�o � de que empresa? " + this.empresa);
		System.out.println("Qual a idade dele? " + this.idade);
		System.out.println("Ele est� ativo? " + this.ativo);
		System.out.println("Precisa de manuten��o? " + manuten��o);
		
	}
}
