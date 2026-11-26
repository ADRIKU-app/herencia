package com.krakedev.herencia;

public class Padre {

	private String nombre;
	private int defectos;
	private int virtudes;
	private double totalAhorrado;

//	@Override
//	public String toString() {
//		return "Padre [defectos=" + defectos + ", virtudes=" + virtudes + "]";
//	}

//	public Padre() {
//
//		System.out.println("Soy el constructor vacío del padre");
//
//	}

	public Padre(String nombre, int virtudes, int defectos) {

		this.nombre = nombre;
		this.virtudes = virtudes;
		this.defectos = defectos;

	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + ", Defectos: " + defectos + ", Virtudes: " + virtudes + ", Total ahorrado: "
				+ totalAhorrado;
	}

	public String getNombre() {
		return nombre;
	}

	public int getDefectos() {
		return defectos;
	}

	public int getVirtudes() {
		return virtudes;
	}

	public double getTotalAhorrado() {
		return totalAhorrado;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDefectos(int defectos) {
		this.defectos = defectos;
	}

	public void setVirtudes(int virtudes) {
		this.virtudes = virtudes;
	}

	public void setTotalAhorrado(double totalAhorrado) {
		this.totalAhorrado = totalAhorrado;
	}

	public void imprimir() {

		System.out.println("Virtudes: " + virtudes);
		System.out.println("Defectos: " + defectos);

	}

	public void guardarSecreto() {

		System.out.println("Esto no se hereda");

	}

	public void ahorrar(double monto) {

		// En ambas formas es lo mismo:
		// totalAhorrado += monto;
		totalAhorrado = totalAhorrado + monto;
	}

}
