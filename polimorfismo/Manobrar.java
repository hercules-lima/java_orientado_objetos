package polimorfismo;

public class Manobrar {
	
	public void manobrar(Automovel a){
		a.estacionar();
	}
	
	public static void main(String[] args) {
		Carro a = new Carro("VW");
		Moto b = new Moto("volks", "azul", 123);
		Manobrar aux = new Manobrar();
		Moto c = new Moto("vasdolks", "azul", 123);
		Moto d = new Moto("vasdasdolks", "azul", 123);
		
		aux.manobrar(a);
		aux.manobrar(b);
		
		System.out.println(b.nro());
		
	}
}
