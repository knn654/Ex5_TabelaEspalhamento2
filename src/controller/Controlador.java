package controller;

import model.Conta;
import model.Lista;

public class Controlador {

	Lista[] tabelaEspalhamento;

	public Controlador() {
		tabelaEspalhamento = new Lista[2];

		for (int i = 0; i < 2; i++) {
			tabelaEspalhamento[i] = new Lista();
		}
	}

	public void inserir(Conta conta) throws Exception {
		Lista l = tabelaEspalhamento[conta.hashCode()];
		l.addLast(conta);
	}

	public void consultar(Conta conta) {

	}

	public Conta remover(Conta conta) throws Exception {
		Lista l = tabelaEspalhamento[conta.hashCode()];
		int tamanho = l.size();
		
		for (int i = 0; i < tamanho; i++) {
			Conta c = (Conta) l.get(i);
			if(c.getNumConta() == conta.getNumConta()) {
				if (c.getNomeCliente().equals(conta.getNomeCliente())){
					return c;
				}
			}
		}
		return null;
	}

}
