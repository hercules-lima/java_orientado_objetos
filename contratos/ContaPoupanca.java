package contratos;

public class ContaPoupanca implements Conta{

	private double saldo;
	
	public ContaPoupanca(double saldo){
		this.saldo = saldo;
	}
	

	@Override
	public void sacar(double valor) {
		this.saldo -= valor;
		
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getSaldo() {
		return this.saldo;
	}

}
