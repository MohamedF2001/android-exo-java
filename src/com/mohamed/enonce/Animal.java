package com.mohamed.enonce;

public abstract class Animal { 
	private String nom;
	
	public Animal(String nom) {
		this.nom = nom;
	}
	
	public void presentation() {
		System.out.println("---Les animaux---");
	}
	
	public abstract void caractere();
	
	public abstract int nbrePatte();
	
	public abstract boolean domestique();
	
	public String getNom() {
		return nom;
	}
}
