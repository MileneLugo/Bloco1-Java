
public class Fim {

	public static void main(String[] args) {
		
	Cachorro cachorro = new Cachorro ();
	Cavalo cavalo = new Cavalo ();
	Preguiça preguiça = new Preguiça ();
	
		System.out.println ("Qual o nome do cachorro?");
		cachorro.nome();
		System.out.println ("Qual a idade dele?");
		cachorro.idade();
		System.out.println ("O que está fazendo?");
		cachorro.status();
		cachorro.somcac();
		System.out.println ("...");
		cachorro.correndo();
		
		System.out.println ("_");
		
		System.out.println ("Qual o nome do cavalo?");
		cavalo.nome();
		System.out.println ("Qual é a idade dela?");
		cavalo.idade();
		System.out.println ("O que está fazendo?");
		cavalo.status();
		cavalo.somc();
		System.out.println ("...");
		cavalo.galopando();
		
		System.out.println ("_");
		
		System.out.println ("Qual o nome da preguiça?");
		preguiça.nome();
		System.out.println ("Qual a idade dele?");
		preguiça.idade();
		System.out.println ("O que está fazendo?");
		preguiça.status();
		preguiça.somp();
		System.out.println ("...");
		preguiça.subindo();
		
		System.out.println ("_");
		
		preguiça.statusu();
	
	}
}
