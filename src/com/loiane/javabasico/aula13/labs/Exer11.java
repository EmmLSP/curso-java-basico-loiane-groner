package com.loiane.javabasico.aula13.labs;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um numero inteiro:");
		int num1 = scan.nextInt();
		
		System.out.println("Entre com outro numero inteiro:");
		int num2 = scan.nextInt();
		
		System.out.println("Entre com um numero real:");
		double num3 = scan.nextDouble();
		
		int res1 = (num1 * 2) * (num2 / 2);
		double res2 = (num1 * 3) + num3;
		double res3 = Math.pow(num3, 3);
		
		System.out.println("O produto do dobro do primeiro é " + res1);
		System.out.println("A soma do triplo do primeiro com o terceiro é " + res2);
		System.out.println("O terceiro elevado ao cubo é " + res3);
	}

}
