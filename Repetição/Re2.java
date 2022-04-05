package Repetição;

import java.util.*;

public class Re2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);	
		
	int num, par = 0, impar = 0, n = 0;
	
	for (n = 1; n <= 10; n++ ){
	
	System.out.println("Digite um número: ");
	num = ler.nextInt();
	
	if(num%2 == 0)
	
		par++;
	
	else
		impar++;
		
	}
	
	System.out.println("Foram digitados " + par + " números pares!");
	
	System.out.println("Foram digitados " + impar + " números ímpares!");
			
	}
}
