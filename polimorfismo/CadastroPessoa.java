package polimorfismo;

import java.util.LinkedList;
import java.util.List;

public class CadastroPessoa {
	private List<Pessoa> lista;
	
	public CadastroPessoa() {
		this.lista = new LinkedList<>();
	}
	
	
	public void cadastrarPessoa(Pessoa p){
		lista.add(p);
	}
	
	public void mostra(){
		for(Pessoa p : lista){
			p.mostrarDados();
		}
	}
	
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("jota", "123");
		Cliente p2 = new Cliente("runan", "312", 555);
		Gerente p3 = new Gerente("luis", "444", "121", 1, 0);
		Funcionario p4 = new Funcionario("juca", "334", "678", 90128);
		
		CadastroPessoa cad = new CadastroPessoa();
		cad.cadastrarPessoa(p1);
		cad.cadastrarPessoa(p2);
		cad.cadastrarPessoa(p3);
		cad.cadastrarPessoa(p4);
		
		cad.mostra();
	}
}
