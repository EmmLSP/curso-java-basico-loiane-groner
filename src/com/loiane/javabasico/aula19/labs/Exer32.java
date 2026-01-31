package com.loiane.javabasico.aula19.labs;

import java.util.Scanner;

public class Exer32 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor da posicao " + i);
			vetorA[i] = scan.nextInt();
			// vetorA[i] = (int) Math.round(Math.random() * 100);
		}
		
		boolean primo;
		String msg = "";
		for (int i = 0; i < vetorA.length; i++) {
			primo = true;
			if (vetorA[i] < 2) {
				primo = false;
			}
			for (int j = 2; j < vetorA[i]; j++) {
				if (vetorA[i] % j == 0) {
					primo = false;
					break;
				}
			}
			if (primo) {
				msg = " - primo";
			} else {
				msg = " - nao é primo";
			}
			System.out.println(vetorA[i] + msg);
		}
		System.out.println();
	}

}
