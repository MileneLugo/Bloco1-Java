package Paciente;

public class Paciente1 {

	boolean exames;
	String nome, sexo, sintomas;
	int idade;
	
	public void exames () {
		if (exames == true)
			System.out.println("J� h� o necess�rio para um diagn�stico!");
		else
			System.out.println("Pedir mais exames.");
	}
	
	public void status () {
		System.out.println("O nome do paciente �: " + this.nome);
		System.out.println("O paciente tem: " + this.idade + " anos");
		System.out.println("O sexo do paciente �: " + this.sexo);
		System.out.println("O paciente apresenta sintomas de: " + this.sintomas);
		System.out.println("J� temos exames o suficiente? " + this.exames);
	}
}
