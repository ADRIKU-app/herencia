package com.krakedev.herencia;

public class Hijo extends Padre {

	private int juguetes;

	public Hijo(int virtudes, int defectos, int juguetes) {

		super(virtudes, defectos);
		this.juguetes = juguetes;

	}

	// AMBAS FORMAS SON CORRECTAS:
	// super.toString() ejecuta el método toString() definido en Padre.

	// @Override
	// public String toString() {
	// return super.toString() + ", Juguetes: " + juguetes;
	// }

	@Override
	public String toString() {

		return "Defectos: " + getDefectos() + ", Virtudes: " + getVirtudes() + ", Juguetes: " + juguetes
				+ ", Total Ahorrado: " + getTotalAhorrado();

	}

}
