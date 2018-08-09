package polimorfismo;

public abstract class Automovel {
	private String cor;
	private int placa;
	
	public abstract void estacionar();

	public Automovel() {
		// TODO Auto-generated constructor stub
	}
	
	public Automovel(String cor, int placa){
		this.cor = cor;
		this.setPlaca(placa);
	}
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getPlaca() {
		return placa;
	}

	public void setPlaca(int placa) {
		this.placa = placa;
	}

}
