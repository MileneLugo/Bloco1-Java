package ContaBancaria;

public class ContaBancaria1 {

	boolean saldo;
	String dono;
	int ano, limite;
	
	public void saldo () {
		if (saldo == true)
			System.out.println("Voc� possue saldo!");
		else
			System.out.println("Voc� n�o possue saldo.");
	}
	
	public void limite () {
		if (saldo == true && ano > 2)
			System.out.println("Voc� pode receber um aumento de limite!");
		else
			System.out.println("Voc� n�o receber� um aumento de limite.");
	}
	
	public void status () {
		System.out.println("O nome do dono desta conta �: " + this.dono);
		System.out.println("Possue esta conta bancaria h� " + this.ano + " anos");
		System.out.println("Possue saldo na conta? " + this.saldo);
		System.out.println("Seu limite � de: " + this.limite + " reais");
	}
}
