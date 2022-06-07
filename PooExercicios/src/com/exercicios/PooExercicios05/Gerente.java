package com.exercicios.PooExercicios05;

public class Gerente extends Funcionario{
	
	String nome;
	double salario=0;
	
	
 
public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


public Gerente(String nome) {
		super();
		this.nome = nome;
		
		
	}


public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	


@Override
 public double bonificacao (double salario) {
	this.setSalario(salario + 10000);
		return this.salario;
	}
}
