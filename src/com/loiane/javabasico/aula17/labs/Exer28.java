package com.loiane.javabasico.aula17.labs;

import java.util.Scanner;

public class Exer28 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um numero:");
		int num = scan.nextInt();
		
		int primo = 0;
		
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				primo++;
				System.out.println(num + " divisivel por: " + i);
			}
		}
		if (primo == 2) {
			System.out.println("Numero primo");
		} else {
			System.out.println("Nao é numero primo");
		}
	}

}
