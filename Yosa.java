public class Yosa {
	
	private Dados dados;
	private Atributos atr;
	private Itens it;	
//construtor
	
	public Yosa(Dados d, Atributos at, Itens ite) {
		this.dados = d;
		this.atr = at;
		this.it = ite;
	}
	
//get
	
	public Dados getDados() {
		return dados;
	}
	
	public Atributos getAtr() {
		return atr;
	}
	
	public Itens getIt() {
		return it;
	}
	
//set
	
	public void setDados(Dados d) {
		this.dados = d;
	}
	
	public void setAtr(Atributos at) {
		this.atr = at;
	}
	
	public void setIt(Itens ite) {
		this.it = ite;
	}
	

public String toString() {
	return dados.toString() + atr.toString() + it.toString();
	}	
	
}
