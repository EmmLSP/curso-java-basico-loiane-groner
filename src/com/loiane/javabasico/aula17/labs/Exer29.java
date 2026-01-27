package com.loiane.javabasico.aula17.labs;

import java.util.Scanner;

public class Exer29 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um numero para gerar primos:");
		int num = scan.nextInt();
		
		// sempre que possivel declarar variaveis fora do loop
		boolean primo;
		
		System.out.println("Primos no intervalo entre 1 e " + num);
		
		for (int i = 1; i <= num; i++) {
			primo = true;
			if (i == 1) {
				primo = false;
			}
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					primo = false;
				}
			}
			if (primo) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

}
