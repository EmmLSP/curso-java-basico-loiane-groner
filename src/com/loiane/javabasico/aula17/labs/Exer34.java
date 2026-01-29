package com.loiane.javabasico.aula17.labs;

import java.util.Scanner;

public class Exer34 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com valor de n:");
		int n = scan.nextInt();
		
		double soma = 0;
		System.out.print("H = 1 + ");
		soma += 1;
		for (int i = 2; i <= n; i++) {
			soma += (double) 1/i;
			System.out.print("1/" + i + " + ");
		}
		System.out.println("... + 1/N.");
		
		System.out.println("Soma = " + soma);
	}

}
