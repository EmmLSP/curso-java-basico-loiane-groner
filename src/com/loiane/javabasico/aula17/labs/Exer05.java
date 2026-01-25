package com.loiane.javabasico.aula17.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		// O Java nao e uma linguagem confiavel para trabalhar com numeros
		// principalmente os tipos primitivos, para isso existe classes
		
		double popA;
		double popB;
		double taxaA;
		double taxaB;
		int cont = 0;	
		
		boolean valida = false;
		do {
			System.out.println("Entre com a populacao A:");
			popA = scan.nextDouble();
			if (popA > 0) {
				valida = true;
			} else {
				System.out.println("A populacao A precisa ser maior que 0");
			}
		} while (!valida);
		
		valida = false;
		do {
			System.out.println("Entre com a populacao B:");
			popB = scan.nextDouble();
			if (popB > 0 && popB > popA) {
				valida = true;
			} else {
				System.out.println("A populacao B precisa ser maior que 0 e maior que a populacao A");
			}
		} while (!valida);
		
		valida = false;
		do {
			System.out.println("Entre com a taxa de crescimento da populacao A:");
			taxaA = scan.nextDouble();
			
			if (taxaA > 0) {
				valida = true;
			} else {
				System.out.println("A taxa de crescimento A precisa ser maior que 0");
			}
		} while (!valida);
		
		valida = false;
		do {
			System.out.println("Entre com a taxa de crescimento da populacao B:");
			taxaB = scan.nextDouble();
			
			if (taxaB > 0 && taxaB < taxaA) {
				valida = true;
			} else {
				System.out.println("A taxa de crescimento B precisa ser maior que 0 e a taxa B menor que a taxa A");
			}
		} while (!valida);
		
		while (popA < popB) {
			popA += (popA /100) * taxaA;
			popB += (popB / 100) * taxaB;
			cont++;
		}
		System.out.println("Populacao A: " + popA);
		System.out.println("Populacao B: " + popB);
		System.out.println("A populacao do pais A ultrapssara a populacao do pais B em " + cont + " anos.");
	}

}
