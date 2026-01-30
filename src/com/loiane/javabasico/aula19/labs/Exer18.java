package com.loiane.javabasico.aula19.labs;

import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// nome para arrays, vetores no plural porque e uma colecao
		int[] idades = new int[10];
		
		for (int i = 0; i < idades.length; i++) {
			System.out.println("Entre com a idade da pessoa " + (i+1));
			idades[i] = scan.nextInt();
		}
		
		int menorIdade = idades[0]; // por estar trabalhando com vetor atribuir a primeira posicao do vetor
		int maiorIdade = idades[0]; // por estar trabalhando com vetor atribuir a primeira posicao do vetor
		int indexMaior = 0;
		int indexMenor = 0;
		for (int i = 1; i < idades.length; i++) {
			if (idades[i] > maiorIdade) {
				maiorIdade = idades[i];
				indexMaior = i;
			} 
			if (idades[i] < menorIdade) {
				menorIdade = idades[i];
				indexMenor = i;
			}
		}
			
		System.out.print("Idades = ");
		for (int i = 0; i < idades.length; i++) {
			System.out.print(idades[i] + " ");
		}
		System.out.println();
		
		System.out.println("Maior idade: " + maiorIdade);
		System.out.println("Index maior idade: " + indexMaior);
		System.out.println("Menor idade: " + menorIdade);
		System.out.println("Index menor idade: " + indexMenor);
	}

}
