package POO;

public class RetanguloLive extends BaseFiguraLive implements FigurasLive {
	
	RetanguloLive (double lado1, double lado2, String nome){
		super(lado1,lado2,nome);
		nomeClasse = "RetanguloLive";
	}
	@Override
	
	public double getDiagonal(){
		return Math.sqrt(Math.pow(lado1,2)+Math.pow(lado2,2));
	}
	
	
	

}
