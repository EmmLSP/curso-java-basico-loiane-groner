package com.loiane.javabasico.aula15.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite com uma letra (F ou M):");
		String letra = scan.next();
		
		// a classe String tem um metodo de comparacao
		// de String, equals() e equalsIgnoreCase()

		if (letra.equalsIgnoreCase("M")) {
			System.out.println("M - Masculino");
		} else if (letra.equalsIgnoreCase("F")) {
			System.out.println("F - Feminino");
		} else {
			System.out.println("Sexo invalido");
		}
		
		switch(letra) {
		case "m":
		case "M": System.out.println("M - Masculino"); break;
		case "f":
		case "F": System.out.println("F - feminino"); break;
		default: System.out.println("Sexo invalido");
		}
	}

}
