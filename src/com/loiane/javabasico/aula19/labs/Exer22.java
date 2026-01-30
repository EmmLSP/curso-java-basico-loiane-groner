package com.loiane.javabasico.aula19.labs;

import java.util.Scanner;

public class Exer22 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		int contPar = 0;
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com um numero para a posicao " + i);
			vetorA[i] = scan.nextInt();
			contPar++;
			if (vetorA[i] % 2 != 0) {
				break;
			}
		}

		if (contPar == vetorA.length) {
			System.out.print("Vetor A = ");
			for (int i = 0; i < vetorA.length; i++) {
				System.out.print(vetorA[i] + " ");
			}
			System.out.println();
			
			System.out.println("Todos os elementos do vetor A sao pares");
		} else {
			System.out.println("Programa interrompido com break");
		}
	}

}
