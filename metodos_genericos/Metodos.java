package metodos_genericos;

import coleçoes.Aluno;

public class Metodos {
	
	public static <E extends Comparable<E>> E maior(E v1, E v2){
		
		
		return (v1.compareTo(v2) > 0)? v1 : v2;
		
	}
	
	public static <E> void imprime(E vetor[]){
		for(E i : vetor)
			System.out.print(i + " ");
		System.out.println();
	}
	public static void main(String[] args) {
		Integer c1[] = {1, 2, 3, 4, 5};
		imprime(c1);
		String v2[] = {"galo", "time", "ruim"};
		imprime(v2);
		
		String s = maior("f", "h");
		System.out.println(s);
		
		
		Aluno a = maior(new Aluno(1, "Maria"), new Aluno(2, "Joao"));
		System.out.println(a);
		
		
		
		
	}

}
