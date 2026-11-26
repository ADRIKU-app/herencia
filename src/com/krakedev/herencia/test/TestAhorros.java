package com.krakedev.herencia.test;

import com.krakedev.herencia.Hija;
import com.krakedev.herencia.Hijo;
import com.krakedev.herencia.Padre;

public class TestAhorros {

	public static void main(String[] args) {
		
		Padre padre = new Padre(5, 1);
		
		padre.ahorrar(50);
		
		System.out.println("Padre: " + padre);
		
		Hija hija = new Hija(3, 6);
		
		hija.ahorrar(50);
		
		System.out.println("Hija: " + hija);
		
		Hijo hijo = new Hijo(2, 4, 6);
		
		hijo.ahorrar(50);
		
		System.out.println("Hijo " + hijo);


	}

}
