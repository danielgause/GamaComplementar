package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.Calculadora;

public class CalculadoraTest {

	private Calculadora c;

	@BeforeEach
	public void setup() {
		c = new Calculadora();
	}

	@Test
	public void deveRetornarASomaDosNumeros() {
		// Calculadora c = new Calculadora();
		double resultado = c.somar(10, 20);
		assertEquals(30, resultado);
	}

	@Test
	public void deveRetornarASubtracaoDosNumeros() {
		double resultado = c.subtrair(20, 10);
		assertEquals(10, resultado);
	}

	@Test
	public void deveRetornarAMultiplicacaoDosNumeros() {
		double resultado = c.multiplicar(20, 3);
		assertEquals(60, resultado);
	}

	@Test
	public void deveRetornarADivisaoDosNumerosQuandoDivisorDiferenteDeZero() {
		double resultado = c.dividir(30, 3);
		assertEquals(10, resultado);
	}

	@Test
	public void deveRetornarValorNegativoQuandoDivisorIgualZero() {
		double resultado = c.dividir(1, 0);
		assertEquals(-1, resultado);
	}
}
