package com.mohamed.enonce;

public class Chat extends Animal implements Particularite {

	public Chat() {
		super("chat");
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
		System.out.println("La "+getNom()+" se d?place en marchant");
			
	}

}
