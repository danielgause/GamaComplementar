import java.util.Scanner;

public class MediaSimples {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Double nota1, nota2, media;
		System.out.println("Digite a primeira nota: ");
		nota1 = teclado.nextDouble();
		System.out.println("Digite a segunda nota: ");
		nota2 = teclado.nextDouble();
		media = (nota1 + nota2) / 2;
		System.out.println("Sua média é: " + media);

	}
}
