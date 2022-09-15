package POO;

public class Preguica extends Animais {
	
	private String tamanho;
	private String cor;
	
	public Preguica(String nome, int idade, String tamanho, String cor) {
		super(nome, idade);
		this.tamanho = tamanho;
		this.cor = cor;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void subirArvore() {
		
	}
	
	public void balir () {
		System.out.println("Bocejo !");
	}
	

}
