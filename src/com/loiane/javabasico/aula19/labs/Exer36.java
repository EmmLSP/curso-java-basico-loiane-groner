package com.loiane.javabasico.aula19.labs;

import java.util.Scanner;

public class Exer36 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[15];
		int[] vetorB = new int[vetorA.length];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor da posicao " + i);
			vetorA[i] = scan.nextInt();
		}
		
		/*int fatorial;
		for (int i = 0; i < vetorA.length; i++) {
			fatorial = 1;
			for (int j = vetorA[i]; j > 0; j--) {
				fatorial *= j;
			}
			vetorB[i] = fatorial;
			System.out.println();
		}*/
		
		for (int i = 0; i < vetorA.length; i++) {
			vetorB[i] = 1;
			for (int j = 1; j <= vetorA[i]; j++) {
				vetorB[i] *= j;
			}
		}
		
		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.print("Vetor B = ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		System.out.println();
	}

}
