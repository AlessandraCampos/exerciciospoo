package com.exercicios.PooExercicios02.Model;

import com.exercicios.PooExercicios02.Interfaces.Imposto;

public class Livro extends Produto {

	private String autor;
	private String genero;
	private int estoque;
	protected double imposto = 0;
	
	

	public Livro(String nome,double preco,int quantidade, String autor, String genero, int estoque) {
		super();
		this.nome =nome;
		this.preco =preco;
		this.quantidade= quantidade;
		this.autor = autor;
		this.genero = genero;
		this.estoque = estoque;
	}
	

	public String getAutor() {
		return autor;
	}



	public void setAutor(String autor) {
		this.autor = autor;
	}



	public String getGenero() {
		return genero;
	}



	public void setGenero(String genero) {
		this.genero = genero;
	}



	public int getEstoque() {
		return estoque;
	}



	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}


	public void calculaImposto() {
		// TODO Auto-generated method stub
		
	}





}
