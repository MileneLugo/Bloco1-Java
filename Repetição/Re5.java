package Repetição;

import java.util.Scanner;

public class Re5 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
	int num, soma = 0;
	
	System.out.println("Digite um número: ");
	num = ler.nextInt();
	
	do {
		soma = soma + num;
		System.out.println("Digite mais um número('0' para encerrar): ");
		num = ler.nextInt();
	} while (num != 0); 
		
	System.out.println("A soma dos número digitados é: " + soma);
	
	}
	
}
