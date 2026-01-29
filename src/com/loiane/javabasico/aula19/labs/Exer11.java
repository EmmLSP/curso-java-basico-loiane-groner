package com.loiane.javabasico.aula19.labs;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorPar = new int[vetorA.length];
		
		int qtdPares = 0;
		for (int i = 0; i < vetorA.length;i++) {
			System.out.println("Entre com o valor da posicao " + i);
			vetorA[i] = scan.nextInt();
			if (vetorA[i] % 2 == 0) {
				vetorPar[qtdPares] = vetorA[i];
				// qtdPares + qtdPares + 1;
				// qtdPares += 1;
				qtdPares++;
			}
		}
		
		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.print("Pares = ");
		for (int i = 0; i < qtdPares; i++) {
			System.out.print(vetorPar[i] + " ");
		}
		System.out.println();
		
		System.out.println("Quantidade de numeros pares: " + qtdPares);
	}

}
