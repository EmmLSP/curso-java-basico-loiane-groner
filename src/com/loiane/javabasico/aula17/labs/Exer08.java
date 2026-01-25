package com.loiane.javabasico.aula17.labs;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num;
		int soma = 0;
		double media;
		String conta = "";
		String numeros = "";
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Entre com o " + (i + 1) + " numero:");
			num = scan.nextInt();
			soma += num;
			if (i < 4) {
				conta += num + " + ";
			} else {
				conta += num + " = ";
			}
		}
		media = soma / 5;
		
		System.out.println(conta + soma);
		System.out.println("Soma: " + soma);
		System.out.println("Media: " + media);
	}

}
