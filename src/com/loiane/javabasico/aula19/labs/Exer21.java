package com.loiane.javabasico.aula19.labs;

public class Exer21 {

	public static void main(String[] args) {
		
		int[] vetorA = new int[10];
		
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = (int) Math.round(Math.random() * 1);
		}
		
		int qtd1 = 0;
		int qtd0 = 0;
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] == 0) {
				qtd0++;
			} else {
				qtd1++;
			}
		}
		
		// 10   - 100%
		// qtd  - x 
		// = x * 10 == qtd * 100
		// = x == (qtd * 100) / 10

		double porc0 = (qtd0 *100) / vetorA.length; // porcentagem e double
		double porc1 = (qtd1 * 100) / vetorA.length; // porcentagem e double
		
		System.out.print("Vetor A random = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.println("Porcentagem 1: " + porc1 + "%");
		System.out.println("Porcentagem 0: " + porc0 + "%");
	}

}
