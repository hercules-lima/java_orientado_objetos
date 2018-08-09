package contratos;

public class ContaCorrente implements Conta{
	
	private double saldo;
	private double taxa;
	
	public ContaCorrente(double saldo, double taxa){
		this.saldo = saldo;
		this.taxa = 10;
	}
	
	public ContaCorrente(double saldo) {
		this.saldo = saldo;
		this.taxa = 1;
	}

	@Override
	public void sacar(double valor) {
		this.saldo = this.saldo - valor -this.taxa;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor - this.taxa;
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getSaldo() {
		this.saldo -= this.taxa;
		return this.saldo;
	}
	

}
