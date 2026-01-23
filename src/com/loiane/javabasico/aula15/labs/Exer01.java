package com.loiane.javabasico.aula15.labs;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro numero:");
		int num1 = scan.nextInt();
		System.out.println("Entre com o segundo numero:");
		int num2 = scan.nextInt();
		
		if (num1 > num2) {
			System.out.println("O num1 é maior = " + num1);
		} else if (num2 > num1) {
			System.out.println("O num2 é maior = " + num2);
		} else {
			System.out.println("Os dois numeros sao iguais");
		}
	}

}
