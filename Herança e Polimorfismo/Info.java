
public class Info {

	private String nome, som, status;
	private int idade;
	
	public String getnome() {
		return nome;
	}
	
	public void setnome (String nome) {
		this.nome = nome;
	}
	
	public String getsom() {
		return som;
	}
	
	public void setsom (String som) {
		this.som = som;
	}
	
	public void somc() {
		System.out.println ("'Iiiiiirí!'");
	}
	
	public void somcac() {
		System.out.println ("'Au au au!'");
	}
	
	public void somp() {
		System.out.println ("'ZzZzZz...'");
	}
	
	public int getidade() {
		return idade;
	}
	
	public void setidade (int idade) {
		this.idade = idade;
	}
	
	public String getstatus() {
		return status;
	}
	
	public void setstatus(String status) {
		this.status = status;
	}
	
	public void statusu() {
		System.out.println ("Todos os animais sumiram!");
	}
	
}

