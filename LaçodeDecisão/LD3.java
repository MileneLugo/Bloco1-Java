package LaçodeDecisão;

import java.util.Scanner;

public class LD3 {

	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in); 
		
		int num1, num2, num3;
		
		System.out.println("Digite um número: ");
		num1 = ler.nextInt();
		
		System.out.println("Digite um número: ");
		num2 = ler.nextInt();
		
		System.out.println("Digite um número: ");
		num3 = ler.nextInt();
		
		if (num1 > num2 && num1 > num3)
		{
			System.out.println("O maior número é "+ num1);
		}
		else if (num2 > num1 && num2 > num3)
		{
			System.out.println("O maior número é "+ num2);
		}
		else
		{
			System.out.println("O maior número é "+ num3);
		}
		
}
}


