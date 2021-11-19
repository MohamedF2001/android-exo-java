package com.mohamed.enonce;

public class Mouton extends Animal implements Particularite{

	public Mouton() {
		super("mouton");
		// TODO Auto-generated constructor stub
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
		System.out.println("Le "+getNom()+" est un animal herbivore");
	}

	@Override
	public void fourrure() {
		System.out.println("Le "+getNom()+" est un animal poilu");
	}

	@Override
	public void deplacement() {
		System.out.println("Le "+getNom()+" se dépalce en marchant");
	}

}
