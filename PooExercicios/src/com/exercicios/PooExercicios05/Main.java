package com.exercicios.PooExercicios05;

public class Main {

	public static void main(String[] args) {
		Gerente gerente1 = new Gerente("João");
		Supervisor supervisor1 = new Supervisor("Francisco", 10000);
		Vendedor vendedor1 = new Vendedor("Pedro",5000);
		
		gerente1.bonificacao(15000);
      System.out.println("Este é o valor final do Gerente : " + gerente1.getNome()+" " + gerente1.salario);
      supervisor1.bonificacao(8000);
      System.out.println("Este é o valor final do Supervisor : " + supervisor1.getNome()+" " + supervisor1.salario);
      vendedor1.bonificacao(1500);
      System.out.println("Este é o valor final do Vendedor : " + vendedor1.getNome()+" " + vendedor1.salario);
	}
}
