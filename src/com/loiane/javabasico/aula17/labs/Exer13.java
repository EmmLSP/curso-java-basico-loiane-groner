package com.loiane.javabasico.aula17.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a base:");
		int base = scan.nextInt();
		
		System.out.println("Entre com a potencia:");
		int pot = scan.nextInt();
		
		// 2 ^ 2 = 2 * 2 = 4
		// 2 ^ 3 = 2 * 2 * 2 = 8
		// pot = 1
		// pot = pot * base
		// 1 = 1 * 2 (2)
		// 2 = 2 * 2 (4)
		// 4 = 4 * 2 (8)
		
		int total = base;
		for (int i = 1; i < pot; i++) {
			total *= base;
		}
		System.out.println("A potencia de " + base + "^" + pot + " = " + total);
		
		total = base;
		int i = 1;
		while (i < pot) {
			total *= base;
			i++;
		}
		System.out.println("A potencia de " + base + "^" + pot + " = " + total);
	}

}
