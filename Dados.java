public class Dados {
	
	private String nome;
	private int idade;
	private double tamanho;
	private String dataNasc;
	private String cor;
	
	public Dados(String nNo, int ni, double tm, String dt, String c) {
		this.nome = nNo;
		this.idade = ni;
		this.tamanho = tm;
		this.dataNasc = dt;
		this.cor = c;
	}
	
//get 
	
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public double getTamanho() {
		return tamanho;
	}
	
	public String getDataNasc() {
		return dataNasc;
	}
	public String getCor() {
		return cor;
	}

	public String toString() {
return "Nome:" + this.nome + "\nIdade: " + this.idade + "\nTamanho: " + this.tamanho + "\nData Nascimento: " + this.dataNasc + "\nCor: " + this.cor;
	}
}
