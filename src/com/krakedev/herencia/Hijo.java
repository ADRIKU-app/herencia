package com.krakedev.herencia;

public class Hijo extends Padre {

	private int juguetes;

	public Hijo(String nombre, int virtudes, int defectos, int juguetes) {

		super(nombre, virtudes, defectos);
		this.juguetes = juguetes;

	}

	@Override
	public void ahorrar(double monto) {
		super.ahorrar(monto * 0.5);
	}

	// AMBAS FORMAS SON CORRECTAS:
	// super.toString() ejecuta el método toString() definido en Padre.

	// @Override
	// public String toString() {
	// return super.toString() + ", Juguetes: " + juguetes;
	// }

	@Override
	public String toString() {

		return "Nombre: " + getNombre() + ", Defectos: " + getDefectos() + ", Virtudes: " + getVirtudes() + ", Juguetes: " + juguetes
				+ ", Total Ahorrado: " + getTotalAhorrado();

	}

}
