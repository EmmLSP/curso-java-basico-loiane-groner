package com.loiane.javabasico.aula17.labs;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o n-ésimo termo da serie de fibonacci:");
		int n = scan.nextInt();
		
		int primeiro = 1;
		int segundo = 1;
		int proximo = 0;
		
		System.out.print(primeiro + " " + segundo + " ");

		for (int i = 3; i <= n; i++) {
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;
			System.out.print(proximo + " ");
		}
	}

}
