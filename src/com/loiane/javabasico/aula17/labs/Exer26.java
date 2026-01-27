package com.loiane.javabasico.aula17.labs;

import java.util.Scanner;

public class Exer26 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um numero para calcular fatorial:");
		int num = scan.nextInt();
		
		int fatorial = 1;
		
		System.out.println("Fatorial de: " + num);
		
		System.out.print(num + "! = ");
		for (int i = num; i > 0; i--) {
			fatorial *= i;
			if (i > 1) {
				System.out.print(i + " . ");
			} else {
				System.out.println(i + " = " + fatorial);
			}
		}
	}

}
