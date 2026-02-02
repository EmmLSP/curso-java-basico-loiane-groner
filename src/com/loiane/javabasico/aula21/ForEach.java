package com.loiane.javabasico.aula21;

import java.util.Random;

public class ForEach {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		// exemplo 1
		
		int[] notas = new int[10];
		
		for (int i = 0; i < notas.length; i++) {
			notas[i] = random.nextInt(10); // 0 a 10
		}
		
		System.out.println("Usando for normal");
		
		System.out.print("Notas = ");
		for (int i = 0; i < notas.length; i++) {
			int nota = notas[i];
			System.out.print(nota + " ");
		}
		System.out.println();
		
		System.out.println("Usando o for each");
		
		System.out.print("Notas = ");
		for (int nota : notas) {
			System.out.print(nota + " ");
		}
		System.out.println();
		
		// exemplo 2
		
		double[][] notasAlunos = new double[3][4];
		
		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 7;
		notasAlunos[0][2] = 9;
		notasAlunos[0][3] = 9.5;
		
		notasAlunos[1][0] = 9;
		notasAlunos[1][1] = 8;
		notasAlunos[1][2] = 7;
		notasAlunos[1][3] = 9;
		
		notasAlunos[2][0] = 8;
		notasAlunos[2][1] = 9;
		notasAlunos[2][2] = 10;
		notasAlunos[2][3] = 7;
		
		for (int i = 0; i < notasAlunos.length; i++) {
			System.out.print("Aluno " + (i+1) + " - ");
			for (int j = 0; j < notasAlunos[i].length; j++) {
				System.out.print(notasAlunos[i][j] + " | ");
			}
			System.out.println();
		}
		
		for (double[] notasAluno : notasAlunos) {
			for (double nota : notasAluno) {
				System.out.print(nota + " ");
			}
			System.out.println();
		}
	}

}
