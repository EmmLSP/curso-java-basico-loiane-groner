package com.loiane.javabasico.aula15.labs;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um numero:");
		int numero = scan.nextInt();
		
		if (numero >= 0) {
			System.out.println("O numero " + numero + " é POSITIVO");
		} else {
			System.out.println("O numero " + numero + " é NEGATIVO");
		}
	}

}
