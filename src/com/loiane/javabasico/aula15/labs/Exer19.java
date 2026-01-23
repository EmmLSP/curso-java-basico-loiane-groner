package com.loiane.javabasico.aula15.labs;

import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro numero:");
		int num1 = scan.nextInt();
		System.out.println("Entre com o segundo numero:");
		int num2 = scan.nextInt();
		System.out.println("Entre com a operacao [+ - / *]:");
		String operacao = scan.next();

		boolean valida = true;
		double resultado = 0;
		switch(operacao) {
		case "+":
			resultado = num1 + num2; 
			break;
		case "-":
			resultado = num1 - num2; 
			break;
		case "/":
			double num1_d = (double) num1;
			double num2_d = (double) num2;
			resultado = num1_d / num2_d; 
			break;
		case "*":
			resultado = num1 * num2; 
			break;
		default:
			System.out.println("Operacao invalida!");
			valida = false;
		}
		
		if (valida) {
			System.out.println(num1 + " " + operacao + " " + num2 + " = " + resultado);
			
			if (resultado >= 0) {
				System.out.println("Resultado é POSITIVO");
			} else {
				System.out.println("Resultado é NEGATIVO");
			}
			
			if (resultado % 2 == 0) {
				System.out.println("Resultado é PAR");
			} else {
				System.out.println("Resultado é IMPAR");
			}
		}
	}

}
