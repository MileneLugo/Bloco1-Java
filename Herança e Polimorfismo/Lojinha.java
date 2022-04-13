package Lojinha;

import java.util.ArrayList;

public class Lojinha {

	public static void main (String[] args) {
		
		ArrayList<String> calçados = new ArrayList<>();
		
		String produto1 = "tenis";
		String produto2 = "sapatos";
		String produto3 = "botas";
		String produto4 = "sapatilhas";
		
		calçados.add(produto1);
		calçados.add(produto2);
		calçados.add(produto3);
		calçados.add(produto4);
		
		System.out.println(" Aqui na lojinha temos apenas um par de cada calçado sobrando. São eles:  " + calçados);
		
		calçados.remove(2);
		calçados.remove(0);
		
		System.out.println(" Vieram compradores e lavaram os calçados tenis e bota. Sobraram apenas:" + calçados);
		
		calçados.add(produto1);
		
		System.out.println(" No dia seguinte, reporam o estoque de quase todos os calçados, menos o de botas. Logo, temos na lojinha: " + calçados);
		
		
	}
	
}
