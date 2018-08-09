package classeabstrata;

public class Circulo extends FormaBidimencional {
	private double raio;
	
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI * this.raio * this.raio;
	}


	@Override
	public String toString() {
		return super.toString() + "\nArea: " + this.area();
	}


	public double getRaio() {
		return raio;
	}


	public void setRaio(double raio) {
		this.raio = raio;
	}

}
