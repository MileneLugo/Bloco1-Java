package Avião;

public class Avião2 {

	public static void main(String[] args) {
	Avião1 Av = new Avião1();
	
	Av.empresa = "Gol";
	Av.idade = 12;
	Av.ativo = true;
	Av.manutenção = true;

	Av.status ();
	Av.manutenção ();
	
	}
}
