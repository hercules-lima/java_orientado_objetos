package coleçoes;


public class Aluno implements Comparable<Aluno>{
	private int matricula;
	private String nome;
	
	public Aluno(){}
	
	public Aluno(int m, String n) {
		this.matricula = m;
		this.nome = n;
	}
	
	@Override
	public String toString() {
		return this.matricula + ", " + this.nome ;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int compareTo(Aluno a) {
		/*if(this.matricula < a.matricula){
		return -1;	
		}else if(this.matricula == a.matricula){
			return 0;
		}
		return 1;*/
		return this.nome.compareTo(a.getNome());
	}

}
