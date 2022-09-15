package POO;

public class Cavalo extends Animais {
	
	private String cor;
	private int altura;
	
	public Cavalo(String nome, int idade, String cor, int altura) {
		super (nome,idade);
		
		this.cor = cor;
		this.altura = altura;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public void correr() {
		
	}
	
	public void relinchar() {
		
		System.out.println("\nRelinchar !");
	}
	

}
