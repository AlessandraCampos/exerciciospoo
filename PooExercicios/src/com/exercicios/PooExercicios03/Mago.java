package com.exercicios.PooExercicios03;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mago extends Personagem {
public Mago(String nome) {
		super(nome);

		this.nome = nome;
		this.vida =3;
		this.mana=5;
		this.inteligencia=10;
		this.forca=20;
		this.level=1;
		this.xp=15;
	}
public List<String> magia = new ArrayList<>();
	
	public List<String> getMagia() {
	return magia;
}

public void setMagia(List<String> magia) {
	this.magia = magia;
}

	@Override
	public void lvlUp() {
	mana += 70;
	inteligencia +=80;
	vida +=1;
	xp +=10;
	forca+=40;	
	level+=1;
	}
	
	@Override
	public String toString() {
		return "Mago [magia=" + magia + ", nome=" + nome + ", vida=" + vida + ", mana=" + mana + ", xp=" + xp
				+ ", inteligencia=" + inteligencia + ", forca=" + forca + ", level=" + level 
				 + "]";
	}

	public void aprenderMagia(String novaMagia) {
		magia.add(novaMagia);
		
	}
	public void attack() {
		int numAleatorio= (int) (Math.random()*300);
		int niveldeAttack = (inteligencia * level) + numAleatorio;
	}

	

}
