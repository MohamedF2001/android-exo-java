package com.mohamed.enonce;

public class Lion extends Animal implements Particularite{

	public Lion() {
		super("lion");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void caractere() {
		System.out.println("La "+getNom()+" est un aniaml carnivore");
	}

	@Override
	public int nbrePatte() {
		return 4;
	}

	@Override
	public boolean domestique() {
		return false;
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
