package Cliente;

public class Cliente1 {

	boolean fidelidade;
	String nome;
	int idade, avalia��o;
	
	public void cupom () {
		if(avalia��o < 30)
			System.out.println("Cliente poder� concorrer a cupons de desconto!");
		else
			System.out.println("Cliente n�o poder� concorrer a cupons de desconto.");
	}

	public void fidelidade () {
		if (fidelidade == true)
			System.out.println("O cliente ganhou cupons de desconto sem valor minimo!");
		else
			System.out.println("O cliente n�o ganhou cupons.");
	}
	
	public void status () {
		System.out.println("O nome do cliente �: " + this.nome);
		System.out.println("A idade do cliente �: " + this.idade);
		System.out.println("O cliente possue " + this.avalia��o + " avalia��es");
		System.out.println("Ele pode concorrer ao cupom fidelidade? " + this.fidelidade);
	}
	
}
