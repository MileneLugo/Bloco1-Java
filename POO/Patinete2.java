package Patinete;

public class Patinete2 {

	public static void main(String[] args) {
		Patinete1 pat = new Patinete1 ();
		
		pat.ano = 1978; 
		pat.antigodono = "O pai";
		pat.novodono = "O filho";
		pat.manuten��o = true;
		
		pat.status ();
		pat.manuten��o ();
	}
}
