package ProfIngSoft.Examen2;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;


public class ClaseExamenTest {

	
	@Test
	public void test_numero_6() throws EntradaInvalida {
		List<Integer> resultado = new ArrayList<Integer>();
		resultado.add(2);
		resultado.add(3);
		assertEquals(resultado, ClaseExamen.primos(6));
    }
	
	@Test
	public void test_numero_13() throws EntradaInvalida {
		List<Integer> resultado = new ArrayList<Integer>();
		resultado.add(13);
		assertEquals(resultado, ClaseExamen.primos(13));
    }
	
	@Test	
	public void test_numero_25() throws EntradaInvalida {
		List<Integer> resultado = new ArrayList<Integer>();
		resultado.add(5);
		resultado.add(5);
		assertEquals(resultado, ClaseExamen.primos(25));
    }
	
}


