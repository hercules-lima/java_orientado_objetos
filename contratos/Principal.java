package contratos;

public class Principal {
	public static void main(String[] args) {
		ContaCorrente c1 = new ContaCorrente(1000);
		
		
		ContaPoupanca c2 = new ContaPoupanca(1000);
		
		GeradorDeExtratos gerador = new GeradorDeExtratos();
		
		gerador.gerarExtrato(c1);
		gerador.gerarExtrato(c2);
	}

}
