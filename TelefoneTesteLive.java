package POO;

public class TelefoneTesteLive {

	public static void main(String[] args) {
		
		TelefoneCelularLive celular = new TelefoneCelularLive();
		TelefoneFixoLive fixo = new TelefoneFixoLive();
		TelefonePublicoLive publico = new TelefonePublicoLive();
		
		TelefoneLive telefone = null;
		
		int n = (int) (Math.random()*3.0);
		System.out.println("\nO número é : "+n);
		
		switch (n) {
		case 0: telefone = celular;break;
		case 1: telefone = fixo;break;
		case 2: telefone = publico;break;
		default:System.out.println("\nErro inesperado ...");
		
		}
		
		if(telefone != null) {
			
			telefone.disca("92324544");
			telefone.toca(2);
		}
		
	}

}
