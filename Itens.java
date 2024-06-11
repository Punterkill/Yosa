public class Itens {
	
	private String nome;
	private int dano;
	private String rar;
	
	public Itens(String n, int d, String r) {
		this.nome = n;
		this.dano = d;
		this.rar = r;
	}
		
//get

	public String getNome() {
		return nome;
	}
	
	public int getDano() {
		return dano;
	}
	
	public String getRar() {
		return rar;
	}
	
	public String toString() {
		return "\nNome: " + this.nome + "\nDano: " + this.dano +  "\nRaridade: " + this.rar;
	}

}
