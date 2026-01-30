package com.loiane.javabasico.aula19.labs;

import java.util.Scanner;

public class Exer16 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor da posicao " + i);
			vetorA[i] = scan.nextInt();
		}
		
		int somaMenor15 = 0;
		int qtdIgual15 = 0;
		int somaMaior15 = 0;
		int qtdMaior15 = 0;
		for(int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] == 15) {
				qtdIgual15++;
			} else if (vetorA[i] < 15) {
				somaMenor15 += vetorA[i];
			}  else {
				somaMaior15 += vetorA[i];
				qtdMaior15++;
			}
		}
		
		System.out.print("Vetor A = ");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.println("Soma de numeros menores que 15: " + somaMenor15);
		System.out.println("Quantidade de numeros igual a 15: " + qtdIgual15);
		if (qtdMaior15 == 0) {
			System.out.println("Media de numeros superior a 15: 0.0");
		} else {
			System.out.println("Media dos numeros superiores a 15: " + (somaMaior15 / qtdMaior15));
		}
	}

}
