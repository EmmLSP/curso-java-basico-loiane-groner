package com.loiane.javabasico.aula17.labs;

import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um numero:");
		int num = scan.nextInt();
		
		boolean primo = true;
		
		if (num < 2) {
			primo = false;
		}
		
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				primo = false;
				break;
			}
		}
		
		if (primo) {
			System.out.println(num + " é PRIMO");
		} else {
			System.out.println(num + " NAO é PRIMO");
		}
	}

}
