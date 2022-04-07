package ContaBancaria;

public class ContaBancaria2 {

	public static void main(String[] args) {
		ContaBancaria1 cb = new ContaBancaria1 ();
		
		cb.dono = "Roberta Rocha";
		cb.ano = 4;
		cb.saldo = true;
		cb.limite = 1600;
		
		cb.status ();
		cb.limite ();
	}
}
