/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package teste_api_aluguel;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class LibTestYAA {
	@Test
	public void testNominal1YAA() {
		assertEquals(180.00, AppYAA.entradaDoUsuario(200.00, 4));
	}

	@Test
	public void testNominal2YAA() {
		assertEquals(189.00, AppYAA.entradaDoUsuario(200.00, 9));
	}

	@Test
	public void testNominal3YAA() {
		assertEquals(200.00, AppYAA.entradaDoUsuario(200.00, 13));
	}

	@Test
	public void testNominal4YAA() {
		assertEquals(206.40, AppYAA.entradaDoUsuario(200.00, 27));
	}

	@Test
	public void testNominal5YAA() {
		assertEquals(204.20, AppYAA.entradaDoUsuario(200.00, 16));
	}

	@Test
	public void testNominal6YAA() {
		assertEquals(-1, AppYAA.entradaDoUsuario(200.00, 31));
	}
}
