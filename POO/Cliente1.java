package Cliente;

public class Cliente1 {

	boolean fidelidade;
	String nome;
	int idade, avaliação;
	
	public void cupom () {
		if(avaliação < 30)
			System.out.println("Cliente poderá concorrer a cupons de desconto!");
		else
			System.out.println("Cliente não poderá concorrer a cupons de desconto.");
	}

	public void fidelidade () {
		if (fidelidade == true)
			System.out.println("O cliente ganhou cupons de desconto sem valor minimo!");
		else
			System.out.println("O cliente não ganhou cupons.");
	}
	
	public void status () {
		System.out.println("O nome do cliente é: " + this.nome);
		System.out.println("A idade do cliente é: " + this.idade);
		System.out.println("O cliente possue " + this.avaliação + " avaliações");
		System.out.println("Ele pode concorrer ao cupom fidelidade? " + this.fidelidade);
	}
	
}
