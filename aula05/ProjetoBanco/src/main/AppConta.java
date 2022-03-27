package main;

import java.util.Scanner;

import controler.GerenciaContas;
import model.Conta;
import model.ContaCorrente;
import model.ContaEspecial;

public class AppConta {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		GerenciaContas contas = new GerenciaContas();
		int opicao = 0;
		int numeroConta;
		double saldo;
		double limite;
		String entrada;
		Conta c;

		while (opicao != 6) {
			System.out.println("Seja bem vindo, agora escolha uma das op��es de nosso menu.");
			System.out.println("Digite 1 para criar conta.");
			System.out.println("Digite 2 para buscar uma conta.");
			System.out.println("Digite 3 para realizar um saque.");
			System.out.println("Digite 4 para realizar um dep�sito.");
			System.out.println("Digite 5 para excluir uma conta.");
			System.out.println("Digite 6 para encerrar!");
			entrada = teclado.nextLine();
			opicao = Integer.parseInt(entrada);

			switch (opicao) {
			case 1:
				System.out.println(
						"Informe qual tipo de conta. Tecle um para conta corrente, 2 para conta especial. Tecle 3 para voltar ao menu anterior.");
				entrada = teclado.nextLine();
				int tipoConta = Integer.parseInt(entrada);

				switch (tipoConta) {
				case 1:
					System.out.println("Informe o n�mero da conta.");
					entrada = teclado.nextLine();
					numeroConta = Integer.parseInt(entrada);
					System.out.println("Informe o saldo.");
					entrada = teclado.nextLine();
					saldo = Float.parseFloat(entrada);
					c = new ContaCorrente(numeroConta, saldo);
					contas.adicionar(c);
					System.out.println("Conta cadastrada com sucesso");
					break;

				case 2:
					System.out.println("Informe o n�mero da conta.");
					entrada = teclado.nextLine();
					numeroConta = Integer.parseInt(entrada);
					System.out.println("Informe o saldo.");
					entrada = teclado.nextLine();
					saldo = Float.parseFloat(entrada);
					System.out.println("Informe o limite da conta.");
					entrada = teclado.nextLine();
					limite = Float.parseFloat(entrada);
					c = new ContaEspecial(numeroConta, saldo, limite);
					contas.adicionar(c);
					System.out.println("Conta cadastrada com sucesso");
					break;

				case 3:
					break;

				default:
					System.out.println("Tipo de conta inv�lida.");
					break;
				}
				break;

			case 2:
				System.out.println("Por favor, informe o n�mero da conta que deseja pesquisar.");
				entrada = teclado.nextLine();
				numeroConta = Integer.parseInt(entrada);
				System.out.println(contas.exibir(numeroConta));
				break;

			case 3:
				System.out.println("Informe o n�mero da conta.");
				entrada = teclado.nextLine();
				numeroConta = Integer.parseInt(entrada);
				System.out.println("Por favor, informe o valor que deseja sacar.");
				entrada = teclado.nextLine();
				saldo = Float.parseFloat(entrada);
				if (contas.sacar(numeroConta, saldo)) {
					System.out.println("Saque realizado com sucesso.");
				} else {
					System.out.println("N�o foi poss�vel realizar a opera��o solicitada.");
				}
				break;

			case 4:
				System.out.println("Informe o n�mero da conta.");
				entrada = teclado.nextLine();
				numeroConta = Integer.parseInt(entrada);
				System.out.println("Por favor, informe o valor que deseja depositar.");
				entrada = teclado.nextLine();
				saldo = Float.parseFloat(entrada);
				if (contas.depositar(numeroConta, saldo)) {
					System.out.println("Dep�sito realizado com sucesso.");
				} else {
					System.out.println("N�o foi poss�vel realizar a opera��o solicitada.");
				}
				break;

			case 5:
				System.out.println("Informe o n�mero da conta a ser removida.");
				entrada = teclado.nextLine();
				numeroConta = Integer.parseInt(entrada);
				boolean removeu = contas.remover(numeroConta);
				if (removeu) {
					System.out.println("Conta removida com sucesso.");
				} else {
					System.out.println("N�o foi poss�vel remover a conta solicitada.");
				}
				break;

			case 6:
				System.out.println("Opera��o finalizada com sucesso.");
				break;
			default:
				System.out.println("Op��o inv�lida.");
				break;
			}
		}
		teclado.close();
	}

}
