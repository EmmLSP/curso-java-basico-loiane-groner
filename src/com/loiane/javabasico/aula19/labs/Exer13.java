package com.loiane.javabasico.aula19.labs;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorM5 = new int[vetorA.length];
		
		int soma = 0;
		int contM5 = 0;
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor da posicao " + i);
			vetorA[i] = scan.nextInt();
			if (vetorA[i] % 5 == 0) {
				vetorM5[contM5] = vetorA[i];
				soma += vetorA[i];
				contM5++;
			}
		}
		
		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length;i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.print("Multiplos de 5 = ");
		for (int i = 0; i < contM5;i++) {
			System.out.print(vetorM5[i] + " ");
		}
		System.out.println();
		
		System.out.println("Soma: " + soma);
	}

}
