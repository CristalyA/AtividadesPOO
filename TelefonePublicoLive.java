package POO;

public class TelefonePublicoLive extends TelefoneLive {
	
	public TelefonePublicoLive() {
		super("Publico");
	}
	
	@Override
	public void toca(int numToque) {
		for (int i=0;i<numToque;i++) {
			System.out.println("\nPriripirinpiririn ...");
		}
	}
	@Override
	public void disca(String numero) {
		if(numero.charAt(0)== '9' || numero.charAt(0) == '8') {
			System.out.println("\nEste telefone não liga para celular");
			
		}
		else {
			System.out.println("\n");
		}
		
			
	}

}
