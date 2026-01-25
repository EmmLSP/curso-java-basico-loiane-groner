package com.loiane.javabasico.aula17.labs;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num2;
		String conta = "";
		int soma = 0;
		
		System.out.println("Entre com o primeiro numero:");
		int num1 = scan.nextInt();
		
		boolean valido = false;
		do {
			System.out.println("Entre com o segundo numero:");
			num2 = scan.nextInt();
			if (num1 > num2) {
				System.out.println("O numero 2 precisa ser maior do que o numero 1");
			} else {
				valido = true;
			}
		} while (!valido);

		System.out.println("Numeros " + num1 + " ate " + num2 + ":");
		
		for (int i = num1; i <= num2; i++) {
			if (i < num2 - 1) {
				conta += i + " + ";
			} else {
				conta += i + " = ";
			}
			soma += i;
		}
		
		System.out.println(conta + soma);
		System.out.println("Soma: " + soma);
	}

}
