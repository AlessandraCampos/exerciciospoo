package com.exercicios.PooExercicios02.Model;

import com.exercicios.PooExercicios02.Interfaces.Imposto;

public class VideoGame extends Produto implements Imposto {
	
	private String modelo;
	private double imposto = 0;
	private boolean usado;

	

	private String marca;
	
	

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public VideoGame(String nome, double preco, int quantidade,String modelo,String marca, boolean usado) {
		this.nome= nome;
		this.modelo = modelo;
		this.preco = preco;
		this.quantidade = quantidade;
		this.marca= marca;
		this.usado = usado;
	}

	@Override
	public double calculaImposto() {
		if(isUsado()) {
			imposto = this.preco *0.25;
			
			 
			
		}else {
			imposto = this.preco * 0.45;
			
		}
		System.out.println("Imposto de " + this.nome + " preço: " + imposto + ", quantidade: " + this.quantidade + " em estoque");
		return 0;

	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getImposto() {
		return imposto;
	}
	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	public boolean isUsado() {
		return usado;
	}
	public void setUsado(boolean usado) {
		this.usado = usado;
	}


	public void status() {
		System.out.println("Imposto" + modelo + "preço: " + this.preco + ", quantidade: " + this.quantidade + "em estoque");
	}

}
