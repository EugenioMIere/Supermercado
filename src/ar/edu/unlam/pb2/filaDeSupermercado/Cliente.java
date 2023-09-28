package ar.edu.unlam.pb2.filaDeSupermercado;

public class Cliente {

	private Integer posicion;
	private Integer cantidadDeArticulos;

	public Cliente(Integer posicion, Integer articulos) {
		this.posicion = posicion;
		this.cantidadDeArticulos = articulos;
	}

	public Integer getPosicion() {
		return posicion;
	}

	public Integer getCantidadDeArticulos() {
		return cantidadDeArticulos;
	}

	public void setPosicion(Integer posicion2) {
		this.posicion = posicion2;

	}

}
