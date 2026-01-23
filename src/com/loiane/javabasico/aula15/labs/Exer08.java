package com.loiane.javabasico.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro preco:");
		double preco1 = scan.nextDouble();
		System.out.println("Entre com o segundo preco:");
		double preco2 = scan.nextDouble();
		System.out.println("Entre com o terceiro preco:");
		double preco3 = scan.nextDouble();
		
		if (preco1 <= preco2 && preco1 <= preco3) {
			System.out.println("O produto 1 e mais barato = R$ " + preco1);
		} else if (preco2 <= preco1 && preco2 <= preco3) {
			System.out.println("O produto 2 e mais barato = R$ " + preco2);
		} else if (preco3 <= preco1 && preco3 <= preco2) {
			System.out.println("O produto 3 e mais barato = R$ " + preco3);
		}
	}

}
