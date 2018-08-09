package polimorfismo;


public class Funcionario extends Pessoa {
	private String matricula;
	private double salario;

	public Funcionario(String nome, String cpf, String matricula, double salario) {
		super(nome, cpf);
		this.matricula = matricula;
		this.salario = salario;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	@Override
	public void mostrarDados() {
		super.mostrarDados();
		System.out.println("Matricula: " + this.matricula + "\nSalario: " + this.salario );
	}

}
