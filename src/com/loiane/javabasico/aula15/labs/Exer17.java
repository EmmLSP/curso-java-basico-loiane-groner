package com.loiane.javabasico.aula15.labs;

import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o ano:");
		int ano = scan.nextInt();
		
		// 2000 - bissexto
		// 1900 - nao e bissexto
		// 2016 - bissexto
		
		if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
			System.out.println(ano + " é BISSEXTO");
		} else {
			System.out.println(ano + " NAO é BISSEXTO");
		}
	}

}
