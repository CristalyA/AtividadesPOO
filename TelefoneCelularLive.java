package POO;

public class TelefoneCelularLive  extends TelefoneLive {
	
	public TelefoneCelularLive () {
		super("Celular");
		
	}
	@Override
	
	public void toca(int codigoToque) {
		switch(codigoToque) {
		case 1: 
			System.out.println("Trimmmmm ... Trimmmm");
			break;
		case 2:
			System.out.println("Plinn...plinnn");
			break;
			default:
					System.out.println("Trummmm...trummmm");
		}
	}	
	
	@Override
	public void disca(String numero) {
		
	}
}
