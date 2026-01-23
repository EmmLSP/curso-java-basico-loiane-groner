package com.loiane.javabasico.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer16 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o valor de a:");
		double a = scan.nextDouble();
		
		if (a == 0) {
			System.out.println("Não é equacao de segundo grau");
		} else {
			System.out.println("Entre com o valor de b:");
			double b = scan.nextDouble();
			System.out.println("Entre com o valor de c:");
			double c = scan.nextDouble();
		
			// delta = b² - 4*a*c
			double delta = (Math.pow(b, 2)) - (4 * a * c);
			
			System.out.println("Delta: " + delta);
			if (delta < 0) {
				System.out.println("Delta negativo");
				System.out.println("A equacao nao possui raizes reais");
			} else {
				double r1 = (-b + (Math.sqrt(delta))) / (2 * a);
				double r2 = (-b - (Math.sqrt(delta))) / (2 * a);
				
				if (delta == 0) {
					System.out.println("Delta igual 0");
					System.out.println("A equacao possui apenas uma raiz real");
				} else {
					System.out.println("Delta positivo");
					System.out.println("A equacao possui duas raizes reais");
				}
				
				System.out.println("r1 = " + r1);
				System.out.println("r2 = " + r2);
			}
		}
	}

}
