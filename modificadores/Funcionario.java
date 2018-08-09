package modificadores;

public class Funcionario {
	
	private String nome;
	public static double pisoSalarial;
	
	public static void setPesoSalarial(double pisoSalarial){
		Funcionario.pisoSalarial = pisoSalarial;
	}
	
	public static void reajustePiso(double taxa){
		Funcionario.pisoSalarial = Funcionario.pisoSalarial + Funcionario.pisoSalarial * (taxa/100);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public static void main(String[] args) {
		Funcionario.pisoSalarial = 1000;
		
		Funcionario f = new Funcionario();
		
		Funcionario.reajustePiso(10);
		
		
		System.out.println(Funcionario.pisoSalarial);
	}
	

}
