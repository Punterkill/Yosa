public class Atributos {
	
	private double velocidade;
	private int pulo;
	private int corrida;
	private int vida;

	public Atributos(double vl, int p, int c, int v) {
		this.velocidade = vl;
		this.pulo = p;
		this.corrida = c;
		this.vida = v;
	}
	
//get 
	
	public double getVelocidade() {
		return velocidade;
	}
	
	public int getPulo() {
		return pulo;
	}
	
	public int getCorrida() {
		return corrida;
	}
	
	public String toString() {
		return "\nVelocidade: " + this.velocidade + "\nPulo: " + this.pulo + "\nCorrida: " + this.corrida + "\nVida: " + this.vida;
	}
}
