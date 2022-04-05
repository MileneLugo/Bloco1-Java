package LaçodeDecisão;

import java.util.Scanner;

public class LD1 {
	
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in); 
		
		int num;
		
		System.out.print("Digite um número: ");
		num = ler.nextInt();
		
		if (num%2 == 0)
		{
		
			System.out.println("O número é par e sua raiz quadrada é "+ Math.sqrt(num));
		}
		else 
		{
			System.out.println("O número é impar e seu valor elevado ao quadradro é "+ num*num );
		}
		
		
	}
}
