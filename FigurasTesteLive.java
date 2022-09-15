package POO;

public class FigurasTesteLive {

	public static void main(String[] args) {
		
		QuadradoLive fig1 = new QuadradoLive (10,"Quadrado 1");
		RetanguloLive fig2 = new RetanguloLive(3,4,"Retangulo 1");
		
		System.out.println("\n"+fig1.getNome()+" : "+fig1.getDiagonal());
		System.out.println("\n"+fig2.getNome()+" : "+fig2.getDiagonal());
		

	}

}
