
public class Fim {

	public static void main(String[] args) {
		
	Cachorro cachorro = new Cachorro ();
	Cavalo cavalo = new Cavalo ();
	Pregui�a pregui�a = new Pregui�a ();
	
		System.out.println ("Qual o nome do cachorro?");
		cachorro.nome();
		System.out.println ("Qual a idade dele?");
		cachorro.idade();
		System.out.println ("O que est� fazendo?");
		cachorro.status();
		cachorro.somcac();
		System.out.println ("...");
		cachorro.correndo();
		
		System.out.println ("_");
		
		System.out.println ("Qual o nome do cavalo?");
		cavalo.nome();
		System.out.println ("Qual � a idade dela?");
		cavalo.idade();
		System.out.println ("O que est� fazendo?");
		cavalo.status();
		cavalo.somc();
		System.out.println ("...");
		cavalo.galopando();
		
		System.out.println ("_");
		
		System.out.println ("Qual o nome da pregui�a?");
		pregui�a.nome();
		System.out.println ("Qual a idade dele?");
		pregui�a.idade();
		System.out.println ("O que est� fazendo?");
		pregui�a.status();
		pregui�a.somp();
		System.out.println ("...");
		pregui�a.subindo();
		
		System.out.println ("_");
		
		pregui�a.statusu();
	
	}
}
