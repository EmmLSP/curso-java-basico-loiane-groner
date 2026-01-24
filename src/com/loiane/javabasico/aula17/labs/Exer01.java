package com.loiane.javabasico.aula17.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		boolean notaValida = false;
		double nota; // escopo global
		do {
			System.out.println("Entre com uma nota entre 0 e 10:");
			nota = scan.nextDouble();
			if (nota >= 0 && nota <= 10) {
				System.out.println("Voce digitou: " + nota);
				notaValida = true;
			} else {
				System.out.println("Nota invalida! Digite novamente.");
			}

		} while (!notaValida);
	}

}
