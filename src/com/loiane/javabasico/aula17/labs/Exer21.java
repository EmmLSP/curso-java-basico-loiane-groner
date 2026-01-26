package com.loiane.javabasico.aula17.labs;

import java.util.Scanner;

public class Exer21 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o numero de turmas:");
		int turmas = scan.nextInt();
		
		int alunos;
		int soma = 0;
		double media;
		boolean invalido;
		
		for (int i = 0; i < turmas; i++) {
			invalido = true;
			do {
				System.out.println("Entre com o numero de alunos na turma " + (i + 1));
				alunos = scan.nextInt();
				if (alunos >= 0 && alunos <= 40) {
					invalido = false;
				} else {
					System.out.println("Numero de alunos inválido! Digite novamente.");
				}
			} while (invalido);
			soma += alunos;
		}
		media = soma / turmas;
		
		System.out.println("A quantidade media de alunos por turma é: " + media);
	}

}
