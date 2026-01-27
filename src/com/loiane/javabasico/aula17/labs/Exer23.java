package com.loiane.javabasico.aula17.labs;

import java.util.Locale;

public class Exer23 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		System.out.println("Loja Quase Dois - Tabela de precos:");
		
		System.out.println("-----------------------------------");
		
		for (int i = 1; i <= 50; i++) {
			System.out.println(i + " - R$ " + (String.format("%.2f", (1.99*i))));
		}
		
		System.out.println("-----------------------------------");
	}

}
