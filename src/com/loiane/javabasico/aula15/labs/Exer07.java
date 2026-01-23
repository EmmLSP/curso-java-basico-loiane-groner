package com.loiane.javabasico.aula15.labs;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro numero:");
		int num1 = scan.nextInt();
		System.out.println("Entre com o segundo numero:");
		int num2 = scan.nextInt();
		System.out.println("Entre com o terceiro numero:");
		int num3 = scan.nextInt();
		
		System.out.println("[" + num1 + ", " + num2 + ", " + num3 + "]");
		
		int maior = 0;
		int menor = 0;
		if (num1 >= num2 && num1 >= num3) {
			maior = num1;
			if (num2 <= num3) {
				menor = num2;
			} else {
				menor = num3;
			}
		} else if (num2 >= num1 && num2 >= num3) {
			maior = num2;
			if (num1 <= num3) {
				menor = num1;
			} else {
				menor = num3;
			}
		} else if (num3 >= num1 && num3 >= num2) {
			maior = num3;
			if (num1 <= num2) {
				menor = num1;
			} else {
				menor = num2;
			}
		}
		System.out.println("O maior numero é " + maior);
		System.out.println("O menor numero é " + menor);
		
		System.out.println("------------------");
		
		System.out.println("[" + num1 + ", " + num2 + ", " + num3 + "]");
		
		if (num1 >= num2 && num1 >= num3) {
			System.out.println("Num1 é o maior = " + num1);
		} else if (num2 >= num1 && num2 >= num3) {
			System.out.println("Num2 é o maior = " + num2);
		} else if (num3 >= num1 && num3 >= num2) {
			System.out.println("Num3 é o maior = " + num3);
		}
		
		if (num1 <= num2 && num1 <= num3) {
			System.out.println("Num1 é o menor = " + num1);
		} else if (num2 <= num1 && num2 <= num3) {
			System.out.println("Num2 é o menor = " + num2);
		} else if (num3 <= num1 && num3 <= num2) {
			System.out.println("Num3 é o menor = " + num3);
		}
	}

}
