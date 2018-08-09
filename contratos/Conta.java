package contratos;

public interface Conta {
	public abstract void sacar(double valor);
	public abstract void depositar(double valor);
	double getSaldo();
	
	

}
