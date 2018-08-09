package classeabstrata;

public abstract class Empregado {
	private String nome;

	@Override
	public String toString() {
		return "Empregado [nome=" + nome + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public abstract double ganha();

}
