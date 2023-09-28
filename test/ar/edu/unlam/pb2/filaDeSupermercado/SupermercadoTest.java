package ar.edu.unlam.pb2.filaDeSupermercado;

import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.Test;

public class SupermercadoTest {

	@Test
	public void queAlCrearLaColaEstaSeEncuentraVacia() {
		Supermercado super1 = new Supermercado();

		Integer valorEsperado = 0;
		Integer valorObtenido = super1.cantidadEnFila();

		assertEquals(valorEsperado, valorObtenido, 0.01);

	}

	@Test
	public void queAlLlegarGenteLaFilaNoEsteVacia() {
		Supermercado super1 = new Supermercado();
		Cliente cliente1 = new Cliente(2, 5);
		Cliente cliente2 = new Cliente(3, 15);
		Cliente cliente3 = new Cliente(7, 6);
		Cliente cliente4 = new Cliente(1, 3);
		Cliente cliente5 = new Cliente(5, 2);

		super1.setCliente(cliente1);
		super1.setCliente(cliente2);
		super1.setCliente(cliente3);
		super1.setCliente(cliente4);
		super1.setCliente(cliente5);

		Integer valorEsperado = 5;
		Integer valorObtenido = super1.cantidadEnFila();

		assertEquals(valorEsperado, valorObtenido, 0.01);

	}

	@Test
	public void queSePasenClientesALaFilaRapida() {
		Supermercado super1 = new Supermercado();
		Cliente cliente1 = new Cliente(2, 5);
		Cliente cliente2 = new Cliente(3, 15);
		Cliente cliente3 = new Cliente(7, 6);
		Cliente cliente4 = new Cliente(1, 3);
		Cliente cliente5 = new Cliente(5, 2);

		super1.setCliente(cliente1);
		super1.setCliente(cliente2);
		super1.setCliente(cliente3);
		super1.setCliente(cliente4);
		super1.setCliente(cliente5);

		super1.pasarAFilaRapida();

		Integer valorEsperado = 2;
		Integer valorObtenido = super1.cantidadEnFilaRapida();

		assertEquals(valorEsperado, valorObtenido, 0.01);

	}

	@Test
	public void quePasenClientesAFilaRapidanYSalganDeFilaNormal() {
		Supermercado super1 = new Supermercado();
		Cliente cliente1 = new Cliente(2, 5);
		Cliente cliente2 = new Cliente(3, 15);
		Cliente cliente3 = new Cliente(7, 6);
		Cliente cliente4 = new Cliente(1, 3);
		Cliente cliente5 = new Cliente(5, 2);

		super1.setCliente(cliente1);
		super1.setCliente(cliente2);
		super1.setCliente(cliente3);
		super1.setCliente(cliente4);
		super1.setCliente(cliente5);

		super1.pasarAFilaRapida();

		Integer valorEsperadoR = 2;
		Integer valorEsperado = 3;

		Integer valorObtenidoR = super1.cantidadEnFilaRapida();
		Integer valorObtenido = super1.cantidadEnFila();

		assertEquals(valorEsperadoR, valorObtenidoR, 0.01);
		assertEquals(valorEsperado, valorObtenido, 0.01);

	}

}
