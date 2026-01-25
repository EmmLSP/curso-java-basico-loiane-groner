package com.loiane.javabasico.aula17.labs;

public class Exer04 {

	public static void main(String[] args) {
		
		int popA = 80000;
		int popB = 200000;
		int cont = 0; 
		while (popA < popB) {
			popA += (popA /100) * 3;
			popB += (popB / 100) * 1.5;
			System.out.println("populacao pais A = " + popA + " hab - populacao pais B = " + popB + " hab");
			cont++;
		}
		System.out.println("Populacao A: " + popA);
		System.out.println("Populacao B: " + popB);
		System.out.println("A populacao do pais A ultrapssara a populacao do pais B em " + cont + " anos.");
	}

}
