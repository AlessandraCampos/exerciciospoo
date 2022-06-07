package com.exercicios.PooExercicios05;

public class Supervisor extends Funcionario{
	String nome;
	double salario;
	
	public Supervisor(String nome, double salario) {
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

	@Override
	 public double bonificacao (double salario) {
			this.setSalario(salario + 5000);
			return this.salario;
		}

}
