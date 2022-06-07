package com.exercicios.PooExercicios03;

import java.util.ArrayList;
import java.util.List;

public class Guerreiro extends Personagem{
	@Override
	public String toString() {
		return "Guerreiro [habilidades=" + habilidades + ", nome=" + nome + ", vida=" + vida + ", mana=" + mana + ", xp="
				+ xp + ", inteligencia=" + inteligencia + ", forca=" + forca + ", level=" + level +  "]";
	}
	public Guerreiro(String nome) {
		super(nome);
		this.nome = nome;
		this.vida =5;
		this.mana=3;
		this.inteligencia=10;
		this.forca=20;
		this.level=1;
		this.xp=15;
	}


	
	
	public List<String> habilidades = new ArrayList<>();
	
	public List<String> getHabilidade() {
		return habilidades;
	}
	public void setHabilidade(List<String> habilidade) {
		this.habilidades = habilidade;
	}
	
	
    public void attack() {
    	double numAleatorio= (Math.random()*300);
	    double niveldeAttack = (forca * level) + 	numAleatorio;
	}
	public void lvlUp() {
	
		mana += 30;
		inteligencia +=20;
		vida +=50;
		xp +=10;
		forca+=80;	
		level+=1;
	}
	
   public void aprenderHabilidade(String habilidade) {
	   habilidades.add(habilidade);
	
 
		
	}
   

}
