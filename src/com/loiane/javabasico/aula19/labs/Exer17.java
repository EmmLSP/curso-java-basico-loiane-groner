package com.loiane.javabasico.aula19.labs;

import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] idades = new int[10];
		
		for (int i = 0; i < idades.length; i++) {
			System.out.println("Entre com a idade da pessoa " + (i+1));
			idades[i] = scan.nextInt(); 
		}
		
		int maiores35 = 0;
		for (int i = 0; i < idades.length; i++) {
			if (idades[i] > 35) {
				maiores35++;
			}
		}
		
		System.out.print("Idades =");
		for (int i = 0; i < idades.length; i++) {
			System.out.print(idades[i] + " ");
		}
		System.out.println();
		
		System.out.println("Quantidade de pessoas maiores de 35 anos: " + maiores35);
	}

}
