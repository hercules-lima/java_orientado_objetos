package classeabstrata;

public abstract class FormaBidimencional {
	
	private int lados;
	

	public int getLados() {
		return lados;
	}

	public void setLados(int lados) {
		this.lados = lados;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Numero de lados: " + this.lados;
	}
	
	public abstract double area();
	
}
