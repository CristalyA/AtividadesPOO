package POO;

public class Clientes { //atributos
	
	private String name;
	private int age;
	private String id;
	private int count;
	private String cpf;
	
	public Clientes(String name, int age, String id, int count, String cpf) {//Construtor-paramentros-argumentos
		this.name = name;
		this.age = age;
		this.id = id;
		this.count = count;
		this.cpf = cpf;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void imprimirDados() {
		System.out.println("\nNome é : "+name+"\nIdade é: "+age+
	 "\nIdentificação : "+id+"\nNúmero da conta : "+count+"\nCPF :"+cpf);
	}
	
}

