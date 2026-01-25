package com.loiane.javabasico.aula17.labs;

import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um numero para calcular o fatorial:");
		int num = scan.nextInt();
		
		int fat = 1;
		
		System.out.print(num + "! = ");
		for (int i = num; i > 0; i--) {
			fat *= i;
			if (i > 1) {
				System.out.print(i + " * ");
			} else {
				System.out.println(i + " = " + fat);
			}
		}
		System.out.println("Fatorial de " + num + "! = " + fat);
	}

}
