package com.loiane.javabasico.aula17.labs;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num;
		int pares = 0;
		int impares = 0;
		String numeros = "";
		
		numeros += ("[");
		for (int i = 0; i < 10; i++) {
			System.out.println("Entre com um numero:");
			num = scan.nextInt();
			if (num % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
			if (i < 9) {
				numeros += num + ", ";
			} else {
				numeros += num;
			}
		}
		numeros += ("]");
		
		System.out.println(numeros);
		System.out.println("Quantidade de pares: " + pares);
		System.out.println("Quantidade de impares: " + impares);
	}

}
