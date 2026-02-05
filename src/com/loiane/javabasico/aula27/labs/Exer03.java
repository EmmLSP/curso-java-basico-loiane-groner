package com.loiane.javabasico.aula27.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		// declaracao e instanciacao do aluno
		Aluno aluno = new Aluno();
		
		System.out.println("Entre com o nome do aluno:");
		aluno.nome = scan.next();
		
		System.out.println("Entre com a matricula:");
		aluno.matricula = scan.next();
		
		System.out.println("Entre com o nome do curso:");
		aluno.nomeCurso = scan.next();
		
		// aluno.nomeDisciplinas = new String[3];
		for (int i = 0; i < aluno.nomeDisciplinas.length; i++) {
			System.out.println("Entre com o nome da disciplina " + (i+1));
			aluno.nomeDisciplinas[i] = scan.next();
		}
		
		// aluno.notasDisciplinas = new double[3][4];
		for (int i = 0; i < aluno.notasDisciplinas.length; i++) { // linhas
			System.out.println("Obtendo notas da disciplina " + aluno.nomeDisciplinas[i]);
			for (int j = 0; j < aluno.notasDisciplinas[i].length; j++) { // colunas
				System.out.println("Entre com a nota " + (j+1));
				aluno.notasDisciplinas[i][j] = scan.nextDouble();
			}
		}
		
		aluno.mostrarInfo();
		
		for (int i = 0; i < aluno.nomeDisciplinas.length; i++) {
			if (aluno.verificarAprovado(i)) {
				System.out.println("Disciplina " + aluno.nomeDisciplinas[i] + " - foi aprovado");
			} else {
				System.out.println("Disciplina " + aluno.nomeDisciplinas[i] + " - foi reprovado");
			}
		}
	}

}
