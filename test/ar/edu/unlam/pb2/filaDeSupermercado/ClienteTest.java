package ar.edu.unlam.pb2.filaDeSupermercado;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClienteTest {

	@Test
	public void queElClienteSepaSuPosicion() {
		Cliente cliente1 = new Cliente(2,5);
		
		Integer posicion =  cliente1.getPosicion();
		
		assertEquals(posicion, 2, 0.01);
		
		
	}

}
