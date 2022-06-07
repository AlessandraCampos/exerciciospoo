package com.exercicios.PooExercicios03;

public class Main {

	public static void main(String[] args) {
		Guerreiro guerreiro1 = new Guerreiro("Shieldy");
		guerreiro1.lvlUp();
		guerreiro1.aprenderHabilidade("Luta com espadas");
		guerreiro1.aprenderHabilidade("Tchaco Avançado");
		System.out.println(guerreiro1.toString());		
		guerreiro1.attack();
		
		Mago mago1 = new Mago("Melvim");
		mago1.attack();
		mago1.aprenderMagia("Invisibilidade");
		mago1.aprenderMagia("Pó Magico");
		mago1.lvlUp();
	
		System.out.println(mago1.toString());
		

	}

}
