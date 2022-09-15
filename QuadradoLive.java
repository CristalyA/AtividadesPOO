package POO;

public class QuadradoLive extends BaseFiguraLive implements FigurasLive {
	
	QuadradoLive(double lado, String nome){
		
		super (lado,lado,nome);
		nomeClasse = "Quadrado";
			
	}
	
	@Override
	
	public double getDiagonal() {
		return Math.sqrt(2)*lado1;
	}
	

}
