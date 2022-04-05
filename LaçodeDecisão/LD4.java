package LaçodeDecisão;

import java.util.Scanner;

public class LD4 {

public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int idade;
		
		System.out.print("Digite a idade: ");
		idade = ler.nextInt();
		
		if(idade > 9 && idade < 15)
		{
			System.out.println("Esta idade se encaixa na categoria 'Infantil'");
		}
		else if(idade > 14 && idade < 18)
		{
			System.out.println("Esta idade se encaixa na categoria 'Juvenil'");
		}
		else if(idade > 17 && idade < 26)
		{
			System.out.println("Esta idade se encaixa na categoria 'Adulto'");
		}
		else 
		{
			System.out.println("Idade Invalida");
		}
		
		
	}
	
	
	
}


