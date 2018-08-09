package polimorfismo;

public class Carro extends Automovel{
	private String marca;

	public Carro() {
		// TODO Auto-generated constructor stub
	}
	
	public Carro(String marca){
		super("folks", 333);
		this.marca = marca;
	}
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public void estacionar() {
		System.out.println("Estacionar carro.");
		
	}
	

}
