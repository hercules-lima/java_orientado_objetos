package classeabstrata;

public class Principal {
	public static void main(String[] args) {
		//FormaBidimencional f = new FormaBidimencional();
		Chefe circ = new Chefe();
		circ.setNome("Douglas");
		circ.setSalario(3);
		
		//double d = circ.ganha();
		
		System.out.println(circ);
		
		FormaBidimencional f = new Circulo();
		System.out.println(f);
		
		
		
	}
}
