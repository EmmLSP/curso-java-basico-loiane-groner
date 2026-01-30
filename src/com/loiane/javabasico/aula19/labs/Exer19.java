package com.loiane.javabasico.aula19.labs;

import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// boa pratica por no plural nome dos vetores, porque e uma colecao
		
		double[] notas1 = new double[10];
		double[] notas2 = new double[notas1.length];
		double[] resultados = new double[notas1.length];
		
		for (int i = 0; i < notas1.length; i++) {
			System.out.println("Entre com a nota 1 do aluno " + (i+1));
			notas1[i] = scan.nextDouble();
			System.out.println("Entre com a nota 2 do aluno " + (i+1));
			notas2[i] = scan.nextDouble();
			resultados[i] = (notas1[i] + notas2[i]) / 2;
		}
		
		System.out.print("Notas 1 = ");
		for (int i = 0; i < notas1.length; i++) {
			System.out.print(notas1[i] + " ");
		}
		System.out.println();
		
		System.out.print("Notas 2 = ");
		for (int i = 0; i < notas2.length; i++) {
			System.out.print(notas2[i] + " ");
		}
		System.out.println();
		
		System.out.println("Resultados:");
		for (int i = 0; i < resultados.length; i++) {
			if (resultados[i] >= 7) {
				System.out.println("Aluno " + (i+1) + ": " + resultados[i] + " - APROVADO");
			} else if (resultados[i] >= 5) {
				System.out.println("Aluno " + (i+1) + ": " + resultados[i] + " - RECUPERACAO");
			} else {
				System.out.println("Aluno " + (i+1) + ": " + resultados[i] + " - REPROVADO");
			}
		}
		System.out.println();
		
		for (int i = 0; i < resultados.length; i++) {
			System.out.print("Aluno: " + (i+1) + " - notas: ");
			System.out.println(notas1[i] + ", " + notas2[i]);
			System.out.print(resultados[i] + " - ");
			
			if (resultados[i] >= 7) {
				System.out.println("APROVADO");
			} else if (resultados[i] >= 5) {
				System.out.println("RECUPERACAO");
			} else {
				System.out.println("REPROVADO");
			}
		}
	}

}
