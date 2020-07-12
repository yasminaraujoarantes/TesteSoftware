package teste_api_aluguel;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.CsvFileSource;

public class LibTest2YAA {
	
	//@Disabled
	@ParameterizedTest
	@CsvSource(value={"200.00:0:-1", "200.00:1:180.00", "200.00:2:180.00", "200.00:4:180.00", "200.00:5:180.00",
	"200.00:6:190.00", "200.00:9:190.00", "200.00:10:190.00", "200.00:11:200.00", "200.00:14:200.00", "200.00:15:200.00",
	"200.00:16:204.20", "200.00:29:206.80", "200.00:30:207.00", "200.00:31:-1"}, delimiter= ':')
	public void testNominal1YAA(double x, int y, double result) {
		assertEquals(result, AppYAA.entradaDoUsuario(x, y));
	}

	@ParameterizedTest(name="Teste {index} => x={0} y={1}, " + " resultado={2}")
	@CsvFileSource(resources="/valores_teste.csv", delimiter= ',')
	public void testNominal2YAA(double x, int y, double result) {
		assertEquals(result, AppYAA.entradaDoUsuario(x, y));
	}
}

