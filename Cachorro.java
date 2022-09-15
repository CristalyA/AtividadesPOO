package POO;

public class Cachorro extends Animais {
	
	private String raca ;
	private String porte;
	private int orelha;
	
	public Cachorro(String nome, int idade, String raca,String porte, int orelha) {
		super(nome,idade);
		this.raca = raca;
		this.porte = porte;
		this.orelha = orelha;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	public int getTipoOrelha() {
		return orelha;
	}

	public void setTipoOrelha(int orelha) {
		this.orelha = orelha;
	}
	
	public void correr() {
		
	}
	public void latir() {
		System.out.println("\nLatido !");
	}
}
