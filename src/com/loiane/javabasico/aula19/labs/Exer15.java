package com.loiane.javabasico.aula19.labs;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor da posicao " + i);
			vetorA[i] = scan.nextInt();
		}
		
		// vetorA.lenght - 100%
		// pares         - x
		// = x * vetorA.lenght == pares * 100
		// = x == (pares * 100) / vetorA.lenght

		double porcPar;
		double porcImpar;
		int pares;
		int impares = 0;
		String numPares = "";
		String numImpares = "";
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 2 != 0) {
				numImpares += vetorA[i] + " ";
				impares++;
			} else {
				numPares += vetorA[i] + " ";
			}
		}
		pares = vetorA.length - impares;
		
		porcPar = (pares * 100) / vetorA.length;
		porcImpar = 100 - porcPar;
		
		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.println("Pares: " + numPares);
		System.out.println("Impares: " + numImpares);
		System.out.println("Porcentagem Pares: " + porcPar + "%");
		System.out.println("Porcentagem Impares: " + porcImpar + "%");
	}

}
