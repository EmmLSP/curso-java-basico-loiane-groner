package com.loiane.javabasico.aula17.labs;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num;
		String numeros = "";
		int maior = Integer.MIN_VALUE; // menor numero possivel para Integer
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Entre com " + (i + 1) + " numero:");
			num = scan.nextInt();
			numeros += num + " ";
			if (num > maior) {
					maior = num;
			}
		}
		
		System.out.println("Numeros: " + numeros);
		System.out.println("Maior numero digitado foi: " + maior);
	}

}
