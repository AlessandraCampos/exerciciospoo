package com.exercicios.PooExercicios04;

import java.util.ArrayList;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa("João",15);
		Pessoa pessoa2 = new Pessoa("Leandro",21);
		Pessoa pessoa3 = new Pessoa("Paulo",17);
		Pessoa pessoa4 = new Pessoa("Jéssica",18);
		
		Map<String, Integer >pessoas= new HashMap<>();
		pessoas.put("João",15);
		pessoas.put("Leandro",21);
		pessoas.put("Paulo",17);
		pessoas.put("Jéssica",18);
		System.out.println(pessoas);
       int idadeMaior = Collections.max(pessoas.values());
       pessoas.entrySet();
       Set<Map.Entry<String, Integer>>entradas = pessoas.entrySet();
    	String NomedaPessoa = "";
    	for(Map.Entry<String, Integer>entry :entradas) {
    		if(entry.getValue().equals(idadeMaior))NomedaPessoa=entry.getKey();
    	}
    	System.out.println("A pessoa mais velha da lista é :" +  NomedaPessoa);
    	Iterator<Integer>idades = pessoas.values().iterator();
    	while(idades.hasNext()) {
    		if(idades.next()< 18) {
    			idades.remove();
    		}
    	
    	}
    	System.out.println(pessoas);
    	boolean contem = pessoas.containsKey("Jéssica");
    	if (contem == true) {
    		System.out.println("Sim está na lista ");
    	}else {
    		System.out.println("Não está na lista");
    	}
       }
	
	
	

       
	
}
