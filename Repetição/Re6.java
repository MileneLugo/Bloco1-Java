package Repetição;

import java.util.Scanner;

public class Re6 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int num, soma = 0;
		float media = 0, nums = 0;
		
		System.out.println("Digite um número: ");
		num = ler.nextInt();
		
		do {
			if (num%3 == 0) {
			soma = soma + num;
			nums++;
			}
			System.out.println("Digite mais um número ('0' para encerrar): ");
			num = ler.nextInt();
		} while (num != 0); 
		
		media = soma/nums;
			
		System.out.println("A média dos número digitados é: " + media);
	}
}
