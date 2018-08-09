package excecoes;

import java.util.ArrayList;
import java.util.List;

public class Cadastro {
	List<Conta> listaContas;
	
	public Cadastro() {
		this.listaContas = new ArrayList<Conta>();
	}
	
	public void add(Conta conta) {
		this.listaContas.add(conta);
	}
	
	public Conta get(String numero) {
		Conta conta = null;
		for (Conta c : this.listaContas) {
			if (c.getNumero().equals(numero))
				conta = c;
		}
		return conta;
	}
	
	public Conta debitar(String numero, double valor) throws ContaInexistenteException, SaldoInsuficienteException {
		Conta conta = get(numero);
		if (conta != null)
		   conta.debitar(valor);
		else 
			throw new ContaInexistenteException();
		return conta;
	}

}

