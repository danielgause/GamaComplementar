import java.util.Scanner;

public class ExibeNumeros {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero, soma;

		System.out.println("Digite um número inteiro: ");
		numero = teclado.nextInt();

		soma = 0;
		System.out.println("A sequência é: ");
		while (soma <= numero) {
			System.out.println(soma);
			soma++;
		}
	}
}
