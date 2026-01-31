package com.loiane.javabasico.aula19.labs;

import java.util.Scanner;

public class Exer34 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor da posicao " + i);
			vetorA[i] = scan.nextInt();
		}
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Divisores de " + vetorA[i]);
			for (int j = 1; j <= vetorA[i]; j++) {
				if (vetorA[i] % j == 0) {
					System.out.println(vetorA[i] + " é divisivel por " + j);
				}
			}
			System.out.println();
		}
	}

}
