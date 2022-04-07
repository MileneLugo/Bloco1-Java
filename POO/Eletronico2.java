package Eletronico;

public class Eletronico2 {

	public static void main(String[] args) {
	Eletronico1 El = new Eletronico1();
	
	El.avaliação = 4;
	El.gasto = false;
	El.pilhas = false;
	El.tomada = true;
	
	El.status ();
	El.tomada ();
	
	}
}
