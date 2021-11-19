package com.mohamed.enonce;

public class Chien extends Animal implements Particularite {
	//constructeur
	public Chien() {
		super("chien");
	}

	@Override
	public int nbrePatte() {
		return 4;
	}

	@Override
	public boolean domestique() {
		return true;
	}

	@Override
	public void caractere() {
		System.out.println("Le "+getNom()+" est un aniaml omnivore");
	}

	@Override
	public void fourrure() {
		System.out.println("Le "+getNom()+" est un animal poilu");
	}

	@Override
	public void deplacement() {
		System.out.println("La "+getNom()+" se déplace en marchant");	
	}

}
