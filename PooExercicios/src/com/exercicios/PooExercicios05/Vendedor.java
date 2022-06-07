package com.exercicios.PooExercicios05;

public class Vendedor extends Funcionario {
	
	String nome;
	double salario;
	
	
	 public Vendedor(String nome, double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	public double bonificacao (double salario) {
			this.setSalario(salario + 3000);
		    return this.salario;
			}

}
