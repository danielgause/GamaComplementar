import java.util.Scanner;

public class CalculaTaboada {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero, contador, resultado;
		System.out.println("Digite um n�mero para calcular a taboada: ");
		numero = teclado.nextInt();
		contador = 0;
		System.out.println("A tabuada do n�mero " + numero + " �:");
		while (contador <= 10) {
			resultado = numero * contador;
			System.out.println(numero + "x" + contador + "=" + resultado);
			contador++;
		}
	}
}