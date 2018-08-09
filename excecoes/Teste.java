package excecoes;

public class Teste {
	
	public static void main(String[] args) {
		Conta c1 = new Conta();
		c1.setNumero("1");
		c1.setSaldo(100);
		
		Conta c2 = new Conta();
		c2.setNumero("2");
		c2.setSaldo(200);
		
		Cadastro cad = new Cadastro();
		cad.add(c1);
		cad.add(c2);
		
		
		/*try {
			cad.debitar("1", 500);
			System.out.println(cad.get("1").getSaldo());
			
		} catch (ContaInexistenteException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			System.out.println("Terminou!");
		}*/
		
		try {
			cad.debitar("10", 500);
			System.out.println(cad.get("1").getSaldo());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			//e.printStackTrace();
		} 
		
		System.out.println("ola");
	}

}
