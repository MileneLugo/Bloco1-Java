package ContaBancaria;

public class ContaBancaria1 {

	boolean saldo;
	String dono;
	int ano, limite;
	
	public void saldo () {
		if (saldo == true)
			System.out.println("Você possue saldo!");
		else
			System.out.println("Você não possue saldo.");
	}
	
	public void limite () {
		if (saldo == true && ano > 2)
			System.out.println("Você pode receber um aumento de limite!");
		else
			System.out.println("Você não receberá um aumento de limite.");
	}
	
	public void status () {
		System.out.println("O nome do dono desta conta é: " + this.dono);
		System.out.println("Possue esta conta bancaria há " + this.ano + " anos");
		System.out.println("Possue saldo na conta? " + this.saldo);
		System.out.println("Seu limite é de: " + this.limite + " reais");
	}
}
