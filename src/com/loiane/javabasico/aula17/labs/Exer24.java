package com.loiane.javabasico.aula17.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer24 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o preco do pao:");
		double precoPao = scan.nextDouble();
		
		System.out.println("Preco do pao: R$ " + precoPao);
		
		System.out.println("Panificadora Pao de Ontem - Tabela de precos:");
		
		System.out.println("-----------------------------------");
		
		for (int i = 1; i <= 50; i++) {
			System.out.println(i + " - R$ " + (precoPao*i));
		}
		
		System.out.println("-----------------------------------");
	}

}
