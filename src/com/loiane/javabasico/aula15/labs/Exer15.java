package com.loiane.javabasico.aula15.labs;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o lado 1:");
		int lado1 = scan.nextInt();
		System.out.println("Entre com o lado 2:");
		int lado2 = scan.nextInt();
		System.out.println("Entre com o lado 3:");
		int lado3 = scan.nextInt();
		
		System.out.println(lado1 + " | " + lado2 + " | " + lado3);
		
		if ((lado1 < (lado2 + lado3)) && (lado2 < (lado1 + lado3)) && (lado3 < (lado1 + lado2))) {
			if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
				System.out.println("Triangulo Equilatero");
			} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
				System.out.println("Triangulo Isosceles");
			} else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
				System.out.println("Triangulo Escaleno");
			}	
		} else {
			System.out.println("Não forma um triangulo");
		}
	}

}
