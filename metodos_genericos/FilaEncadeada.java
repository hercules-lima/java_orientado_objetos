package metodos_genericos;

public class FilaEncadeada implements Fila {
	private No inicio, fim;

	@Override
	public void add(int valor) {
		No novo = new No(valor);
		
		if(isEmpty()){
			inicio = novo;
			fim = novo;
		}
		else{
			fim.setProx(novo);
			fim = novo;
		}

	}

	@Override
	public void mostra() {
		No aux = inicio;
		while(aux != null){
			System.out.print(aux + " ");
			aux = aux.getProx();
		}
		
		System.out.println();
		
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isEmpty() {
		return ((inicio == null) && (fim==null))? true : false;
	}

	@Override
	public No remove() {
		No aux = inicio;
		if(!isEmpty()){
			
			if(inicio.getValor() == fim.getValor()){
				inicio = null;
				fim = null;
			}
			else{
				inicio = inicio.getProx();
				//inicio = aux;
			}
		}
		return aux;
	}
	
	public static void main(String[] args) {
		Fila f = new FilaEncadeada();
		System.out.println(f.isEmpty());
		
		f.add(1);
		f.add(2);
		f.add(3);
		
		f.mostra();
		f.remove();
		f.mostra();
		f.remove();
		f.mostra();
		f.remove();
		f.remove();
		
		
		
	}

}
