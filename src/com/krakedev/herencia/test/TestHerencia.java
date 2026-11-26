package com.krakedev.herencia.test;

import com.krakedev.herencia.Hija;

public class TestHerencia {

	public static void main(String[] args) {

		Hija hija = new Hija(10, 3);

		hija.setVirtudes(5);
		hija.setDefectos(2);

		hija.imprimir();
		// System.out.println("Virtudes: " + hija.getVirtudes());
		// System.out.println("Defectos: " + hija.getDefectos());

	}

}
