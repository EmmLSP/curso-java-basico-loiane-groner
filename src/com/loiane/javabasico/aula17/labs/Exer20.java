package com.loiane.javabasico.aula17.labs;

import java.util.Scanner;

public class Exer20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre o com a quantidade de idades:");
		int idades = scan.nextInt();
		
		int idade;
		int soma = 0;
		double media;
		
		for (int i = 0; i < idades; i++) {
			System.out.println("Entre com a idade da pessoa " + (i+1));
			idade = scan.nextInt();
			soma += idade;
		}
		media = soma / idades;
		
		System.out.println("Media de idade da turma: " + media);
		
		/*if (media >= 0 && media <= 25) {
			System.out.println("Turma Jovem!");
		} else if (media > 25 && media <= 60) {
			System.out.println("Turma Adulta!");
		} else {
			System.out.println("Turma Idosa!");
		}*/
		
		if (media <= 25) {
			System.out.println("Turma Jovem!");
		} else if (media <= 60) {
			System.out.println("Turma Adulta!");
		} else {
			System.out.println("Turma Idosa!");
		}
	}

}
