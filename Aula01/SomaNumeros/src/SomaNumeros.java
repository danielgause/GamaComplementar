import java.util.Scanner;

public class SomaNumeros {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero, contador, soma;
		System.out.println("Digite um n�mero");
		numero = teclado.nextInt();
		contador = numero;
		while (numero != 0) {
			System.out.println("Por favor, digite um n�mero");
			numero = teclado.nextInt();
			contador = contador + numero;
		}
		soma = contador;
		System.out.println("A soma dos n�meros digitados �: " + soma);

	}
}
