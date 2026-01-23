package com.loiane.javabasico.aula15.labs;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com um dia da semana (1-7):");
		int diaSemana = scan.nextInt();

		switch (diaSemana) {
		case 1:
			System.out.println("1-Domingo");
			break;
		case 2:
			System.out.println("2-Segunda-feira");
			break;
		case 3:
			System.out.println("3-Terca-feira");
			break;
		case 4:
			System.out.println("4-Quarta-feira");
			break;
		case 5:
			System.out.println("5-Quinta-feira");
			break;
		case 6:
			System.out.println("6-Sexta-feira");
			break;
		case 7:
			System.out.println("7-Sábado");
			break;
		default:
			System.out.println("Não é um dia da semana válido!");
		}
	}

}
