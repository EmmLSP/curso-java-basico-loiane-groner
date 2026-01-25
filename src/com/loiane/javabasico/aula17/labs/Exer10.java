package com.loiane.javabasico.aula17.labs;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		int num2;
		
		System.out.println("Entre com o primeiro numero:");
		int num1 = scan.nextInt();
		
		boolean valido = false;
		do {
			System.out.println("Entre com o segundo numero:");
			num2 = scan.nextInt();
			if (num1 > num2) {
				System.out.println("O numero 2 precisa ser maior que o numero 1");
			} else {
				valido = true;
			}
		} while (!valido);
		
		System.out.println("Numeros de " + num1 + " ate " + num2 + ":");
		
		for (int i = num1; i <= num2; i++) {
			System.out.println(i);
		}
	}

}
