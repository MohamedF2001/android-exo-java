package com.mohamed.enonce;

public class Oiseau extends Animal implements Particularite {

	public Oiseau() {
		super("oiseaux");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void caractere() {
		System.out.println("Le "+getNom()+" est un animal omnivore");
	}

	@Override
	public int nbrePatte() {
		return 2;
	}

	@Override
	public boolean domestique() {
		return true;
	}

	@Override
	public void fourrure() {
		System.out.println("La "+getNom()+" est un animal plumée");
	}

	@Override
	public void deplacement() {
		System.out.println("La "+getNom()+" se déplace en volant");
	}

}
