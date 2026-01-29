package com.loiane.javabasico.aula18;

import java.util.Scanner;

public class BreaAndContinue {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com um numero:");
		int num = scan.nextInt();

		System.out.println("Entre com um limite:");
		int limite = scan.nextInt();

		// utilizacao do break para sair de for
		for (int i = num; i <= limite; i++) {
			System.out.println(i);
			if (i % 7 == 0) {
				System.out.println("O valor de i é: " + i);
				break;
			}
		}

		// break com rotulos - goto

		for (int i = 0; i < 4; i++) {
			rotulo1: {
				rotulo2: {
					rotulo3: {
						if (i == 1) {
							break rotulo1;
						}
						if (i == 2) {
							break rotulo2;
						}
						if (i == 3) {
							break rotulo3;
						}
						System.out.println("rotulo3");
					}
					System.out.println("rotulo2");
				}
				System.out.println("rotulo1");
			}
			System.out.println("valor de i: " + i);
		}
		System.out.println("Saiu do loop");
		
		
		System.out.println("Entre com um numero:");
		num = scan.nextInt();

		System.out.println("Entre com um limite:");
		limite = scan.nextInt();

		// utilizacao do continue loop for
		for (int i = num; i <= limite; i++) {
			if (i % 7 == 0) {
				continue;
			}
			System.out.println("O valor de i é: " + i);
		}
	}

}
