package model;

public class Conta {

	private int numConta;
	private String nomeCliente;
	private double saldo;

	public Conta() {
		super();
	}
	
	public int hashCode() {
		return (numConta % 10);
	}
	
	public Conta(int numConta, String nomeCliente, double saldo) {
		this.numConta = numConta;
		this.nomeCliente = nomeCliente;
		this.saldo = saldo;
	}
	
	@Override
	public String toString() {
		return "Conta [numConta=" + numConta + ", nomeCliente=" + nomeCliente + ", saldo=" + saldo + "]";
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
