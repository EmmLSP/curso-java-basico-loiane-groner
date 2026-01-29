package com.loiane.javabasico.aula17.labs;

import java.util.Scanner;

public class Exer33 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com n termos:");
		int n = scan.nextInt();
		
		double soma = 0;
		System.out.print("S = ");
		for (int i = 1, j = 1; i <= n; i++, j += 2) {
			soma += i / j;
			System.out.print(i + "/" + j + " + ");
		}
		System.out.println("... + n/m.");
		System.out.println("Soma + " + soma);
	}

}
