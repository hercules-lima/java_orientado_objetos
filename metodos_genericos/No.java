package metodos_genericos;

public class No {
	private int valor;
	private No prox;
	
	No(int valor){
		this.valor = valor;
	}
	
	public int getValor() {
		return valor;
	}
	
	@Override
	public String toString() {
		return valor+"";
	}
	
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public No getProx() {
		return prox;
	}
	
	public void setProx(No prox) {
		this.prox = prox;
	}
	
	

}
