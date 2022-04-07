package Cliente;

public class Cliente2 {

	public static void main(String[] args) {
		Cliente1 cl = new Cliente1 ();
		
		cl.nome = "Antônio Moraes";
		cl.idade = 24;
		cl.avaliação = 35; 
		cl.fidelidade =	true;
		
		cl.status ();
		cl.fidelidade ();
		
	}
}
