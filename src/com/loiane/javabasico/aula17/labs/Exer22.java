package com.loiane.javabasico.aula17.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer22 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o numero de CDs:");
		int qtdCDs = scan.nextInt();
		
		double preco;
		double total = 0;
		
		for (int i = 0; i < qtdCDs; i++) {
			System.out.println("Iforme o valor do CD " + (i + 1));
			preco = scan.nextDouble();
			total += preco;
		}
		double media = total / qtdCDs;
		
		System.out.println("Valor total investido: R$ " + total);
		System.out.println("Media gasta em cada CD: R$ " + media);
	}

}
