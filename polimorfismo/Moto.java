package polimorfismo;

public class Moto extends Automovel {
	
	private String marco;
	public static int n;
	
	public Moto() {
		// TODO Auto-generated constructor stub
	}
	
	public Moto(String marco, String cor, int placa){
		super(cor, placa);
		this.marco = marco;
		Moto.n++;
		
	}
	
	public int nro(){
		return Moto.n;
	}
	
	@Override
	public void estacionar(){
		System.out.println("Estacionando moto.\n");
		
	}

	public String getMarco() {
		return marco;
	}

	public void setMarco(String marco) {
		this.marco = marco;
	}
	

}
