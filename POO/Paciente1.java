package Paciente;

public class Paciente1 {

	boolean exames;
	String nome, sexo, sintomas;
	int idade;
	
	public void exames () {
		if (exames == true)
			System.out.println("Já há o necessário para um diagnóstico!");
		else
			System.out.println("Pedir mais exames.");
	}
	
	public void status () {
		System.out.println("O nome do paciente é: " + this.nome);
		System.out.println("O paciente tem: " + this.idade + " anos");
		System.out.println("O sexo do paciente é: " + this.sexo);
		System.out.println("O paciente apresenta sintomas de: " + this.sintomas);
		System.out.println("Já temos exames o suficiente? " + this.exames);
	}
}
