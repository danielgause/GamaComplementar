import java.util.Scanner;

public class MargemSalarial {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	Double salario, prestacao, margem;
	System.out.println("Digite seu sal�rio: ");
	salario = teclado.nextDouble();
	System.out.println("Digite a presta��o desejada: ");
	prestacao = teclado.nextDouble();
margem = salario*30/100;
if (prestacao <= margem) {
System.out.println("Seu impr�stimo foi aprovado!");
}
else {
	System.out.println("Infelizmente seu impr�stimo foi negado.");
}
}
}
