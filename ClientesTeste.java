package POO;

public class ClientesTeste {
	
	public static void main(String[] args) {
		
		Clientes cliente1 = new Clientes("Cristaly",25,"1209",1997,"448773");
		Clientes cliente2 = new Clientes("Mari",30,"20/09",1991,"773319");
		
		cliente1.imprimirDados();
		cliente2.imprimirDados();
		
	}

}
