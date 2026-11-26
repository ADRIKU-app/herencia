package com.krakedev.herencia;

public class Padre {

	private int defectos;
	private int virtudes;

//	@Override
//	public String toString() {
//		return "Padre [defectos=" + defectos + ", virtudes=" + virtudes + "]";
//	}

//	public Padre() {
//
//		System.out.println("Soy el constructor vacío del padre");
//
//	}

	public Padre(int virtudes, int defectos) {

		this.virtudes = virtudes;
		this.defectos = defectos;

	}

	public String tostring() {

		return "Hola";

	}

	public int getDefectos() {
		return defectos;
	}

	public int getVirtudes() {
		return virtudes;
	}

	public void setDefectos(int defectos) {
		this.defectos = defectos;
	}

	public void setVirtudes(int virtudes) {
		this.virtudes = virtudes;
	}

	public void imprimir() {

		System.out.println("Virtudes: " + virtudes);
		System.out.println("Virtudes: " + defectos);

	}

	public void guardarSecreto() {

		System.out.println("Esto no se hereda");

	}

}
