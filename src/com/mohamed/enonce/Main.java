package com.mohamed.enonce;

public class Main {

	public static void main(String[] args) {
		
		Chien chien = new Chien();
		chien.presentation();
		chien.caractere();
		chien.nbrePatte();
		chien.domestique();
		chien.fourrure();
		
		if (chien.domestique() ==true) {
			System.out.println("Le chien est un animal domestique");
		} else {
			System.out.println("Le chien n'est pas un animal sauvage");
		}
		chien.deplacement();
		
		System.out.println();
		
		Lion lion = new Lion();
		lion.presentation();
		lion.caractere();
		lion.nbrePatte();
		lion.domestique();
		lion.fourrure();
		
		if (lion.domestique() ==true) {
			System.out.println("Le lion n'est pas un animal domestique");
		} else {
			System.out.println("Le lion est un animal sauvage");
		}
		lion.deplacement();
		
		System.out.println();
		
		Oiseau oiseau = new Oiseau();
		oiseau.presentation();
		oiseau.caractere();
		oiseau.nbrePatte();
		oiseau.domestique();
		oiseau.fourrure();
		
		if (oiseau.domestique() ==true) {
			System.out.println("L'oiseau est un animal domestique");
		} else {
			System.out.println("Le lion est un animal sauvage");
		}
		oiseau.deplacement();
	}

}
