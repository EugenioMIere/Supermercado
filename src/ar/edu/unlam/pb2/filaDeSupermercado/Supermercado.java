package ar.edu.unlam.pb2.filaDeSupermercado;

import java.util.ArrayList;
import java.util.Iterator;

class Supermercado {

	private ArrayList<Cliente> fila = new ArrayList<Cliente>();
	private ArrayList<Cliente> filaRapida = new ArrayList<Cliente>();

	public Integer cantidadEnFila() {

		return this.fila.size();
	}

	public void setCliente(Cliente cliente1) {

		fila.add(cliente1);

	}

	public Integer cantidadEnFilaRapida() {

		return filaRapida.size();
	}

	public void pasarAFilaRapida() {
		Integer movidos = 0;
		for (Cliente cliente : fila) {
			if (cliente.getCantidadDeArticulos() < 5) {
				cliente.setPosicion(movidos);
				filaRapida.add(cliente);
				movidos++;
			} else {
				cliente.setPosicion(cliente.getPosicion() - movidos);
			}
		}
		fila.removeAll(filaRapida);

	}

//	public void pasarAFilaRapida() {
//		Iterator<Cliente> iter= fila.iterator(); 
//		while (iter.hasNext()) {
//            if (iter.Next().get {
//				
//			}
//        }
//	}

}
