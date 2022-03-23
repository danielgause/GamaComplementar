package model;

public class ContaEspecial extends Conta {
	private String tipoConta;
	private double limite;
	public ContaEspecial(int numeroConta, double saldo, String tipoConta, double limite) {
		super(numeroConta, saldo);
		this.tipoConta = tipoConta;
		this.limite = limite;
	}

	public boolean sacar(double valor) {
		if (limite + super.getSaldo() > valor) {
			return false;
		} else {
			super.sacar(valor);
			return true;
		}
	}

	@Override
	public String toString() {
		return tipoConta + " - " + super.toString() + " - " + limite;
	}

	public String getTipoConta() {
		return tipoConta;
	}

	public double getLimite() {
		return limite;
	}
}
