package polimorfismo;


public class Gerente extends Funcionario {
	private int area;
	
	public Gerente(String nome, String cpf, String matricula, double salario, int area) {
		super(nome, cpf, matricula, salario);
		this.area = area;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	@Override
	public void mostrarDados() {
		super.mostrarDados();
		System.out.println("Area: " + this.area);
	}
}
