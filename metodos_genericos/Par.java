package metodos_genericos;

import coleçoes.Aluno;

public class Par <E, F>{
	private E primeiro;
	private F segundo;
	
	public Par(E p, F s){
		this.primeiro = p;
		this.segundo = s;
	}

	public E getPrimeiro(){
		return primeiro;
	}
	
	public F getSegundo(){
		return segundo;
	}
	
	public void setPrimeiro(E p){
		this.primeiro = p;
	}
	
	public void setSegundo(F s){
		this.segundo = s;
	}
	
	@Override
	public String toString() {
		return primeiro + ", " +  segundo;
	}
	
	public static void main(String[] args) {
		Par<Integer, String> par1 = new Par<Integer, String>(1, "cuca");
		par1.setPrimeiro(10);
		System.out.println(par1);
		
		Par<Aluno, Double> par2 = new Par<Aluno, Double>(new Aluno(1, "Maria"), (double)12);
		
		System.out.println(par2);
		
		
		
		
	}

	
	
}
