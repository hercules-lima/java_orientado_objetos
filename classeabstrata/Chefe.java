package classeabstrata;

public class Chefe extends Empregado{
	private double salario;

	@Override
	public String toString() {
		return super.toString() + "Chefe [salario=" + salario + "]";
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public double ganha() {
		return this.salario;
	}
	
	

}
