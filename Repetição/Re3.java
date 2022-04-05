package Repetição;

import java.util.Scanner;

public class Re3 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int idade, me21 = 0, ma50 = 0;
		
		System.out.println("Digite uma idade: ");
		idade = ler.nextInt();
		
		while (idade != -99) {
			
			if (idade < 21) {
			me21++;}
			if (idade > 50) {
			ma50++;}
			
			System.out.println("Digite mais uma idade ('-99' para encerar): ");
			idade = ler.nextInt();
			
		}
		
		System.out.println("Pessoas com menos de 21 anos: " + me21);
		System.out.println("Pessoas com mais de 50 anos: " + ma50);
}
}