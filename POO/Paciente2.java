package Paciente;

public class Paciente2 {

	public static void main(String[] args) {
		Paciente1 pac = new Paciente1 ();
		
		pac.nome = "Luana Pinheiro";
		pac.idade = 27;
		pac.sexo = "Feminino";
		pac.sintomas = "Pneumonia";
		pac.exames = false;
		
		pac.status ();
		pac.exames ();
	}
	
}
