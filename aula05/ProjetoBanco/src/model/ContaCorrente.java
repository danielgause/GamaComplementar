package model;

public class ContaCorrente extends Conta {

	public ContaCorrente(int numeroConta, double saldo) {
		super(numeroConta, saldo);
	}

public boolean sacar(double valor) {
return super.sacar(valor);
}

}

