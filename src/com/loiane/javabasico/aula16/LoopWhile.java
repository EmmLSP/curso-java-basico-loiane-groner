package com.loiane.javabasico.aula16;

public class LoopWhile {

	public static void main(String[] args) {
		
		int i = 1; // count ou cont
		int max = 10;
		
		System.out.println("Contando de " + i + " ate " + max + ":");
		
		// i <= max -> expressao booleana
		// usar essa expressao com operadores
		// logicos e relacionais
		
		// avalia primeiro a expressa depois executa bloco de codigo
		while (i <= max) { // true or false
			System.out.println("Valor de i: " + i);
			i++; // i = i + 1; i += 1;
		}
		
		System.out.println(i); // valor de 11
		
		// executa pelo menos 1 vez mesmo a expressao sendo falsa
		// executa primeiro o bloco de codigo e depois avalia expressao
		do {
			i++;
			System.out.println("Valor de i:" + i);
		} while (i < 13);
		
		System.out.println(i); // valor de 13
	}

}
